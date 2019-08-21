/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datawhisperers.restfulexample.model;

import java.math.BigDecimal;

/**
 *
 * @author steveo
 */
public class OEMVehicleData {

    private String id;
    private TimestampEpoch timestampEpoch;
    private GPS gps;
    private Speed speed;
    private Direction direction;
    private String vehicleType;
    private String activityType;
    private String transportMode;
    private InstrumentPanel instrumentPanel;
    private String fuleType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TimestampEpoch getTimestampEpoch() {
        return timestampEpoch;
    }

    public void setTimestampEpoch(TimestampEpoch timestampEpoch) {
        this.timestampEpoch = timestampEpoch;
    }

    public GPS getGps() {
        return gps;
    }

    public void setGps(GPS gps) {
        this.gps = gps;
    }

    public Speed getSpeed() {
        return speed;
    }

    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public InstrumentPanel getInstrumentPanel() {
        return instrumentPanel;
    }

    public void setInstrumentPanel(InstrumentPanel instrumentPanel) {
        this.instrumentPanel = instrumentPanel;
    }

    public String getFuleType() {
        return fuleType;
    }

    public void setFuleType(String fuleType) {
        this.fuleType = fuleType;
    }

    @Override
    public String toString() {
        return "OEMVehicleData{" + "id=" + id + ", timestampEpoch=" + timestampEpoch + ", gps=" + gps + ", speed=" + speed + ", direction=" + direction + ", vehicleType=" + vehicleType + ", activityType=" + activityType + ", transportMode=" + transportMode + ", instrumentPanel=" + instrumentPanel + ", fuleType=" + fuleType + '}';
    }

}
