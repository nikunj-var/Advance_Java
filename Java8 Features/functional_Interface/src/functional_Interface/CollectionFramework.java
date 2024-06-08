package functional_Interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class CollectionFramework {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Rahul");
		list.add("Rahul");
		list.add("Rahul");
		list.add("Rahul");
		
//		using Class
		class AA implements Consumer<String>{
			public void accept(String str) {
				System.out.println(str);
			}
		}
		list.forEach(new AA());
		System.out.println("----");

//		using Lambda Expressions
		list.forEach(str->System.out.println(str));
	}

}
