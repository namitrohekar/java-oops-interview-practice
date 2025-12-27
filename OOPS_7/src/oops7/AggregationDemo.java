package oops7;

import java.util.ArrayList;
import java.util.List;

class Employee{

	private String name;
	
	public Employee( String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
}

class Department{
	
	private List<Employee> employees;
	
	public Department() {
		employees = new ArrayList<>();
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}
	
	public void showEmployees() {
        System.out.println("Department Employees:");
        for (Employee e : employees) {
            System.out.println("- " + e.getName());
        }
    }

	
	
}


public class AggregationDemo {
	
	public static void main(String[] args) {
		
		
		 // Employees created independently (outside Department)
        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob");
        Employee e3 = new Employee("Charlie");

        // Department created separately
        Department dept = new Department();

        // Aggregation: Department receives employees
        dept.addEmployee(e1);
        dept.addEmployee(e2);
        dept.addEmployee(e3);

        // Show employees in department
        dept.showEmployees();

		
	}

}
