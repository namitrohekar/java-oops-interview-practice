package oops5;

interface Payment{
	void pay(double amount);
}

class CreditCardPayment implements Payment{
	
	@Override
	public void pay(double amount) {
		System.out.println("Card payment done for " + amount + " amount") ;
	}
	
}
class UPIPayment implements Payment{
	
	@Override
	public void pay(double amount) {
		System.out.println("UPI payment done for " + amount + " amount") ;
	}
}

public class IterfacePaymentDemo {

	
	public static void main(String[] args) {
		
		Payment p1 = new CreditCardPayment();
		Payment p2 = new UPIPayment();
		
		
		p1.pay(6000);
		p2.pay(4000);
	}
	
}
