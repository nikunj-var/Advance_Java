package com.cetpa.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cetpa.entity.Doctor;
import com.cetpa.repository.DoctorRepository;


@Repository
public class DoctorRepositoryImpl implements DoctorRepository{
	private Session session;
	private Transaction transaction;
	
	@Autowired
	public DoctorRepositoryImpl(SessionFactory factory) {
		session = factory.openSession();
		transaction = session.getTransaction();
		
	}

	
	public void addDoctor(Doctor doctor) {
		transaction.begin();
		session.save(doctor);
		transaction.commit();
		
	}


	
	public Doctor getDoctor(int docid) {
		return session.get(Doctor.class, docid);
		
	}


	public List<Doctor> getList(String speciality, String city) {
		Query<Doctor> query = session.createQuery("from Doctor where city=:arg1 and speciality=:arg2",Doctor.class);
		query.setParameter("arg1", city);
		query.setParameter("arg2", speciality);
	
		return query.list();
	}
}
