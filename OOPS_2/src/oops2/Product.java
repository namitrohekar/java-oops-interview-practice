package oops2;


public class Product {

	private int id;
	private String name;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId( int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	
	
	// Business method to update price 
	public boolean updatePrice ( double newPrice) {
		if( newPrice > 0) {
			this.price = newPrice;
			return true;
		}
		return false;
	}
	
	

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        updatePrice(price);
    }
	
	
	
	
	@Override
	public String toString() {
		return "Product Details { Id : "  +getId() +
				" Name : " + getName() + " Price : " + getPrice() ;
	}
	
	
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "Keyboard", 1234);
		
		System.out.println(p1);
		
		
		// update the price 
		
		p1.updatePrice(2000);
		p1.updatePrice(-500);
		
		System.out.println(p1);
	}
	
	
	
	
}
