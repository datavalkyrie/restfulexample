/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datawhisperers.restfulexample.controllers;

import com.datawhisperers.restfulexample.model.ErrorDetails;
import java.util.Date;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author steveo
 */
@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(CustomizedResponseEntityExceptionHandler.class);

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public final ResponseEntity<ErrorDetails> httpMessageNotReadableException(Exception ex, WebRequest request) {

        long starttime = System.currentTimeMillis();
        LOG.info("RestfulController.handleAllExceptions() Start: " + starttime);
        LOG.info("RestfulController.handleAllExceptions() Error: " + ex.getMessage());
        ex.printStackTrace();
        ErrorDetails errorDetails = new ErrorDetails(new Date(), "We got an error!",
                request.getDescription(false), HttpStatus.BAD_REQUEST.value());
        
        LOG.info("RestfulController.handleAllExceptions() ErrorDetails: " + errorDetails);

        long endtime = System.currentTimeMillis() - starttime;
        LOG.info("RestfulController.handleAllExceptions() End: " + endtime);
        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }

}
