package com.cetpa;

public class PetrolEngine implements FourWheelerEngine{
	public PetrolEngine() {
		System.out.println("Bean petrol engine started");
	}

	@Override
	public void startEngine() {
		System.out.println("Petrol engine started");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Petrol engine stopped");
		
	}
	
}
