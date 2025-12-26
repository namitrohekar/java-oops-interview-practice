package oops6;


class Employee{
	private int id;
	private String name;
	
	public Employee(int id , String name) {
		this.id= id;
		this.name=name;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
	
	
	

	public boolean equals( Object obj) {
		
		if( this == obj) return true;  // Reference equality
		
		if( obj == null) return false; // if object is null
		
		if( getClass() != obj.getClass()) return false;
		
		Employee other = (Employee) obj;
		
		return this.id == other.id && ( this.name != null ? this.name.equals(other.name) : other.name == null);
		
	}
	
	
	
}

public class EqualsVsDoubleEqualsDemo {

	public static void main(String[] args) {
		
		
		
		Employee e1 = new Employee(1, "Employee 1");
		Employee e2 = new Employee(2, "Employee 2");
		Employee e3 = new Employee(1, "Employee 1");
		
		
		// before overriding equals
	/*
		System.out.println(e1 == e2); // false
		System.out.println(e1 == e1); // true
		System.out.println(e1.equals(e1)); // true
		
		
		System.out.println(e1 == e2); // false
		System.out.println(e1.equals(e3)); // false
		
		System.out.println(e1.getId() == e2.getId()); // false
	*/
	
		
		
		System.out.println(e1.equals(e3)); // now true
		
		
		
	}
}
