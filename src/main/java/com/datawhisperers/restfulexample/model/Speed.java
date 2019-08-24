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
public class Speed {

    private BigDecimal engine;
    private Wheels wheels;
    private BigDecimal gps;
    private BigDecimal acceleration;
    private BigDecimal deceleration;

    public BigDecimal getEngine() {
        return engine;
    }

    public void setEngine(BigDecimal engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public BigDecimal getGps() {
        return gps;
    }

    public void setGps(BigDecimal gps) {
        this.gps = gps;
    }

    public BigDecimal getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(BigDecimal acceleration) {
        this.acceleration = acceleration;
    }

    public BigDecimal getDeceleration() {
        return deceleration;
    }

    public void setDeceleration(BigDecimal deceleration) {
        this.deceleration = deceleration;
    }

    @Override
    public String toString() {
        return "Speed{" + "engine=" + engine + ", wheels=" + wheels + ", gps=" + gps + ", acceleration=" + acceleration + ", deceleration=" + deceleration + '}';
    }

}
