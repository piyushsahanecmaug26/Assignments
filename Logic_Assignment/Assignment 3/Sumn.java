import java.util.Scanner;
class Sumn{
static int n;
	int calculateSum(int n){
	     int i;
	     int a = 0;
		for(i=0;i<=n;i++){
			a=a+i;
		}
			return a;

	}

	public static void main(String args[]){
		Scanner givenno = new Scanner(System.in);
		
		System.out.println("enter the number ");
		n = givenno.nextInt();  //assigning number through scanner

		Sumn obj = new Sumn();
		int result = obj.calculateSum(n);  //method calling
		System.out.println("The sum of number from 1 to " + n + " is " + result);
	}	

}