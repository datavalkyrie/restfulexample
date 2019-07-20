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
    private Integer timestampEpoch;
    private Position position;
    private BigDecimal speed;
    private BigDecimal direction;
    private String vehicleType;
    private String accuracy;
    private String activityType;
    private String transportMode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTimestampEpoch() {
        return timestampEpoch;
    }

    public void setTimestampEpoch(Integer timestampEpoch) {
        this.timestampEpoch = timestampEpoch;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    public BigDecimal getDirection() {
        return direction;
    }

    public void setDirection(BigDecimal direction) {
        this.direction = direction;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(String accuracy) {
        this.accuracy = accuracy;
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

    @Override
    public String toString() {
        return "OEMVehicleData{" + "id=" + id + ", timestampEpoch=" + timestampEpoch + ", position=" + position + ", speed=" + speed + ", direction=" + direction + ", vehicleType=" + vehicleType + ", accuracy=" + accuracy + ", activityType=" + activityType + ", transportMode=" + transportMode + '}';
    }


    
    
}
