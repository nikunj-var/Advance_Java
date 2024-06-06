package com.cetpa;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
       session.save(new TeachingStaff(101,"Rahul","Noida","1212","MCA","JAVA"));
       session.save(new TeachingStaff(102,"Rahul","Noida","1212","MCA","JAVA"));
       session.save(new TeachingStaff(103,"Rahul","Noida","1212","MCA","JAVA"));
       session.save(new TeachingStaff(104,"Rahul","Noida","1212","MCA","JAVA"));
       session.save(new NonTeaching(105,"Rahul","Noida","1212","Sweeper"));
       session.save(new NonTeaching(110,"Rahul","Noida","1212","Sweeper"));
       session.save(new NonTeaching(109,"Rahul","Noida","1212","Sweeper"));
       session.save(new TeachingStaff(106,"Rahul","Noida","1212","MCA","JAVA"));
       session.save(new TeachingStaff(107,"Rahul","Noida","1212","MCA","JAVA"));
       session.save(new TeachingStaff(108,"Rahul","Noida","1212","MCA","JAVA"));
        transaction.commit();
    }
}
