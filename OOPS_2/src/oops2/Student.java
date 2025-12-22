package oops2;

public class Student {

	
	private int rollNo;
	private String name;
	private double marks;
	
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		if( marks <0 || marks >100) {
			return ;
		}
		
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	public Student( int rollNo , String name , double marks) {
		
		this.rollNo = rollNo;
		this.name = name;
		setMarks(marks);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Student 1", 77);
		
		System.out.println(s1);
		
		System.out.println("Invalid attempt 1");
		s1.setMarks(-10);
		System.out.println(s1);

		System.out.println("Invalid attempt 2");
		s1.setMarks(150);
		System.out.println(s1);
		
		
		System.out.println("Marks should be 66");
		s1.setMarks(66);
		System.out.println(s1);
	}
	
	
	
	
}
