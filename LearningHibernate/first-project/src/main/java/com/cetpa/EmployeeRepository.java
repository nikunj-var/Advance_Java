package com.cetpa;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;

public class EmployeeRepository {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		Configuration config1 = config.configure("hibernate.cfg.xml");
		SessionFactory factory = config1.buildSessionFactory();
		
		Session ses = factory.openSession();
		Transaction tr = ses.getTransaction();
		tr.begin();
		ses.save(new Employee(101,"Rakesh","Sales",45000));
		ses.persist(new Employee(102,"Suresh","Marketing",62000));
		tr.commit();
	}

}
