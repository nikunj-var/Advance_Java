package com.cetpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction transaction = session.getTransaction();
       Person p1 = new Person(101,"Nikunj","Noida",20);
       Person p2 = new Person(102,"Fopal","bahjoi",22);
       Person p3 = new Person(103,"Lollu","Delhi",40);
       transaction.begin();
       session.save(new AadharCard(p1));
       session.save(new AadharCard(p2));
       session.save(new AadharCard(p3));
       transaction.commit();
    }
}
