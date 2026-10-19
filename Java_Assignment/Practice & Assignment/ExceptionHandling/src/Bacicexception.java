import java.util.Scanner;
public class Bacicexception {
	
	 static void checkage(int age) throws Exception {
		if(age<18)
		{
			throw new Exception ("age must be 18 or above");
		}
		System.out.println("eligible");
	}
	 
	 static void withdraw(int balance, int amount)
		        throws InsufficientBalanceException {

		    if (amount > balance) {
		        throw new InsufficientBalanceException("Insufficient balance");
		    }

		    System.out.println("Withdrawal successful");
		}
	 

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int a =10;
		int b =0;
		int age = 15;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the index of numbers");
		int index =scan.nextInt();
		
		
		try {
			System.out.println(arr[index]);
			System.out.println(a/b);
			
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("incorrect index");
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide");
		}
		finally {
			System.out.println("Program cloased");
		}
		
		try {
			checkage(15);
			
		}catch(Exception e){
			System.out.println(e.getLocalizedMessage());
		}
		try {
			withdraw(5000,6000);
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
