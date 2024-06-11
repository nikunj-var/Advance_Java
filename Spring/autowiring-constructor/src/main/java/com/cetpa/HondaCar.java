package com.cetpa;

import org.springframework.beans.factory.annotation.Qualifier;

public class HondaCar {
	
	private FourWheelerEngine engine;

	public HondaCar() {
		System.out.println("car is created using default constructor");
	}
	
	public HondaCar(@Qualifier("engine1") FourWheelerEngine engine2) {
		System.out.println("car is created using parameterized constructor");
		System.out.println("dependency injected using  parameterized constructor");
		this.engine = engine2;
	}
	
	public void setEngine(FourWheelerEngine engine3) {
		this.engine=engine3;
		System.out.println("dependency injected using setter method");
	}
	
	public void turnEngineOn() {
		engine.startEngine();
	}
	
	public void turnEngineOff() {
		engine.stopEngine();
	}
	
}
