package tightCoupling;

public class CngEngine implements FourWheelerEngine{

	@Override
	public void startEngine() {
		System.out.println("CNG engine started");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("cng engine stopped");
		
	}
	
}
