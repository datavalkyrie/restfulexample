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
public class Direction {
    private BigDecimal trueNorth;
    private BigDecimal magneticNorth;

    public BigDecimal getTrueNorth() {
        return trueNorth;
    }

    public void setTrueNorth(BigDecimal trueNorth) {
        this.trueNorth = trueNorth;
    }

    public BigDecimal getMagneticNorth() {
        return magneticNorth;
    }

    public void setMagneticNorth(BigDecimal magneticNorth) {
        this.magneticNorth = magneticNorth;
    }

    @Override
    public String toString() {
        return "Direction{" + "trueNorth=" + trueNorth + ", magneticNorth=" + magneticNorth + '}';
    }
}
