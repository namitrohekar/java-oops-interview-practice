package oops2;


public  final class Book {

	private final String isbn ;
	private final String title ;
	private final String author;
	
	
	public Book(  String isbn , String title , String author) {
		this.isbn = isbn;
		this.title=title;
		this.author=author;
	}


	public String getIsbn() {
		return isbn;
	}


	public String getTitle() {
		return title;
	}


	public String getAuthor() {
		return author;
	}
	
	
	


	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", author=" + author + "]";
	}
	
	public static void main(String[] args) {
		
		Book b1 = new Book("1234567", "Metamorphosis", "Franz Kafka");
		
		
		System.out.println(b1);
		
		
		System.out.println("-------------- Testing Imuutability -----------");
		
		// ATTEMPT TO MODIFY:
	      //   b1.setTitle("New Title"); // ERROR: Compilation fail. Method does not exist.
	       //  b1.title = "New Title";   // ERROR: Field is private.
	}


	
}
