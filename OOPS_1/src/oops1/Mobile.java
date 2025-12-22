package oops1;

public class Mobile {
	
	private String brand;
	private int batteryLevel;
	
	
	public Mobile(String brand , int batteryLevel) {
		this.brand = brand;
		this.batteryLevel=batteryLevel;
	}
	
	 public void usePhone(int minutes) {
	        if (minutes <= 0 || batteryLevel <= 0) {
	            return;
	        }

	        batteryLevel -= minutes;

	        if (batteryLevel < 0) {
	            batteryLevel = 0;
	        }
	    }
	
	  @Override
	    public String toString() {
	        return "For the given Mobile the Brand is : " + brand +
	                "  and Battrey  is= " + batteryLevel  ;
	    }
	
	
	public static void main(String[] args) {
		
		Mobile m1 = new Mobile("Apple", 90);
		Mobile m2 = new Mobile("Google", 0);
		
		
		
		m1.usePhone(10);
		System.out.println(m1);
	
		
		m2.usePhone(100);
		System.out.println(m2);
		
	}

}
