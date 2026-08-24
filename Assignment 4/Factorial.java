import java.util.Scanner;
class Factorial{
	public static void main(String args[]){
	int n;
	int i;
	int a = 1;

	Scanner obj = new Scanner(System.in);

	System.out.println("Enter a number: ");
	n = obj.nextInt();

	for(i=1;i<=n;i++){
	a=a*i;
	}
	System.out.println("Factorial of " + n + " is " + a);

  }
	
}