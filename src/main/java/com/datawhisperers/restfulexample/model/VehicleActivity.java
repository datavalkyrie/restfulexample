/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datawhisperers.restfulexample.model;

/**
 *
 * @author steveo
 */
public class VehicleActivity {

    private String activityType;
    private String transportMode;

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
        return "Activity{" + "activityType=" + activityType + ", transportMode=" + transportMode + '}';
    }

}
