package oops11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IterationTrapDemo {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("BMW");
		list.add("Mansion");
		list.add("Yacht");
		list.add("Unicorn");
		list.add("Legacy");
		
		
	/*	for( String s : list) {
			if(s.equals("BMW")){
				list.remove(s);
				
			}
		}
		*/
		
		// Correct Approach 
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			if(value.equals("Yacht")) {
				itr.remove();
			}
		}
		
		System.out.println("Modified List : " + list);
		
		
		//  we can also  use thread safe option which is CopyOnWriteArrayList to handle ConcurrentModifiactionException 
		
		List<String> safeList = new CopyOnWriteArrayList<>();
		
		safeList.add("BMW");
		safeList.add("Mansion");
		safeList.add("Yacht");
		safeList.add("Unicorn");
		safeList.add("Legacy");
		
		
		for( String s : safeList) {
			if(s.equals("BMW")){
				safeList.remove(s);
				
			}
		}
		
		System.out.println("Modified List : " + safeList);
		
		
	}

}
