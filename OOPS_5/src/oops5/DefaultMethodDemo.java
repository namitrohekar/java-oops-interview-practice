package oops5;

interface Notifier{
	
	abstract void notifyUser(String message);
	
	 default void log(String message) {
		
		System.out.println("Log :" + message);
	}
}

class EmailNotifier implements Notifier{
	
	@Override 
	public void notifyUser(String message) {
		log("Email  sent");
		System.out.println(message);
	}
	
}
class SMSNotifier implements Notifier{
	
	@Override
	public void notifyUser(String message) {
		log("SMS sent");
		System.out.println(message);
	}
}

public class DefaultMethodDemo {
	
	public static void main(String[] args) {
		Notifier emailNotify = new EmailNotifier();
		Notifier smsNotify = new SMSNotifier();
		
		emailNotify.log("Enabling Email sevice");
		emailNotify.notifyUser("Your fogot password link is xyz.com");
		
		smsNotify.log("Enabling SMS service");
		smsNotify.notifyUser("Your otp is 1234");
	}

}
