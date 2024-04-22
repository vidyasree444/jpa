package com.jpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Saless {
    @Id
    private int sale_id;
    private int ord_num;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    public Saless() {
    }

    public Saless(int sale_id, int ord_num, Products product) {
        this.sale_id = sale_id;
        this.ord_num = ord_num;
        this.product = product;
    }

    public int getSale_id() {
        return sale_id;
    }

    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }

    public int getOrd_num() {
        return ord_num;
    }

    public void setOrd_num(int ord_num) {
        this.ord_num = ord_num;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Sales [sale_id=" + sale_id + ", ord_num=" + ord_num + ", product=" + product + "]";
    }

    

    
    
}
