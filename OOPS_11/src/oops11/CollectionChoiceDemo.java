package oops11;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionChoiceDemo {
	
	public static void main(String[] args) {
		
		/*
		 * Given the constraints  of not using List or Map 
		 * the uniqueness would get implemented if we use Set and override the equals and hash-code (Not necessary in this case since only one field )
		 * but insertion order must be maintained as well so tree or hash set wont cut it 
		 * so leaves obvious choice as LinkedHashSet , lookup will be fast as well 
		 */
		
		Set<String > userNames = new LinkedHashSet<>();
		
		userNames.add("Namit");
		userNames.add(null);
		userNames.add("Namit");
		userNames.add("User 2");
		userNames.add("User 1");
		userNames.add("User 2");
		
		
		System.out.println(userNames);
	}

}
