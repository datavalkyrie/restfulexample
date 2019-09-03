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
    private VehicleActivity vehicleActivity;
    private InstrumentPanel instrumentPanel;
    private VehicleInfo vehicleInfo;

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

    public InstrumentPanel getInstrumentPanel() {
        return instrumentPanel;
    }

    public void setInstrumentPanel(InstrumentPanel instrumentPanel) {
        this.instrumentPanel = instrumentPanel;
    }

    public VehicleActivity getVehicleActivity() {
        return vehicleActivity;
    }

    public void setVehicleActivity(VehicleActivity vehicleActivity) {
        this.vehicleActivity = vehicleActivity;
    }

    public VehicleInfo getVehicleInfo() {
        return vehicleInfo;
    }

    public void setVehicleInfo(VehicleInfo vehicleInfo) {
        this.vehicleInfo = vehicleInfo;
    }

    @Override
    public String toString() {
        return "OEMVehicleData{" + "id=" + id + ", timestampEpoch=" + timestampEpoch + ", gps=" + gps + ", speed=" + speed + ", direction=" + direction + ", vehicleActivity=" + vehicleActivity + ", instrumentPanel=" + instrumentPanel + ", vehicleInfo=" + vehicleInfo + '}';
    }

}
