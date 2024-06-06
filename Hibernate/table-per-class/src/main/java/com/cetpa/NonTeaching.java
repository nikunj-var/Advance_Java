package com.cetpa;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="non-teaching")
public class NonTeaching extends Staff{
	private String area;
	public NonTeaching () {
		
	}
	public NonTeaching(int sid,String name,String address,String phone,String area) {
		super(sid,name,address,phone);
		this.area=area;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
}
