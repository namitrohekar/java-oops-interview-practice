package oops9;


/*
 * Open/Closed Principle(OCP):
 * Classes should be open for extension but closed for modification 
 * meaning new behaviors are added via poly-morphism, not by changing existing tested code 
 */


interface PaymentMethod{
	
	public void pay( double amount);	
}

class CardPayment implements PaymentMethod{
	
	public void pay( double amount) {
		System.out.println("Card Payment done for amount " + amount);
	}
}
class UPIPayment implements PaymentMethod{
	
	public void pay( double amount) {
		System.out.println("UPI Payment done for amount " + amount);
	}
}

// new service cash payment
class CashPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Cash Payment done for amount " + amount);
    }
}


class PaymentService{
	
	public  void processPayment(PaymentMethod paymentMethod , double amount ) {
		paymentMethod.pay(amount);
	}
}

public class OCPDemo {
	
	public static void main(String[] args) {
		
		PaymentService payment = new PaymentService();
		
		payment.processPayment( new CardPayment(), 200);
		payment.processPayment( new UPIPayment(), 400);
		payment.processPayment( new CashPayment(), 600);
		
	}

}
