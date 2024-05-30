package obejctdemo;

import java.util.Scanner;

public class CreateObject {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter class name");
		String name = sc.nextLine();
		try {
			Class cls = Class.forName(name);
			cls.newInstance();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
