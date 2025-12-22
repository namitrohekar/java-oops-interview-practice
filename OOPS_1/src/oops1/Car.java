package oops1;

public class Car {
	
	private String brand;
	
	private String model;
	
	private long price;
	
	
	public Car( String brand , String model , long price ) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return "Car details {  Brand : " + brand + 
				" , Model : " + model + " , Price : " + price + " } "; 
	}
	
	
	public static void main(String[] args) {
		
		Car c1 = new Car("BMW", "M4 Comp", 2_40_00_000);
		Car c2 = new Car("Mercedes", "Maybach", 3_00_00_000);
	
		System.out.println(c1);
		System.out.println(c2);
	}

}
