package oops2;

public class BankAccount {
	
	private long accountNumber;
	private double balance;
	
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber( long accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean setBalance( double balance) {
		
		if ( balance >= 0 ) {
			this.balance = balance;
			return true;
		}
		return false;
		
	}
	
	
	
	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount();
		
		b1.setAccountNumber(10001);
		
		if(!b1.setBalance(-222)) {
			System.out.println("the balance you are trying to set is invalid!");
		}
		
		b1.setBalance(2000);
		
	
		System.out.println("---------- Account Details ------------");
		System.out.println("Account number : " + b1.getAccountNumber());
		System.out.println("Balance : " + b1.getBalance());
		
		
		
	}

}
