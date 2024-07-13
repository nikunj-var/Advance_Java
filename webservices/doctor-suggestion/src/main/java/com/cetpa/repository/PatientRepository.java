package com.cetpa.repository;

import com.cetpa.entity.Patient;

public interface PatientRepository {
	void addPatient(Patient patient);

	Patient getPatient(int pid);

	

}
