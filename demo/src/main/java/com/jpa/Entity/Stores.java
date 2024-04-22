package com.jpa.Entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="STORESS")
public class Stores {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="stor_id")

  private int stor_id;
 
  @Column(name="stor_name")
  
  private String stor_name;

  @Column(name="stor_address")
  
  private String stor_address;

  @Column(name="city")
  
  private String city;

  @Column(name="state")
  
  private String state;

  @Column(name="zip")
  
  private String zip;

//constructor
public Stores() {
}


  public Stores(int stor_id, String stor_name, String stor_address, String city, String state, String zip) {
    this.stor_id = stor_id;
    this.stor_name = stor_name;
    this.stor_address = stor_address;
    this.city = city;
    this.state = state;
    this.zip = zip;
}

//getters and setters


public int getStor_id() {
    return stor_id;
}

public void setStor_id(int stor_id) {
    this.stor_id = stor_id;
}

public String getStor_name() {
    return stor_name;
}

public void setStor_name(String stor_name) {
    this.stor_name = stor_name;
}

public String getStor_address() {
    return stor_address;
}

public void setStor_address(String stor_address) {
    this.stor_address = stor_address;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}

public String getState() {
    return state;
}

public void setState(String state) {
    this.state = state;
}

public String getZip() {
    return zip;
}

public void setZip(String zip) {
    this.zip = zip;
}
}

