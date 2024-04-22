package com.jpa.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
    @Id
    private int id;
    private String name;

    @OneToOne(mappedBy ="employee",cascade = CascadeType.ALL)
    private LibraryMembership lm;

    public Employee() {
    }

    public Employee(int id, String name,LibraryMembership lm) {
        this.id = id;
        this.name = name;
        this.lm = lm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LibraryMembership getLm() {
        return lm;
    }

    public void setLm(LibraryMembership lm) {
        this.lm = lm;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", lm=" + lm + "]";
    }

    
}
