package functional_Interface;

public class LambdaExpression {
	public static void main(String args[]) {
		AA obj = (n)->{System.out.println(n*n);};
		obj.show(90);
		
	}
}
