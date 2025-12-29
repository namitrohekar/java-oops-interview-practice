package oops9;

/*
 * Interface Segregation Principle(ISP) : 
 * Clients should not be forced to depend on methods they don't use 
 * interface must be small and specific 
 */

interface Printable{
	 void print();
}

interface Scannable{
	void scan();
}

interface Faxable{
	void fax();
}

class BasicPrinter implements Printable{
	
	@Override
	public void print() {
		System.out.println("Printed from basic printer");
	}
}

class AdvancedPrinter implements Printable , Scannable , Faxable{
	
	@Override
	public void print() {
		System.out.println("Printed from Advance printer");
	}
	@Override
	public void scan() {
		System.out.println("Scanned from Advance printer");
	}
	@Override
	public void fax() {
		System.out.println("Faxed from Advance printer");
	}
}

public class ISPDemo {
	
	public static void main(String[] args) {
		
		BasicPrinter basic = new BasicPrinter();
		basic.print();
		
		AdvancedPrinter advance = new AdvancedPrinter();
		
		advance.print();
		advance.scan();
		advance.fax();
		
	}

}
