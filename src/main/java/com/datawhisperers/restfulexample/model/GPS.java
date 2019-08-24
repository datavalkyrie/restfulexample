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
public class GPS {
    private Position gpsRawPosition;
    private Position gpsMapMatchPosition;

    public Position getGpsRawPosition() {
        return gpsRawPosition;
    }

    public void setGpsRawPosition(Position gpsRawPosition) {
        this.gpsRawPosition = gpsRawPosition;
    }

    public Position getGpsMapMatchPosition() {
        return gpsMapMatchPosition;
    }

    public void setGpsMapMatchPosition(Position gpsMapMatchPosition) {
        this.gpsMapMatchPosition = gpsMapMatchPosition;
    }

    @Override
    public String toString() {
        return "GPS{" + "gpsRawPosition=" + gpsRawPosition + ", gpsMapMatchPosition=" + gpsMapMatchPosition + '}';
    }
    
}
