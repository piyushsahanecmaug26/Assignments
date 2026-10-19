package piyush.Bank;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Wellcome to bank");
		System.out.println("Enter account type");
		String accountType = scan.nextLine();
		System.out.println("Enter account number");
		int accountNumber = scan.nextInt();
		System.out.println("Enter account balance temp because value not given");
		double balance = scan.nextDouble();
		System.out.println("Enter Withdraw amount");
		double withdrawAmount = scan.nextDouble();
		
		Accounts account;
		if(accountType.equals("Saving")){
			account = new SavingAccount(accountNumber,balance);
		}
		else {
			account = new CurrentAccount(accountNumber,balance);
		}
		
		try {
			account.withdraw(withdrawAmount);
			System.out.println("Withdraw successful");
			System.out.println("remaining balance"+ account.balance);
			
			
			
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
