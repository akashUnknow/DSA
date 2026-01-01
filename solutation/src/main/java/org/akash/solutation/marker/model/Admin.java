package main.java.org.akash.solutation.marker.model;

import main.java.org.akash.solutation.marker.marker.SecureMarker;

public class Admin implements SecureMarker {
    public String role;

    public Admin(String role) {
        this.role = role;
    }
}
