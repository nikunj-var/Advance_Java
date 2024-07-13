package com.cetpa.services;

import java.util.List;

import com.cetpa.entity.Doctor;
import com.cetpa.entity.Patient;

public interface PatientService {
	void addPatient(Patient patient);

	List<Doctor> getDoctorList(int pid);


}
