/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.datawhisperers.restfulexample.tools;
import java.math.BigInteger;
import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;
/**
 *
 * @author steveo
 */
public class AvroSchemaExtraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        Schema schema = ReflectData.get().getSchema(Class.forName("com.datawhisperers.restfulexample.model.OEMVehicleData"));
        System.out.println("extracted avro schema: " + schema.toString(true));
        
        System.out.println(System.currentTimeMillis()/1000);
    }
    
}
