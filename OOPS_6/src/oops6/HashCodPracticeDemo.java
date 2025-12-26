package oops6;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
	
	private int rollNo;
	private String name;
	
	public Student(int rollNo , String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	
	
	// Comment both this overridden equals and hashCode and observe the print statements 
	
	@Override
	public boolean equals( Object obj) {
		
		if( this == obj) return true; // same reference 
		
		if(obj == null) return false;
		
		if( getClass() != obj.getClass()) return false;
		
		Student other = (Student) obj;
		
		return this.rollNo == other.rollNo && (this.name != null ? this.name.equals(other.name) : other.name == null);
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(rollNo , name);
	}
	
	
	/*
	 * Explanation:
	 *  equals() checks logical equality of Student data, 
	 *  while hashCode() ensures equal objects share the same hash for correct behavior in HashSet/HashMap.
	 * Without overriding both, duplicates with same data would still be stored. 
	 * since set dosen't store duplicates now it saves s1 and thinks s2 is same so calls equals and hashCode and confirms similarity , 
	 * so after adding s1 it thinks s2 is already added so ignores s2 ( who ever occurs first)
	 * both exist in memory but only s1 exists in set since it occurred first 
	 */
}

public class HashCodPracticeDemo {

	public static void main(String[] args) {
		
		Student s1= new Student(1, "Student 1");
		Student s2= new Student(1, "Student 1");
		
		System.out.println("Equals Result: " + s1.equals(s2));
		
		Set<Student> set = new HashSet<>();
		set.add(s1);
		set.add(s2);
		
		System.out.println("Hashset size: " + set.size());
	}
}
