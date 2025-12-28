package oops8;




class InsufficientBalanceException extends Exception{
	


	public InsufficientBalanceException( String message) {
		super(message);
	}
}


class BankAccount{
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	
	  void withdraw(double amount) throws InsufficientBalanceException{
			if( amount > balance) {
				throw new InsufficientBalanceException("withdraw of " + amount + " denied.  Available balance " + balance);
			}
		  balance -= amount;
		  System.out.println("withdrawal of " + amount + " succesful .  Available balance " + balance);
		}

}

public class CustomExceptionDemo {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(5000);
		
		try {
			account.withdraw(2000);
			account.withdraw(4000);
		} catch (InsufficientBalanceException e) {
			System.err.println("Exception caught " + e.getMessage());
		}
		
		System.out.println("graceful shutdown");
	}

}
