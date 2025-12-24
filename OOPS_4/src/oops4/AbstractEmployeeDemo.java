package oops4;


abstract class Employee{
	private int id;
	private String name;
	
	public Employee( int id , String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public abstract double calculateSalary();
	
	
	public void displayInfo() {
		System.out.println("Employee Details : Id -> " + id + " Name -> " + name);
	}
} 

class FullTimeEmployee extends Employee {
	
	public FullTimeEmployee(int id, String name , double monthlySalary) {
		super(id, name);
		this.monthlySalary=monthlySalary;
	}

	private double monthlySalary;

	@Override
	public double calculateSalary() {
		
		return 12 * monthlySalary;
	}
	
}

class PartTimeEmployee extends Employee{
	
	public PartTimeEmployee(int id, String name , int hoursWorked , int ratePerHour) {
		super(id, name);
		this.hoursWorked =hoursWorked;
		this.ratePerHour =ratePerHour;
		
	}


	private int hoursWorked;
	private int ratePerHour;
	
	
	@Override
	public double calculateSalary() {
		
		return  hoursWorked * ratePerHour;
	}
	
	
}

public class AbstractEmployeeDemo {
	
	public static void main(String[] args) {
		
		
		Employee e1 = new FullTimeEmployee( 1, "employee 1", 25000);
		Employee e2 = new PartTimeEmployee(2, "Employee 2", 12, 10);	

		
		e1.displayInfo();
		System.out.println(e1.calculateSalary());
		e2.displayInfo();
		System.out.println(e2.calculateSalary());
		
		
	}

	
}
