package oops11;

import java.util.HashMap;
import java.util.Map;

public class MapPitFallDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> student = new HashMap<>();
		
		student.put(1, "Namit");
		System.out.println(student);
		
		student.put(null, "Namit");
		System.out.println(student);
		
		student.put(1, "Rohekar"); // overrides 1 key 
		System.out.println(student);
		
		student.put(null, null); // allows only one null , so here it overrides existing null key 
		System.out.println(student);
		
		student.put(2, null); // values can be null multiple times
		System.out.println(student);
		
	}

}
