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
public class TimestampEpoch {

    private Long car;
    private Long gps;
    private Long received;

    public Long getCar() {
        return car;
    }

    public void setCar(Long car) {
        this.car = car;
    }

    public Long getGps() {
        return gps;
    }

    public void setGps(Long gps) {
        this.gps = gps;
    }

    public Long getReceived() {
        return received;
    }

    public void setReceived(Long received) {
        this.received = received;
    }

    @Override
    public String toString() {
        return "TimestampEpoch{" + "car=" + car + ", gps=" + gps + ", received=" + received + '}';
    }

    

}
