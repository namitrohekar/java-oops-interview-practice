package oops3;

 class Employee {
	
	private int id;
	private String name;
	
	
	// Parent constructor
	public Employee( int id , String name) {
		
		this.id =id;
		this.name = name;
	}
	
	// Parent method
	
	public String displayInfo() {
		
		return "Employee details [  ID: " + id + " Name : " + name ;
	}
	
	

}

class Department extends Employee{
	
	private String department;
	
	// Child constructor 
	
	public Department( int id , String name , String department ) {
		
		super(id , name);
		this.department= department;
	}
	
	// Override parent method
	public String displayInfo() {
		
		return super.displayInfo() + " Department : " + department + " ]";
	}
	
	
	
}




public class EmpDeptInheritance{
	

	public static void main(String[] args) {
		
		Department d1 = new Department(1, " Employee 1 ", "Backend Enginner");
		
		
		System.out.println(d1.displayInfo());
		
		
	}
	
	
}
