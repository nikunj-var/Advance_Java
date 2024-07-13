package com.cetpa.services;

import com.cetpa.entity.Doctor;

public interface DoctorService {

	void addDoctor(Doctor doctor);

	Doctor getDoctor(int docid);

}
