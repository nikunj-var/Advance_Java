package com.cetpa.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cetpa.entity.Patient;
import com.cetpa.repository.PatientRepository;

@Repository
public class PatientRepositoryImpl implements PatientRepository{
	private Session session;
	private Transaction transaction;
	
	@Autowired
	public PatientRepositoryImpl(SessionFactory factory) {
		session = factory.openSession();
		transaction = session.getTransaction();
		
	}

	
	public void addPatient(Patient patient) {
		transaction.begin();
		session.save(patient);
		transaction.commit();
		
	}


	
	public Patient getPatient(int pid) {
		return session.get(Patient.class, pid);
	
	}


}
