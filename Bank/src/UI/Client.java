package UI;

import Exceptions.InsufficientBalanceException;
import Exceptions.InsuffientOpeningAmountException;
import Exceptions.InvalidAccountNumberException;
import Service.*;

public class Client {
	
	public static void main( String[] args) {
		
		ICICIBank bank = new ICICIBank();
		
		try {
			System.out.println("Creating Account:");
			System.out.println(bank.createAccount(100, 2000));
			System.out.println(bank.createAccount(101, 20000));
		}catch(InsuffientOpeningAmountException e) {
			System.out.println("Insufficient Opening Amount!!! :(\n Minimum Amount Required is 500 INR!!");
		}
		try {
			System.out.println("Withdrawing Amount:");
			System.out.println("New Balance = "+bank.withdrawAmount(101, 5000));
			
		}catch(InsufficientBalanceException e) {
			System.out.println("Insufficient Balance Exception");
		}
		catch(InvalidAccountNumberException e) {
			System.out.println("Invalid Account Number");
		}
		try {
			System.out.println("Depositing Amount:");
			System.out.println("New Balance = "+bank.depositAmount(101,2000));
			
		}catch(InvalidAccountNumberException e) {
			System.out.println("Invalid Account Number");
		}
		try {
			System.out.println("Transferring Fund:");
			int[] a = bank.fundTransfer(101,101,400);
			System.out.println("New Balance of Account Number 100 = "+a[0]
					+"\nNew Balance of Account Number 101 = "+a[1]);
			
		}catch(InvalidAccountNumberException e) {
			System.out.println("Invalid Account Number");
		}
		catch(InsufficientBalanceException e) {
			System.out.println("Insufficient Balance Exception");
		}
		

	}

}
