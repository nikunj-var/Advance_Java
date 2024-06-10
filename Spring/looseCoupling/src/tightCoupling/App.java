package tightCoupling;

public class App {

	public static void main(String[] args) {
		HondaCar car1= new HondaCar(new PetrolEngine());
		HondaCar car2= new HondaCar(new DieselEngine());
		HondaCar car3= new HondaCar(new CngEngine());
		car1.turnEngineOn();
		car2.turnEngineOn();
		car3.turnEngineOn();
	}

}
