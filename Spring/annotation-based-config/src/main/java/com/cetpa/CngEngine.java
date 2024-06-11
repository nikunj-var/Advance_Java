package com.cetpa;

import org.springframework.stereotype.Component;

@Component("cngEngine")
public class CngEngine implements FourWheelerEngine{

	public CngEngine() {
		System.out.println("Bean Cng engine created");
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
