package tightCoupling;

public class HondaCar {
	private FourWheelerEngine engine;

	public HondaCar() {
		engine = new PetrolEngine();  //tight coupling
	}
	public void turnEngineOn() {
		engine.startEngine();
	}
	public void turnEngineOff() {
		engine.stopEngine();
	}
}
