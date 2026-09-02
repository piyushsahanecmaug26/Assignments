import java.util.Scanner;
class Call{

	void pri(int a,int b){
		System.out.println("First number is " + a);
		System.out.println("Second number is " + b);
		int Sum = a+b;
		System.out.println("The sum of numbers " + Sum);

		}



	public static void main(String args[]){

	Scanner num1 = new Scanner(System.in);
	Scanner num2 = new Scanner(System.in);


	System.out.println("Enter number : ");
	int a = num1.nextInt();

	System.out.println("Enter number : ");
	int b = num2.nextInt();

	Call obj = new Call();
	obj.pri(a,b);
	
	}
}