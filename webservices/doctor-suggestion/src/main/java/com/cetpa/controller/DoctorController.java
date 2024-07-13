package com.cetpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.entity.Doctor;
import com.cetpa.services.DoctorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("doctor")
public class DoctorController {
	@Autowired DoctorService doctorService;
	
	@PostMapping("add")
	public ResponseEntity<Doctor> addDoctor(@Valid @RequestBody Doctor doctor){
		
		doctorService.addDoctor(doctor);
		return ResponseEntity.status(HttpStatus.CREATED).body(doctor);
	}
	public ResponseEntity<List<Doctor>> getDoctorList(){
		return null;
	}
	
	@GetMapping("search")
	public ResponseEntity<Doctor> searchDoctor(@RequestParam("docid") int docid){
		Doctor doctor = doctorService.getDoctor(docid);
		return ResponseEntity.ok(doctor);
		
	}
}
