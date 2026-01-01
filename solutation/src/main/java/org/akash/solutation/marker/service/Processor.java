package main.java.org.akash.solutation.marker.service;

import main.java.org.akash.solutation.marker.marker.CloneableMarker;
import main.java.org.akash.solutation.marker.marker.SecureMarker;
import main.java.org.akash.solutation.marker.marker.SerializableMarker;

import java.util.logging.Logger;

public class Processor {
    static Logger logger=Logger.getLogger(Processor.class.getName());

    public static void process(Object obj){
        if (obj instanceof SerializableMarker){
            System.out.println("Object can be serialized");
        }else {
            System.out.println("Object can Not be serialized");
        }

        if (obj instanceof CloneableMarker){
            System.out.println("Object can be Cloneable");
        }else {
            System.out.println("Object can Not be Cloneable");
        }

        if (obj instanceof SecureMarker){
            System.out.println("Object can be Secure");
        }else {
            System.out.println("normal access");
        }
        System.out.println("--------------------------------------------");
    }
}
