/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datawhisperers.restfulexample.controllers;

import com.datawhisperers.restfulexample.avromodel.DirectionAvro;
import com.datawhisperers.restfulexample.avromodel.GPSAvro;
import com.datawhisperers.restfulexample.avromodel.OEMVehicleDataAvro;
import com.datawhisperers.restfulexample.avromodel.PositionAvro;
import com.datawhisperers.restfulexample.avromodel.SpeedAvro;
import com.datawhisperers.restfulexample.avromodel.TimestampEpochAvro;
import com.datawhisperers.restfulexample.avromodel.WheelsAvro;
import com.datawhisperers.restfulexample.dataaccess.OEMVehicleDataDAOImpl;
import com.datawhisperers.restfulexample.model.OEMVehicleData;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import java.util.Properties;
import java.util.UUID;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.support.serializer.JsonSerializer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/v1/cloud-collector")
@Api(value = "My Swagger Resource")
@SwaggerDefinition(tags = { @Tag(name = "My Swagger Resource", description = "Meaningful stuff in here") })
public class CloudCollectorController {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(CloudCollectorController.class);

    @Autowired
    OEMVehicleDataDAOImpl oemVehicleDataDAOImpl;

    @RequestMapping(method = RequestMethod.POST, path = "addVehicleStatus/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void addVehicleStatus(@RequestBody OEMVehicleData[] oemVehicleDataArray) {

        long starttime = System.currentTimeMillis();
        LOG.info("CloudCollectorController.addVehicleStatus() Start: " + starttime);
        LOG.info("oemVehicleDataArray size: " + oemVehicleDataArray.length);

        for (OEMVehicleData oemVehicleData : oemVehicleDataArray) {
            UUID uuid = UUID.randomUUID();
            oemVehicleData.setId(uuid.toString());
            oemVehicleData.getTimestampEpoch().setReceived(System.currentTimeMillis());
            //LOG.info("oemVehicleData:" + oemVehicleData);
            oemVehicleDataDAOImpl.addOEMVehicleData(oemVehicleData);
        }

        //sendVehicleStatusData(oemVehicleDataArray);

        long endtime = System.currentTimeMillis() - starttime;
        LOG.info("CloudCollectorController.addVehicleStatus() End: " + endtime);
        //return "";
        
    }

    
    private void sendVehicleStatusData(OEMVehicleData[] oemVehicleDataArray) {
        long starttime = System.currentTimeMillis();
        LOG.info("CloudCollectorController.sendOEMVehicleData() Start: " + starttime);
        LOG.info("oemVehicleDataArray size: " + oemVehicleDataArray.length);

        final Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        //props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        //props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");

        try (KafkaProducer<String, OEMVehicleData> producer = new KafkaProducer<>(props)) {
            for (OEMVehicleData oemVehicleData : oemVehicleDataArray) {
                //LOG.info("oemVehicleData:" + oemVehicleData);
                
                OEMVehicleDataAvro oemVehicleDataAvro = new OEMVehicleDataAvro();
                PositionAvro gpsRawPositionAvro = new PositionAvro();
                PositionAvro gpsMapMatchPositionAvro = new PositionAvro();
                DirectionAvro directionAvro = new DirectionAvro();
                SpeedAvro speedAvro = new SpeedAvro();
                WheelsAvro wheelsAvro = new WheelsAvro();
                GPSAvro gpsAvro = new GPSAvro();
                TimestampEpochAvro timestampEpochAvro = new TimestampEpochAvro();
                
                oemVehicleDataAvro.setActivityType(oemVehicleData.getActivityType());
                oemVehicleDataAvro.setId(oemVehicleData.getId());
                oemVehicleDataAvro.setVehicleType(oemVehicleData.getVehicleType());
                oemVehicleDataAvro.setTransportMode(oemVehicleData.getTransportMode());
                oemVehicleDataAvro.setFuleType(oemVehicleData.getFuleType());
                
                directionAvro.setMagneticNorth(oemVehicleData.getDirection().getMagneticNorth());
                directionAvro.setTrueNorth(oemVehicleData.getDirection().getTrueNorth());
                oemVehicleDataAvro.setDirection(directionAvro);
                
                speedAvro.setEngine(oemVehicleData.getSpeed().getEngine());
                speedAvro.setGps(oemVehicleData.getSpeed().getGps());
                wheelsAvro.setFrontRight(oemVehicleData.getSpeed().getWheels().getFrontRight());
                wheelsAvro.setFrontLeft(oemVehicleData.getSpeed().getWheels().getFrontLeft());
                wheelsAvro.setBackRight(oemVehicleData.getSpeed().getWheels().getBackRight());
                wheelsAvro.setBackLeft(oemVehicleData.getSpeed().getWheels().getBackLeft());
                speedAvro.setWheels(wheelsAvro);
                oemVehicleDataAvro.setSpeed(speedAvro);
                
                timestampEpochAvro.setCar(oemVehicleData.getTimestampEpoch().getCar());
                timestampEpochAvro.setGps(oemVehicleData.getTimestampEpoch().getGps());
                timestampEpochAvro.setReceived(oemVehicleData.getTimestampEpoch().getReceived());
                LOG.info("oemVehicleData.getTimestampEpoch(): " + oemVehicleData.getTimestampEpoch());
                oemVehicleDataAvro.setTimestampEpoch(timestampEpochAvro);
                
                gpsRawPositionAvro.setLat(oemVehicleData.getGps().getGpsRawPosition().getLat());
                gpsRawPositionAvro.setLon(oemVehicleData.getGps().getGpsRawPosition().getLon());
                gpsRawPositionAvro.setNumberOfSatellitesAcquired(oemVehicleData.getGps().getGpsRawPosition().getNumberOfSatellitesAcquired());                
                gpsAvro.setGpsRawPosition(gpsRawPositionAvro);
                
                gpsMapMatchPositionAvro.setLat(oemVehicleData.getGps().getGpsMapMatchPosition().getLat());
                gpsMapMatchPositionAvro.setLon(oemVehicleData.getGps().getGpsMapMatchPosition().getLon());
                gpsMapMatchPositionAvro.setNumberOfSatellitesAcquired(oemVehicleData.getGps().getGpsMapMatchPosition().getNumberOfSatellitesAcquired());                
                gpsAvro.setGpsMapMatchPosition(gpsMapMatchPositionAvro);
                oemVehicleDataAvro.setGps(gpsAvro);

                LOG.info("oemVehicleDataAvro:" + oemVehicleDataAvro);

                ProducerRecord<String, OEMVehicleData> record = new ProducerRecord<>("vehicle-status-data", oemVehicleData.getId(), oemVehicleData);
                producer.send(record);
            }
            producer.flush();
        } catch (final SerializationException e) {
            LOG.debug("CloudCollectorController.sendOEMVehicleData() Error: ", e);
            
        }

    }


}
