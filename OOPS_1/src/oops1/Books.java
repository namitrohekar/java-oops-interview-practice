package oops1;

import java.util.ArrayList;

public class Books {

	private String title;
	private String author;
	private double price;
	
	
	public Books( String title , String author , double price ) {
	
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	
	
	@Override
	public String toString() {
		
		return "Book details {  Title : " + title + 
				" , Author : " + author + " , Price : " + price + " } "; 
	}
	
	
	public static void main(String[] args) {
		
		Books b1 = new Books("The 48 laws of Power", "Robert greene" , 60.25);
		Books b2 = new Books("Atomic Habits ", "James clear" , 20.25);
		Books b3 = new Books("Metamorphosis", "Franz kafka" , 35.25);
		
		
		ArrayList<Books> bookList = new ArrayList<Books>();
		
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		
		for ( Books b : bookList) {
			System.out.println(b);
			
		}
		
		
	}
}
