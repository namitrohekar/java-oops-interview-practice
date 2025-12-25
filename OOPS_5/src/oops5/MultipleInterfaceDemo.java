package oops5;



interface Printable{
	void print();
}
interface Scannable{
	void scan();
}

class AllInOnePrinter implements Printable , Scannable{
	
	@Override
	public void print() {
		System.out.println("Its printed" );
	}
	
	@Override
	public void scan() {
		
		System.out.println("Its scanned");
		
		
	
	}
}


public class MultipleInterfaceDemo {
	
	public static void main(String[] args) {
		
		AllInOnePrinter printer = new AllInOnePrinter();
		
		printer.scan();
		printer.print();
	}

}



