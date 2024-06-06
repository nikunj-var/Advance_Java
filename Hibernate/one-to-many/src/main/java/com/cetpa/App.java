package com.cetpa;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
       Session session = sessionFactory.openSession();
       Transaction transaction = session.getTransaction();
       transaction.begin();
       List<SimCard> list1 = new ArrayList<SimCard>();
       list1.add(new SimCard("7300558002","Airtel"));
       list1.add(new SimCard("7300558003","Jio"));
       list1.add(new SimCard("7300558004","Samsung"));
       Person person1 = new Person(1,"Amit Singh",list1);
       session.save(person1);
       List<SimCard> list2 = new ArrayList<SimCard>();
       list2.add(new SimCard("7300558002","Airtel"));
       list2.add(new SimCard("7300558003","Jio"));
       list2.add(new SimCard("7300558004","Samsung"));
       Person person2 = new Person(2,"Nikunj Singh",list2);
       session.save(person2);
       transaction.commit();
    }
}
