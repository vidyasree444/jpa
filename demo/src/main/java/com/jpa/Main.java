package com.jpa;

import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

//import javax.tools.JavaFileManager.Location;

//import com.jpa.Entity.CLocations;
import com.jpa.Entity.Course;
//import com.jpa.Entity.Products;
//import com.jpa.Entity.Products;
//import com.jpa.Entity.Publisher;
//import com.jpa.Entity.Title;
import com.jpa.Entity.Saless;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MsSqlServer");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        //Products p2 = new Products(1, "product1", 100, "features1");
        /*Products p2=new Products();
        p2.setName("laptop");
        p2.setPrice(30000);
        p2.setFeatures("cheap and best");*/
        /*Title t=new Title();
        t.setTitlee("it ends with us");

    
        Publisher pb=new Publisher();
        pb.setPub_id(4);
        pb.setPub_city("vizag");
        pb.setPub_name("vidya");
       
        List<Title> titles = new ArrayList<>();
        titles.add(t);
        pb.setTitles(titles);
        */


        //em.persist(pb);
        /*CLocations cl=new CLocations("XYZ Institute", "123 Street", "City XYZ");
       


        Course c=new Course();
        c.setCust_fee("30000");
        c.setCust_title("cse");
        c.setCust_loca(cl);

      
        em.persist(c);*/
       // List<Course> courses = em.createQuery("SELECT c FROM Course c", Course.class).getResultList();

        // Print the retrieved courses
        //for (Course course : courses) {
          //  System.out.println(course);
        //}
        Saless s=new Saless();
        s.setOrd_num(2);
        s.setSale_id(10);
        s.se
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}