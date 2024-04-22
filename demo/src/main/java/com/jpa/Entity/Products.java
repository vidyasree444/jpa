package com.jpa.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    private String name;
    private int price;
    private String features;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<Saless> sales;
    
    public Products() {
    }

    public Products(int product_id, String name, int price, String features, List<Saless> sales) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.features = features;
        this.sales = sales;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    public List<Saless> getSales() {
        return sales;
    }

    public void setSales(List<Saless> sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Products [product_id=" + product_id + ", name=" + name + ", price=" + price + ", features=" + features
                + ", sales=" + sales + "]";
    }
    
}