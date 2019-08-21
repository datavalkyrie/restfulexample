DROP TABLE
    oem_vehicle_data;
CREATE TABLE
    oem_vehicle_data
    (
        id CHARACTER VARYING(100) ,
        activitytype CHARACTER VARYING(30) ,
        magneticnorth NUMERIC(30 ,10) ,
        truenorth NUMERIC(30 ,10) ,
        fuletype CHARACTER VARYING(30) ,
        gps_map_match_lat NUMERIC(30 ,10) ,
        gps_map_match_lon NUMERIC(30 ,10) ,
        gps_map_match_sats_acq INTEGER ,
        gps_raw_lat NUMERIC(30 ,10) ,
        gps_raw_lon NUMERIC(30 ,10) ,
        gps_raw_sats_acq INTEGER ,
        instrument_panel_lights CHARACTER VARYING(30) ,
        instrument_panel_outsidetemp NUMERIC(30 ,10) ,
        instrument_panel_seatbeltcount INTEGER ,
        instrument_panel_turnsignal CHARACTER VARYING(30) ,
        instrument_panel_wipers BOOLEAN ,
        speed_acceleration NUMERIC(30 ,10) ,
        speed_deceleration NUMERIC(30 ,10) ,
        speed_engine NUMERIC(30 ,10) ,
        speed_gps NUMERIC(30 ,10) ,
        speed_wheels_back_left NUMERIC(30 ,10) ,
        speed_wheels_back_right NUMERIC(30 ,10) ,
        speed_wheels_front_left NUMERIC(30 ,10) ,
        speed_wheels_front_right NUMERIC(30 ,10) ,
        timestampepoch_car BIGINT ,
        timestampepoch_gps BIGINT ,
        timestampepoch_received BIGINT ,
        transportmode CHARACTER VARYING(30) ,
        vehicletype CHARACTER VARYING(30)
    ) ;
CREATE UNIQUE INDEX
    oem_vehicle_data_pk
ON
    oem_vehicle_data
USING
    btree
    (
        id
    ) ;
