package com.cetpa;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="staff_type")
public abstract class Staff {
	@Id
	private int sid;
	private String name;
	private String address;
	private String phone;
	public Staff() {
		
	}
	public Staff(int sid, String name, String address, String phone) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
