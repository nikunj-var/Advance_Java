package com.cetpa;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="teaching")
public class TeachingStaff extends Staff{
	private String qualification;
	private String subject;
	public TeachingStaff () {
		
	}
	public TeachingStaff(int sid,String name,String address,String phone,String qualification, String subject) {
		super(sid,name,address,phone);
		this.qualification = qualification;
		this.subject = subject;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
