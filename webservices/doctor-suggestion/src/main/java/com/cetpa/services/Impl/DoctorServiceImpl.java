package com.cetpa.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entity.Doctor;
import com.cetpa.exception.DoctorNotFoundException;
import com.cetpa.repository.DoctorRepository;
import com.cetpa.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired private DoctorRepository doctorRepository;

	
	public void addDoctor(Doctor doctor) {
		doctorRepository.addDoctor(doctor);
	}


	@Override
	public Doctor getDoctor(int docid) {
		Doctor doctor = doctorRepository.getDoctor(docid);
		if(doctor == null) {
			throw new DoctorNotFoundException("Doctor with id "+docid+"not found");
		}
		return doctor;
	}
}
