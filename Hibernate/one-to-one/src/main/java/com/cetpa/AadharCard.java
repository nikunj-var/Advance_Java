package com.cetpa;

import javax.persistence.*;

@Entity
public class AadharCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	@OneToOne(cascade = CascadeType.ALL)
	private Person person;
	public AadharCard() {
		
	}
	public AadharCard(Person person) {
		super();
		this.person = person;
	}
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Override
	public String toString() {
		return "AadharCard [aid=" + aid + ", person=" + person + "]";
	}
	
	
	
}
