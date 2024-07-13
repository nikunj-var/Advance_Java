package com.cetpa.repository;

import java.util.List;

import com.cetpa.entity.Doctor;

public interface DoctorRepository {

	void addDoctor(Doctor doctor);

	Doctor getDoctor(int docid);

	List<Doctor> getList(String speciality, String city);
	

}
