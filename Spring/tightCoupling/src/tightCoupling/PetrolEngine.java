package tightCoupling;

public class PetrolEngine implements FourWheelerEngine{

	@Override
	public void startEngine() {
		System.out.println("Petrol engine started");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Petrol engine stopped");
		
	}
	
}
