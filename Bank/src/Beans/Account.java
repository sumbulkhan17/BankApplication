package Beans;

public class Account {
	private int accountNumber;
	private int amount;
	public Account(int accountNumber, int amount) {
		super();
		this.accountNumber = accountNumber;
		this.amount = amount;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	 
}
