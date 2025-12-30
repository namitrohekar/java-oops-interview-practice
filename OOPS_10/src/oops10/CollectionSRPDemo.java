package oops10;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Objects;


class Employee{
	
	private long empId;
	private String empName;
	
	public Employee(long empId , String empName) {
		this.empId=empId;
		this.empName = empName;
	}
	
	public long getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	
	@Override 
	public String toString() {
		return " [ Employee Id : " + empId + " , Employee Name : " + empName + " ]";
	}
	
	
	@Override 
	public int hashCode() {
		return Objects.hash(empId , empName);
	}
	
	@Override
	public boolean equals( Object obj) {
		if( this == obj) return true;
		
		if(obj == null || getClass() != obj.getClass()) return false;
		
		Employee other = (Employee) obj;
		
		return empId == other.empId && ( empName != null ? empName.equals(other.empName) : other.empName == null ); 
	}
	
}


class EmployeeRepository{
	
	private Map<Long, Employee> employees = new HashMap<>();
	
	public void saveEmployee(Employee employee) {
		// Lets check if id already exists in map 
		if(employees.containsKey(employee.getEmpId())) {
			System.out.println("Failed to save  " + employee.getEmpName() + " A Employee with employee id " + employee.getEmpId() +" Already Exists!");
		}
		else {
			employees.put(employee.getEmpId(), employee);
			System.out.println("Saved :" + employee);
		}
		
	}
	
	public List<Employee> getAllEmployees(){
		return new ArrayList<>(employees.values());
	}
	
}


class EmployeeService{
	
	private final EmployeeRepository repository;
	
	public EmployeeService( EmployeeRepository repository) {
		this.repository = repository;
	}
	
	
	public void registerEmployee( long empId , String empName) {
		
		if(validateId(empId) && validateName(empName)) {
			
			Employee employee = new Employee(empId, empName);
			
			repository.saveEmployee(employee);
		}
		else {
			System.out.println("Either the EmpId " + empId + " Or EmpName : " + empName + " is invalid");
		}
	}
	
	private boolean validateId(long empId) {
		return empId > 0;
	}
	private boolean validateName(String name) {
		return name != null && !name.trim().isBlank();
	}
}

public class CollectionSRPDemo {
	
	public static void main(String[] args) {
		
		EmployeeRepository repo = new EmployeeRepository();
		
		EmployeeService service = new EmployeeService(repo);
		
		service.registerEmployee(1, "Namit");
		service.registerEmployee(2, "Namit");
		service.registerEmployee(1, "Namit");
		service.registerEmployee(3, "");
		service.registerEmployee(-3, "Rohekar");
		
		
		
		System.out.println(repo.getAllEmployees());
		
	}

}
