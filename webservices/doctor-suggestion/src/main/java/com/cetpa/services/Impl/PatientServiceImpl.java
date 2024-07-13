package com.cetpa.services.Impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.entity.Doctor;
import com.cetpa.entity.Patient;
import com.cetpa.map.DoctorList;
import com.cetpa.repository.DoctorRepository;
import com.cetpa.repository.PatientRepository;
import com.cetpa.services.PatientService;

@Service
public class PatientServiceImpl implements PatientService{
	@Autowired private PatientRepository patientRepository;
	@Autowired private DoctorRepository doctorRepository;
	
	public void addPatient(Patient patient) {
		patientRepository.addPatient(patient);
	}


	public List<Doctor> getDoctorList(int pid) {
		Patient patient = patientRepository.getPatient(pid);
		
		if(patient == null) {
			throw new RuntimeException("Patient with pid "+pid+" doesnot exist");
		}
		
		String city = patient.getCity();
		if(city.equals("Noida") && city.equals("Delhi") && city.equals("Faridabad") ) {
			throw new RuntimeException("We are still waiting to expand to your location....");
		}
		
		String symptom = patient.getSymptom();
		String speciality = DoctorList.map.get(symptom);
		List<Doctor> doctorList = doctorRepository.getList(speciality,city);
		if(doctorList.isEmpty()) {
			throw new RuntimeException("there is no doctor present at your location with this symptom");
			
		}
		return doctorList;
	}



}
