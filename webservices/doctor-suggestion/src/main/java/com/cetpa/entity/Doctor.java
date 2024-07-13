package com.cetpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(generator="doc_seq")
	@SequenceGenerator(name="doc_seq",initialValue=1,allocationSize=1)
	private int docid;
	
	@NotNull(message="Name is required")
	@Pattern(regexp = "^[A-Za-z]{3,}$",message = "Name is not valid")
	private String name;
	
	@NotNull(message="City is required")
	@Pattern(regexp = "Noida|Delhi|Faridabad",message="City must be either Noida or Delhi or Faridabad")
	private String city;
	
	@Size(min=10)
	@NotNull(message="Phone is required")
	@Pattern(regexp = "^[0-9]{10}$",message = "Phone number is invalid")
	private String phone;
	
	@NotNull(message="Email is required")
	@Email(message = "Email is invalid")
	private String email;
	
	@NotNull(message="Speciality is required")
	@Pattern(regexp = "Orthopedic|Gynecology|Dermatology|ENT",message="This speciality is not allowed")
	private String speciality;
	
	public int getDocid() {
		return docid;
	}
	public void setDocid(int docid) {
		this.docid = docid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
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
	
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
}
