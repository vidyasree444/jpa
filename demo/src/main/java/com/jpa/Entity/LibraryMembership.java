package com.jpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class LibraryMembership {
    private int stor_id;
    private String mem_tpe;
    private int srt_date;
   
    @OneToOne
    @JoinColumn(name ="id")
    private Employee employee;

    public LibraryMembership() {
    }

    public LibraryMembership(int stor_id, String mem_tpe, int srt_date, Employee employee) {
        this.stor_id = stor_id;
        this.mem_tpe = mem_tpe;
        this.srt_date = srt_date;
        this.employee = employee;
    }

    public int getStor_id() {
        return stor_id;
    }

    public void setStor_id(int stor_id) {
        this.stor_id = stor_id;
    }

    public String getMem_tpe() {
        return mem_tpe;
    }

    public void setMem_tpe(String mem_tpe) {
        this.mem_tpe = mem_tpe;
    }

    public int getSrt_date() {
        return srt_date;
    }

    public void setSrt_date(int srt_date) {
        this.srt_date = srt_date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "LibraryMembership [stor_id=" + stor_id + ", mem_tpe=" + mem_tpe + ", srt_date=" + srt_date
                + ", employee=" + employee + "]";
    }

    
}
