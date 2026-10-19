package piyush.Bank;

abstract class Accounts {
	  int accountNumber;
	  double balance;
	 
	  Accounts(int accountNumber,double balance){
		  this.accountNumber=accountNumber;
		  this.balance=balance;
	  }
	   abstract void withdraw(double amount) throws InsufficientBalanceException;

}
