package oops1;

public class BankAccount {

    private long accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(long accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    @Override
    public String toString() {
        return "BankAccount{accountNumber=" + accountNumber +
                ", holderName='" + holderName + '\'' +
                ", balance=" + balance + '}';
    }

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount(1234, "Customer 1", 100000);
        BankAccount b2 = new BankAccount(5678, "Customer 2", 2000);

        b1.deposit(20000);
        System.out.println(b1);

        if (!b2.withdraw(3000)) {
            System.out.println("Withdrawal failed");
        }
        System.out.println(b2);

        b2.withdraw(1000);
        System.out.println(b2);
    }
}
