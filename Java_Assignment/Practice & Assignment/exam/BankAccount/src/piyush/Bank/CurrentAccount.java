package piyush.Bank;

class CurrentAccount extends Accounts {
	
	CurrentAccount(int accountNumber,double balance){
		super(accountNumber,balance);
	}	
	@Override
	void withdraw(double amount) throws InsufficientBalanceException {
			if(balance<0 || amount > balance) {
			throw new InsufficientBalanceException();	
			}
			balance=balance-amount;
	}
}
