package oops4;


abstract class DataProcessor{
	
	// Template methods : final to prevent subclasses from changing algorithm
	public final void process() {
		readData();
		processData();
		saveData();
	}
	
	// method to be implemented by subclass
	protected abstract void readData();
	protected abstract void processData();
	
	
	// concrete method shared by all subclasses
	protected void saveData() {
		System.out.println("Data saved ");
	}	
}


class CSVDataProcessor extends DataProcessor{

	@Override
	protected void readData() {
		System.out.println("Reading CSV data ");
	}

	@Override
	protected void processData() {
		System.out.println("Processing CSV data");
		
	}
}

class XMLDataProcessor extends DataProcessor{

	@Override
	protected void readData() {
	
		System.out.println("Reading XML data ");
		
	}

	@Override
	protected void processData() {
	System.out.println("Processing XML data ");
		
	}
		
}



public class TemplateMethodDemo {
	
	public static void main(String[] args) {

		DataProcessor csv = new CSVDataProcessor();
		DataProcessor xml = new  XMLDataProcessor();
		
		csv.process();
		xml.process();
	}
	
	
	
	
	

}
