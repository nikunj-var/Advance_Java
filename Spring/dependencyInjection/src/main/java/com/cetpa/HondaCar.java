package com.cetpa;

public class HondaCar {
	
	private FourWheelerEngine engine;

	public HondaCar() {
		System.out.println("car is created using default constructor");
	}
	
	public HondaCar(FourWheelerEngine engine) {
		System.out.println("car is created using parameterized constructor");
		System.out.println("dependency injected using  parameterized constructor");
		this.engine = engine;
	}
	
	public void setEngine(FourWheelerEngine engine) {
		this.engine=engine;
		System.out.println("dependency injected using setter method");
	}
	
	public void turnEngineOn() {
		engine.startEngine();
	}
	
	public void turnEngineOff() {
		engine.stopEngine();
	}
	
}
