package oops1;

import java.util.ArrayList;

public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	
	
	  public Employee( int empId , String name , double salary ){
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public  Employee( int empId , String name) {
		 
		 this.empId= empId;
		 this.name = name;
		 this.salary= 0.0;
		
	}
	 
	@Override
	public String toString() {
		return "Employee details { Id : " + empId + " name : " 
					+ name + " salary : " + salary + " } ";
		
	}
	
	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1, "default salaried emp");
		Employee e2 = new Employee(2, "Salaried Employee", 20000.00);
		Employee e3 = new Employee(3, "Salaried Employee 2", 40000);
		
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		
		for (Employee e : emp ) {
			System.out.println(e);
		}
		
		
	}

}
