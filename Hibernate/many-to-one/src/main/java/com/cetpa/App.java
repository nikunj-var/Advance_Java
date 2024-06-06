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
        Department dept1 = new Department("Sales","Ravi");
        Department dept2 = new Department("Marketing","Hemant");
        Department dept3 = new Department("Accounts","Kulddep");
        session.save(new Employee("Amit Singh",600000,dept1));
        session.save(new Employee("Amit Singh",630000,dept2));
        session.save(new Employee("Amit Singh",300000,dept3));
        session.save(new Employee("Amit Singh",400000,dept1));
        session.save(new Employee("Amit Singh",50000,dept2));
        session.save(new Employee("Amit Singh",3500000,dept3));
        session.save(new Employee("Amit Singh",604000,dept1));
        session.save(new Employee("Amit Singh",600000,dept1));
        session.save(new Employee("Amit Singh",600000,dept2));
        session.save(new Employee("Amit Singh",600000,dept3));
        session.save(new Employee("Amit Singh",600000,dept1));
        session.save(new Employee("Amit Singh",600000,dept2));
        session.save(new Employee("Amit Singh",600000,dept3));
        session.save(new Employee("Amit Singh",600000,dept2));
        session.save(new Employee("Amit Singh",600000,dept3)); 
        transaction.commit();
    }
}
