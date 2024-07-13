package com.cetpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.entity.Doctor;
import com.cetpa.entity.Patient;
import com.cetpa.services.PatientService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("patient")
public class PatientController {
	@Autowired private PatientService patientService;
	
	@PostMapping("add")
	public ResponseEntity<Patient> addPatient(@Valid @RequestBody Patient patient){
		patientService.addPatient(patient);
		return ResponseEntity.status(HttpStatus.CREATED).body(patient);
	}
	
	@GetMapping("doctor-list/{patid}")
	public ResponseEntity<List<Doctor>> getDoctorList(@PathVariable("patid") int patid){
		List<Doctor> doctorList = patientService.getDoctorList(patid);
		return ResponseEntity.ok(doctorList);
	}
	
}
