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
public class Wheels {

    private BigDecimal frontRight;
    private BigDecimal frontLeft;
    private BigDecimal backRight;
    private BigDecimal backLeft;

    public BigDecimal getFrontRight() {
        return frontRight;
    }

    public void setFrontRight(BigDecimal frontRight) {
        this.frontRight = frontRight;
    }

    public BigDecimal getFrontLeft() {
        return frontLeft;
    }

    public void setFrontLeft(BigDecimal frontLeft) {
        this.frontLeft = frontLeft;
    }

    public BigDecimal getBackRight() {
        return backRight;
    }

    public void setBackRight(BigDecimal backRight) {
        this.backRight = backRight;
    }

    public BigDecimal getBackLeft() {
        return backLeft;
    }

    public void setBackLeft(BigDecimal backLeft) {
        this.backLeft = backLeft;
    }

    @Override
    public String toString() {
        return "Wheels{" + "frontRight=" + frontRight + ", frontLeft=" + frontLeft + ", backRight=" + backRight + ", backLeft=" + backLeft + '}';
    }

}
