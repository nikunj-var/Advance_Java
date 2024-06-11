package com.cetpa;

public class DieselEngine implements FourWheelerEngine{

	public DieselEngine() {
		System.out.println("Bean Diesel engine started");
	}
	@Override
	public void startEngine() {
		System.out.println("Dielsel engine started");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Dielsel engine stopped");
		
	}
	
}
