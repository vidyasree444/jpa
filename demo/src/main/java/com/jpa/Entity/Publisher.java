package com.jpa.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Publisher {
    @Id
    private int pub_id;

    private String pub_name;
    private String pub_city;

    @OneToMany(mappedBy ="publisher", cascade = CascadeType.ALL)
    private List<Title> titles;

    public Publisher() {
    }

    public Publisher(int pub_id, String pub_name, String pub_city, List<Title> titles) {
        this.pub_id = pub_id;
        this.pub_name = pub_name;
        this.pub_city = pub_city;
        this.titles = titles;
    }

    public int getPub_id() {
        return pub_id;
    }

    public void setPub_id(int pub_id) {
        this.pub_id = pub_id;
    }

    public String getPub_name() {
        return pub_name;
    }

    public void setPub_name(String pub_name) {
        this.pub_name = pub_name;
    }

    public String getPub_city() {
        return pub_city;
    }

    public void setPub_city(String pub_city) {
        this.pub_city = pub_city;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "Publisher [pub_id=" + pub_id + ", pub_name=" + pub_name + ", pub_city=" + pub_city + ", titles="
                + titles + "]";
    }

    

}