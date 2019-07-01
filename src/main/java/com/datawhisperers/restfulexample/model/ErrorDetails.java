/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datawhisperers.restfulexample.model;

import java.util.Date;
import org.springframework.http.HttpStatus;

/**
 *
 * @author steveo
 */
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;
    private int status;

    public ErrorDetails(Date timestamp, String message, String details,int status) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.status = status;
        
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public int getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "ErrorDetails{" + "timestamp=" + timestamp + ", message=" + message + ", details=" + details + ", status=" + status + '}';
    }

    
    
    
}
