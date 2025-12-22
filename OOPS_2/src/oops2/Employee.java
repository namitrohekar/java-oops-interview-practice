package oops2;


public class Employee {

	private int empId;
	private String name;
	private double salary;
	
	public int getEmpId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName( String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public boolean setSalary( double salary) {
		
		if( salary > 0) {
			this.salary = salary;
			return true;
		}
		return false;
	
	}
	
	
	public Employee( int empId , String name , double salary) {
		this.empId = empId;
		this.name = name;
		setSalary(salary);
	}
	
	
	@Override
	public String toString() {
		return "Employee Details { Id : "  +getEmpId() +
				" Name : " + getName() + " Salary : " + getSalary() ;
	}
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1, "Employee 1", 2000);
		
		System.out.println(e1);
		
		// updating name and salary 
		
		System.out.println("After Updating salary ");
		e1.setName("New Employee");
		e1.setSalary(5000);
		e1.setSalary(-2000); // this will fail to update salary
		
		System.out.println(e1);
	}
	
	
}
