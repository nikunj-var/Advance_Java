package com.cetpa;

import javax.persistence.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	private int pid;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name="personcard",joinColumns=@JoinColumn(name="pid"),inverseJoinColumns=@JoinColumn(name="sid"))
	private List<SimCard> simcards;
	Person(){
		
	}
	public Person(int pid, String name, List<SimCard> simcards) {
		super();
		this.pid = pid;
		this.name = name;
		this.simcards = simcards;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<SimCard> getSimcards() {
		return simcards;
	}
	public void setSimcards(List<SimCard> simcards) {
		this.simcards = simcards;
	}
	
	
}
