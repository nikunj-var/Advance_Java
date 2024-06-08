package functional_Interface;

public class App {
	public static void main(String args[]) {
		class callimp implements AA{

			@Override
			public void show(int n) {
				System.out.println("void running");
			}
			
		}
		callimp obj = new callimp();
		obj.show(89);
	}
}
