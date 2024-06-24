package com.cetpa.repositories.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cetpa.repositories.EmployeeRepository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{
	
	private Session session;
	private Transaction transaction;
	
	@Autowired
	public EmployeeRepositoryImpl(SessionFactory sessionFactory) {
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
	}
}
