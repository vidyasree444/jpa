package com.jpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cust_id")
    private int cust_id;

    @Column(name="cust_email")
    private String cust_email;

    @Column(name="cust_name")
    private String cust_name;

    @Column(name="cust_mobile")
    private int cust_mobile;

    public Customer() {
    }

    

    public Customer(int cust_id, String cust_email, String cust_name, int cust_mobile) {
        this.cust_id = cust_id;
        this.cust_email = cust_email;
        this.cust_name = cust_name;
        this.cust_mobile = cust_mobile;
    }



    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public int getCust_mobile() {
        return cust_mobile;
    }

    public void setCust_mobile(int cust_mobile) {
        this.cust_mobile = cust_mobile;
    }
}
