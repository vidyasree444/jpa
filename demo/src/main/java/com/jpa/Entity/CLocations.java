package com.jpa.Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class CLocations {
    
    private String institutename;
    private String address;
    private String city;
    public CLocations() {
    }
    public CLocations(String institutename, String address, String city) {
        this.institutename = institutename;
        this.address = address;
        this.city = city;
    }
    public String getInstitutename() {
        return institutename;
    }
    public void setInstitutename(String institutename) {
        this.institutename = institutename;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }







    
    
}
