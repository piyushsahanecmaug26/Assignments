package piyush.Bank;

class SavingAccount extends Accounts {

	SavingAccount(int accountNumber,double balance){
		super(accountNumber,balance);
	}
	
	@Override
	void withdraw(double amount) throws InsufficientBalanceException {
			if(amount>balance || balance - amount <500) {
			throw new InsufficientBalanceException();	
			}
			balance=balance-amount;
	}
}
