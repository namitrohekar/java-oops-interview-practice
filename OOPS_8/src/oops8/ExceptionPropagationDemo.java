package oops8;

public class ExceptionPropagationDemo {
	
	// Method that stimulates the failure
	static void processOrder() throws Exception{
		throw new Exception("Order processing failed!");
	}
	
	// Method that processes the order and propagates exception 
	static void handleRequest()  throws Exception{
		processOrder();
	}

	
	
	public static void main(String[] args) {
	
		try {
			handleRequest();   // Exception propagates 
		} catch (Exception e) {
			System.out.println("Exception caught in main " + e.getMessage());
		} finally {
			System.out.println("Program Continues");
		}
		
		
	}
}
