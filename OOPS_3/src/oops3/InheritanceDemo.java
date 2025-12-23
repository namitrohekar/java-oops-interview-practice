package oops3;



class Person{
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	// Parent constructor 
	public Person( String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	// Parent method 
	public String displayInfo() {
		return " Person details  Name :" + this.name + " Age : " + this.age ;
	}
}

class Student extends Person{
	
	public Student(String name, int age , int rollNo) {
		super(name, age);
		this.rollNo = rollNo;
	}

	private int rollNo;
	
	@Override
	public String displayInfo() {
		return super.displayInfo() + " Roll No : " +  this.rollNo;
 	}
}

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Student 1" , 22 , 1 );
		
		System.out.println(s1.displayInfo());
	}
	

	
	
	
	
	
	
}
