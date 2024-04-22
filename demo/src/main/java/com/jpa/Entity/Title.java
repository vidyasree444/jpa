package com.jpa.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="Title")
public class Title {
    @Id
    @Column(name = "title_id")
    private int title_id;

    private String titlee;
    
    @ManyToOne
   // @JoinColumn(name="pub_id")
    private Publisher publisher;

    public Title() {
    }

    public Title(int title_id, String titlee, Publisher publisher) {
        this.title_id = title_id;
        this.titlee = titlee;
        this.publisher = publisher;
    }

    public int getTitle_id() {
        return title_id;
    }

    public void setTitle_id(int title_id) {
        this.title_id = title_id;
    }

    public String getTitlee() {
        return titlee;
    }

    public void setTitlee(String titlee) {
        this.titlee = titlee;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Title [title_id=" + title_id + ", titlee=" + titlee + ", publisher=" + publisher + "]";
    }
    

}