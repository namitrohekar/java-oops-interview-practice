package oops4;


abstract class Payment{
	
	abstract void processPayment(double amount);
	
	public void printReceipt( double amount) {
		System.out.println("Payment of " +  amount + " Processed");
	}
}

class CreditCardPayment extends Payment{

	@Override
	void processPayment(double amount) {
	 
		System.out.println("Processing Credit card payment!");
		printReceipt(amount);
		
	}
	
	
}

class UPIPayment extends Payment{
	
	@Override 
	void processPayment(double amount) {
		System.out.println("Processing UPI  payment!");
		printReceipt(amount);
	}

}
public class AbstractPaymentDemo {
	
	public static void main(String[] args) {
		
		Payment p1 = new CreditCardPayment();
		Payment p2 = new UPIPayment();
		
		
		p1.processPayment(200);
		
		
		p2.processPayment(300);
		
		
		
		
	}

}
