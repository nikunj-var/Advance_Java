package com.cetpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Patient {
	@Id
	@GeneratedValue(generator="pat_seq")
	@SequenceGenerator(name="pat_seq",initialValue=1,allocationSize=11111)
	private int patid;
	
	@NotNull(message="Name is required")
	@Pattern(regexp = "^[A-Za-z]{3,}$",message = "Name is not valid")
	private String name;
	
	@NotNull(message="Phone is required")
	@Pattern(regexp = "^[0-9]{10}$",message = "Phone number is invalid")
	private String phone;
	
	@NotNull(message="Email is required")
	@Email(message = "Email is invalid")
	private String email;
	
	@NotNull(message="Symptom")
	@Pattern(regexp = "Arthritis|Backpain|Tissue Injuries|Dysmenorrhea|Skin infection|Skin burn|Ear pain",message="Invalid Symptoms")
	private String symptom;
	
	@NotNull(message="city is required")
	private String city;

	public int getPatid() {
		return patid;
	}

	public void setPatid(int patid) {
		this.patid = patid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSymptom() {
		return symptom;
	}

	public void setSymptom(String symptom) {
		this.symptom = symptom;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
