package tightCoupling;

public class DieselEngine implements FourWheelerEngine{

	@Override
	public void startEngine() {
		System.out.println("Dielsel engine started");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Dielsel engine stopped");
		
	}
	
}
