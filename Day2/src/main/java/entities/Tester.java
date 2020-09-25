package entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        Person p1 = new Person("Børge", 1989);
        Person p2 = new Person("Hubert", 1999);
        Person p3 = new Person("Else", 1962);

        Address a1 = new Address("Lars Tyndskids Markvej",9999,"Fucking nowhere");
        Address a2 = new Address("kedsomhedens Boulevard",1111,"spændingsløse");
        Address a3 = new Address("Boomergade", 4444, "boomerville");

        p1.setAddress(a1);
        p2.setAddress(a2);
        p3.setAddress(a3);

        Fee f1 = new Fee(100);
        Fee f2 = new Fee(333);
        Fee f3 = new Fee(666);

        p1.addFee(f1);
        p2.addFee(f2);
        p3.addFee(f3);

        SwimStyle s1 = new SwimStyle("Crawl");
        SwimStyle s2 = new SwimStyle("Butterfly");
        SwimStyle s3 = new SwimStyle("Breast stroke");

        p1.addSwimStyle(s1);
        p1.addSwimStyle(s3);
        p2.addSwimStyle(s2);
        p3.addSwimStyle(s2);
        p3.addSwimStyle(s3);

        //persist the persons, along with their info
        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();
        
        em.getTransaction().begin();
        p1.removeSwimStyle(s3);
        em.getTransaction().commit();

    }
}
