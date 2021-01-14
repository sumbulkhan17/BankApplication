package Service;

import Exceptions.InsufficientBalanceException;
import Exceptions.InsuffientOpeningAmountException;
import Exceptions.InvalidAccountNumberException;

public interface Bank {
	String createAccount(int accountNumber,int amount) throws InsuffientOpeningAmountException;
	int withdrawAmount(int accountNumber,int amount) throws InvalidAccountNumberException, InsufficientBalanceException;
	int depositAmount(int accountNumber,int amount) throws InvalidAccountNumberException;
	int[] fundTransfer(int accountNumber1,int accountNumber2,int amount) throws InvalidAccountNumberException,InsufficientBalanceException;
}
