package com.cetpa;

import javax.persistence.*;

@Entity
public class SimCard {

	@Id
	@GeneratedValue(generator="card_seq")
	@SequenceGenerator(name="card_seq",initialValue=101,allocationSize=1)
	private int sid;
	private String phoneNumber;
	private String operator;
	public SimCard() {
		
	}
	
	public SimCard(String phoneNumber, String operator) {
		this.phoneNumber = phoneNumber;
		this.operator = operator;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
		
}
