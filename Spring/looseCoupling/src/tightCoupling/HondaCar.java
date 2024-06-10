package tightCoupling;

public class HondaCar {
	private FourWheelerEngine engine;

	public HondaCar(FourWheelerEngine engine) {
		this.engine=engine;  //loose coupling
	}
	public void turnEngineOn() {
		engine.startEngine();
	}
	public void turnEngineOff() {
		engine.stopEngine();
	}
}
