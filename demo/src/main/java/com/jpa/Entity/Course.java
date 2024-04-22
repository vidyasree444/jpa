package com.jpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Course")
public class Course {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cour_id")
     private int cour_id;

     @Column(name="cust_title")
    private String cust_title;

    @Column(name="cust_fee")
    private String cust_fee;

    @Embedded
    private CLocations cust_loca;

    public Course() {
    }

    public Course(int cour_id, String cust_title, String cust_fee, CLocations cust_loca) {
        this.cour_id = cour_id;
        this.cust_title = cust_title;
        this.cust_fee = cust_fee;
        this.cust_loca = cust_loca;
    }

    public int getCour_id() {
        return cour_id;
    }

    public void setCour_id(int cour_id) {
        this.cour_id = cour_id;
    }

    public String getCust_title() {
        return cust_title;
    }

    public void setCust_title(String cust_title) {
        this.cust_title = cust_title;
    }

    public String getCust_fee() {
        return cust_fee;
    }

    public void setCust_fee(String cust_fee) {
        this.cust_fee = cust_fee;
    }

    public CLocations getCust_loca() {
        return cust_loca;
    }

    public void setCust_loca(CLocations cust_loca) {
        this.cust_loca = cust_loca;
    }

    @Override
    public String toString() {
        return "Course [cour_id=" + cour_id + ", cust_title=" + cust_title + ", cust_fee=" + cust_fee + ", cust_loca="
                + cust_loca + "]";
    }

    


  

    
}
