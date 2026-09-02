import java.util.Scanner;
class Allarray{
	public static void main(String args[]){
	int[] numbers = new int[5];

	Scanner obj = new Scanner(System.in);

	System.out.println("Enter the 5 elements ");
	
		for(int i =0;i<5;i++){
			numbers [i] = obj.nextInt();
		}
		for(int number : numbers){
			System.out.print(" " + number);
		}
	
	}

}