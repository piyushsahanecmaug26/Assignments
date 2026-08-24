import java.util.Scanner;
class SumArray{
	public static void main(String args[]){
	int x = 0;
	int[] numbers = new int[5];

	Scanner obj = new Scanner(System.in);

	System.out.println("Enter the 5 elements ");
	
		for(int i = 0;i<5;i++){
			numbers [i] = obj.nextInt();
		}
		for(int number: numbers){
			x=x+number;
			
		}
		System.out.println("");
		System.out.println("the sum of all number is " + x);
	
	}

}