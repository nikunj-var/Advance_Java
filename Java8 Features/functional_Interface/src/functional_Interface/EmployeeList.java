package functional_Interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101,"Rahul","Teaching",900000));
		list.add(new Employee(103,"Nandu","Teaching",900000));
		list.add(new Employee(108,"Debu","Teaching",900000));
		list.add(new Employee(105,"Lalla","Teaching",900000));
		list.add(new Employee(104,"Chunnu","Teaching",900000));
		list.add(new Employee(102,"Pulu","Teaching",900000));
		
//		using class
		class AA implements Comparator<Employee>{

			@Override
			public int compare(Employee o1, Employee o2) {
				int n = o1.getEid()-o2.getEid();
				return n;
			}
			
		}
		Collections.sort(list,new AA());
		for(Employee emp:list) {
			System.out.println(emp.toString());
		}
		
//		using Lambda Expressions
		Collections.sort(list,(emp1,emp2)->emp1.getEid()-emp2.getEid());
		for(Employee emp:list) {
			System.out.println(emp.toString());
		}
		
		// sort by name
			Collections.sort(list,(emp1,emp2)->emp1.getName().compareTo(emp2.getName()));
			System.out.println("sorted by name");
			for(Employee emp:list) {
				System.out.println(emp.toString());
			}
		
	}


}
