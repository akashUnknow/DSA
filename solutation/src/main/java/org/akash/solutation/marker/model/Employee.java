package main.java.org.akash.solutation.marker.model;

import main.java.org.akash.solutation.marker.marker.CloneableMarker;
import main.java.org.akash.solutation.marker.marker.SerializableMarker;

public class Employee implements SerializableMarker, CloneableMarker {
    public int id;

    public Employee(int id) {
        this.id = id;
    }
}
