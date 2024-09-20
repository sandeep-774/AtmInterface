package atm;

	public class BankAccount {
	    private double balance;
	    
	    public BankAccount(double currentBalance) {
	        this.balance = currentBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        } else {
	            System.out.println("Deposit amount must be greater than zero.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Withdraw Succesfully..");
	        } else {
	            System.out.println("Insufficient funds or invalid amount.");
	        }
	    }
}
