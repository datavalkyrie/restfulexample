/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datawhisperers.restfulexample.dataaccess;

import com.datawhisperers.restfulexample.model.OEMVehicleData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author steveo
 */
@Repository
public class OEMVehicleDataDAOImpl implements OEMVehicleDataDAO {
    
    private final String addOEMVehicleDataSql = "INSERT INTO oem_vehicle_data (id,"
                + " activitytype,"
                + " magneticnorth,"
                + " truenorth,"
                + " fuletype,"
                + " gps_map_match_lat,"
                + " gps_map_match_lon,"
                + " gps_map_match_sats_acq,"
                + " gps_raw_lat,"
                + " gps_raw_lon,"
                + " gps_raw_sats_acq,"
                + " instrument_panel_lights,"
                + " instrument_panel_outsidetemp,"
                + " instrument_panel_seatbeltcount,"
                + " instrument_panel_turnsignal,"
                + " instrument_panel_wipers,"
                + " speed_acceleration,"
                + " speed_deceleration,"
                + " speed_engine,"
                + " speed_gps,"
                + " speed_wheels_back_left,"
                + " speed_wheels_back_right,"
                + " speed_wheels_front_left,"
                + " speed_wheels_front_right,"
                + " timestampepoch_car,"
                + " timestampepoch_gps,"
                + " timestampepoch_received,"
                + " transportmode,"
                + " vehicletype) VALUES (?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?,"
                + " ?)";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addOEMVehicleData(OEMVehicleData oemVehicleData) {
        
        //String sql = "INSERT INTO oem_vehicle_data (id) VALUES (?)";
        jdbcTemplate.update(addOEMVehicleDataSql,
                oemVehicleData.getId(),
                oemVehicleData.getActivityType(),
                oemVehicleData.getDirection().getMagneticNorth(),
                oemVehicleData.getDirection().getTrueNorth(),
                oemVehicleData.getFuleType(),
                oemVehicleData.getGps().getGpsMapMatchPosition().getLat(),
                oemVehicleData.getGps().getGpsMapMatchPosition().getLon(),
                oemVehicleData.getGps().getGpsMapMatchPosition().getNumberOfSatellitesAcquired(),
                oemVehicleData.getGps().getGpsRawPosition().getLat(),
                oemVehicleData.getGps().getGpsRawPosition().getLon(),
                oemVehicleData.getGps().getGpsRawPosition().getNumberOfSatellitesAcquired(),
                oemVehicleData.getInstrumentPanel().getLights(),
                oemVehicleData.getInstrumentPanel().getOutsideTemp(),
                oemVehicleData.getInstrumentPanel().getSeatBeltCount(),
                oemVehicleData.getInstrumentPanel().getTurnSignal(),
                oemVehicleData.getInstrumentPanel().getWipers(),
                oemVehicleData.getSpeed().getAcceleration(),
                oemVehicleData.getSpeed().getDeceleration(),
                oemVehicleData.getSpeed().getEngine(),
                oemVehicleData.getSpeed().getGps(),
                oemVehicleData.getSpeed().getWheels().getBackLeft(),
                oemVehicleData.getSpeed().getWheels().getBackRight(),
                oemVehicleData.getSpeed().getWheels().getFrontLeft(),
                oemVehicleData.getSpeed().getWheels().getFrontRight(),
                oemVehicleData.getTimestampEpoch().getCar(),
                oemVehicleData.getTimestampEpoch().getGps(),
                oemVehicleData.getTimestampEpoch().getReceived(),
                oemVehicleData.getTransportMode(),
                oemVehicleData.getVehicleType());
        
    }

}
