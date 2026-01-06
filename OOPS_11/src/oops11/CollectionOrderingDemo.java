package oops11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionOrderingDemo {

	public static void main(String[] args) {
		
		Set<Character> hashSet = new HashSet<>();
		hashSet.add('B');
		hashSet.add('A');
		hashSet.add('D');
		hashSet.add('C');
		hashSet.add('A');
		
		System.out.print("Hash Set : " + hashSet);
		System.out.println();
		
		Set<Character> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add('B');
		linkedHashSet.add('A');
		linkedHashSet.add('D');
		linkedHashSet.add('C');
		linkedHashSet.add('A');
		
		System.out.print("Linked hash Set : " + linkedHashSet);
		System.out.println();
		
		Set<Character> treeSet = new TreeSet<>();
		treeSet.add('B');
		treeSet.add('A');
		treeSet.add('D');
		treeSet.add('C');
		treeSet.add('A');
		
		System.out.print("Tree  Set : " + treeSet);
		
	}
}
