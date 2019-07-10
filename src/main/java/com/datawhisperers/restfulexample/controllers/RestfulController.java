/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datawhisperers.restfulexample.controllers;

import com.datawhisperers.restfulexample.avromodel.OEMVehicleDataAvro;
import com.datawhisperers.restfulexample.avromodel.PositionAvro;
import com.datawhisperers.restfulexample.model.Car;
import com.datawhisperers.restfulexample.model.Hello;
import com.datawhisperers.restfulexample.model.OEMVehicleData;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.serializers.KafkaAvroSerializer;
import io.swagger.annotations.Api;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.kafka.support.serializer.JsonSerializer;

@RestController
@RequestMapping("/restful-test")
@Api(value = "db connection rest", description = "Operations pertaining to products in Online Store")
public class RestfulController {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(RestfulController.class);

    @Autowired
    //GenericDataService genericDataService;

    GsonBuilder gsonBuilder = new GsonBuilder();

    //@GetMapping("test/{name}")
    @RequestMapping(method = RequestMethod.GET, path = "test/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String helloThere(@PathVariable String name,
            @RequestParam(value = "location") String location) {

        long starttime = System.currentTimeMillis();
        LOG.info("RestfulController.helloThere() Start: " + starttime);

        Hello hello = new Hello();
        hello.setName(name);
        hello.setLocation(location);

        Gson gson = gsonBuilder.setPrettyPrinting().create();

        long endtime = System.currentTimeMillis() - starttime;
        LOG.info("RestfulController.helloThere() End: " + endtime);

        return gson.toJson(hello);
    }

    @RequestMapping(method = RequestMethod.POST, path = "carData/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void postCarData(@RequestBody Car[] cars) {

        long starttime = System.currentTimeMillis();
        LOG.info("RestfulController.postCarData() Start: " + starttime);

        for (Car car : cars) {
            LOG.info("car:" + car);
        }
        long endtime = System.currentTimeMillis() - starttime;
        LOG.info("RestfulController.postCarData() End: " + endtime);
        //return "";OEMVehicleData
    }

    @RequestMapping(method = RequestMethod.POST, path = "oemVehicleData/", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void postOEMVehicleData(@RequestBody OEMVehicleData[] oemVehicleDataArray) {

        long starttime = System.currentTimeMillis();
        LOG.info("RestfulController.postOEMVehicleData() Start: " + starttime);
        LOG.info("oemVehicleDataArray size: " + oemVehicleDataArray.length);

        for (OEMVehicleData oemVehicleData : oemVehicleDataArray) {
            UUID uuid = UUID.randomUUID();
            oemVehicleData.setId(uuid.toString());
            LOG.info("oemVehicleData:" + oemVehicleData);
        }

        //sendOEMVehicleData(oemVehicleDataArray);
        for (OEMVehicleData oemVehicleData : oemVehicleDataArray) {
            LOG.info("oemVehicleData:" + oemVehicleData);
        }

        long endtime = System.currentTimeMillis() - starttime;
        LOG.info("RestfulController.postOEMVehicleData() End: " + endtime);
        //return "";
    }

    private void sendOEMVehicleData(OEMVehicleData[] oemVehicleDataArray) {
        long starttime = System.currentTimeMillis();
        LOG.info("RestfulController.sendOEMVehicleData() Start: " + starttime);
        LOG.info("oemVehicleDataArray size: " + oemVehicleDataArray.length);

        final Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(ProducerConfig.ACKS_CONFIG, "all");
        props.put(ProducerConfig.RETRIES_CONFIG, 0);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        //props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, KafkaAvroSerializer.class);
        //props.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://localhost:8081");

        try (KafkaProducer<String, OEMVehicleData> producer = new KafkaProducer<String, OEMVehicleData>(props)) {
            for (OEMVehicleData oemVehicleData : oemVehicleDataArray) {
                LOG.info("oemVehicleData:" + oemVehicleData);
                UUID uuid = UUID.randomUUID();
                oemVehicleData.setId(uuid.toString());
                OEMVehicleDataAvro oemVehicleDataAvro = new OEMVehicleDataAvro();
                PositionAvro positionAvro = new PositionAvro();
                oemVehicleDataAvro.setAccuracy(oemVehicleData.getAccuracy());
                oemVehicleDataAvro.setDirection(oemVehicleData.getDirection());
                oemVehicleDataAvro.setActivityType(oemVehicleData.getActivityType());
                oemVehicleDataAvro.setId(oemVehicleData.getId());
                oemVehicleDataAvro.setSpeed(oemVehicleData.getSpeed());
                oemVehicleDataAvro.setTimestampEpoch(oemVehicleData.getTimestampEpoch());
                oemVehicleDataAvro.setVehicleType(oemVehicleData.getVehicleType());
                positionAvro.setLat(oemVehicleData.getPosition().getLat());
                positionAvro.setLon(oemVehicleData.getPosition().getLon());
                oemVehicleDataAvro.setPosition(positionAvro);

                LOG.info("oemVehicleDataAvro:" + oemVehicleDataAvro);
                ProducerRecord<String, OEMVehicleData> record = new ProducerRecord<String, OEMVehicleData>("test-restful", oemVehicleDataAvro.getId().toString(), oemVehicleData);
                producer.send(record);
            }
            producer.flush();
        } catch (final SerializationException e) {
            e.printStackTrace();
        }

    }

}
