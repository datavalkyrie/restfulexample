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
public class Position {

    private BigDecimal lat;
    private BigDecimal lon;
    private Integer numberOfSatellitesAcquired;

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLon() {
        return lon;
    }

    public void setLon(BigDecimal lon) {
        this.lon = lon;
    }

    public Integer getNumberOfSatellitesAcquired() {
        return numberOfSatellitesAcquired;
    }

    public void setNumberOfSatellitesAcquired(Integer numberOfSatellitesAcquired) {
        this.numberOfSatellitesAcquired = numberOfSatellitesAcquired;
    }

    @Override
    public String toString() {
        return "Position{" + "lat=" + lat + ", lon=" + lon + ", numberOfSatellitesAcquired=" + numberOfSatellitesAcquired + '}';
    }

}
