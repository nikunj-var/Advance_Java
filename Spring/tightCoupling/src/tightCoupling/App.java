package tightCoupling;

public class App {

	public static void main(String[] args) {
		HondaCar car1= new HondaCar();
		HondaCar car2= new HondaCar();
		HondaCar car3= new HondaCar();
		car1.turnEngineOn();
		car2.turnEngineOn();
		car3.turnEngineOn();
	}

}
