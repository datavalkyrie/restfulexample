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
public class InstrumentPanel {
    
    private String turnSignal;
    private Boolean wipers;
    private String lights;
    private Integer seatBeltCount;
    private Double outsideTemp;

    public String getTurnSignal() {
        return turnSignal;
    }

    public void setTurnSignal(String turnSignal) {
        this.turnSignal = turnSignal;
    }

    public Boolean getWipers() {
        return wipers;
    }

    public void setWipers(Boolean wipers) {
        this.wipers = wipers;
    }

    public String getLights() {
        return lights;
    }

    public void setLights(String lights) {
        this.lights = lights;
    }

    public Integer getSeatBeltCount() {
        return seatBeltCount;
    }

    public void setSeatBeltCount(Integer seatBeltCount) {
        this.seatBeltCount = seatBeltCount;
    }

    public Double getOutsideTemp() {
        return outsideTemp;
    }

    public void setOutsideTemp(Double outsideTemp) {
        this.outsideTemp = outsideTemp;
    }

    @Override
    public String toString() {
        return "InstrumentPanel{" + "turnSignal=" + turnSignal + ", wipers=" + wipers + ", lights=" + lights + ", seatBeltCount=" + seatBeltCount + ", outsideTemp=" + outsideTemp + '}';
    }

    
    
}
