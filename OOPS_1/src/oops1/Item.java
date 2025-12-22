package oops1;

import java.util.ArrayList;

public class Item {

	private int id;
	private String name;
	private int quantity;
	
	public Item( int id , String name , int quantity) {
		this.id=id;
		this.name=name;
		this.quantity=quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public static void main(String[] args) {
		
	Item i1 = new Item(1, "Headphones", 10);	
	Item i2 = new Item(2, "Charger", 14);	
	Item i3 = new Item(3, "Mouse", 2);	
	Item i4 = new Item(4, "Monitor", 5);	
	
	// total = 31
	
	
	
	ArrayList<Item> itemList = new ArrayList<>();
	
	itemList.add(i1);
	itemList.add(i2);
	itemList.add(i3);
	itemList.add(i4);
	
	 int totalItems=0;
	for( Item i : itemList) {
		 totalItems  +=   i.getQuantity(); 
	}
	
	System.out.println( "Total items currently are  :" + totalItems);
	
	
	
	}
}
