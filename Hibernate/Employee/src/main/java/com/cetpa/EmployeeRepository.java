package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class EmployeeRepository {
	public static void main(String args[]) {
//		Configuration config = new Configuration();
//		Configuration config1 = config.configure("hibernate.cfg.xml");
//		SessionFactory factory = config1.buildSessionFactory();
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
//		create session object
		Session ses = factory.openSession();
		Transaction tr = ses.getTransaction();
		tr.begin();
		ses.save(new Employee(104,"Rakesh","Sales",45000));
		ses.persist(new Employee(105,"Rakesh","Sales",45000));
		ses.save(new Employee(106,"Rakesh","Sales",45000));
		tr.commit();
	}
}
