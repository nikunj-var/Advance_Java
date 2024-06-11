package com.cetpa;

public class CngEngine implements FourWheelerEngine{

	public CngEngine() {
		System.out.println("Bean Cng engine started");
	}
	@Override
	public void startEngine() {
		System.out.println("CNG engine started");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("cng engine stopped");
		
	}
	
}
