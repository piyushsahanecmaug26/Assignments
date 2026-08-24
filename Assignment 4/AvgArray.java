import java.util.Scanner;
class AvgArray{
	public static void main(String args[]){
	int x = 0;
	float z;
	int[] numbers = new int[5];

	Scanner obj = new Scanner(System.in);

	System.out.println("Enter the 5 elements ");
	
		for(int i = 0;i<5;i++){
			numbers [i] = obj.nextInt();
		}
		for(int number: numbers){
			x=x+number;	
		}
		z=x/5;	
		System.out.println("");
		System.out.println("the sum of all number is " + z);
	
	}

}