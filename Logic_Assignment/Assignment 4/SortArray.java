import java.util.Scanner;
import java.util.Arrays;
class SortArray{
	public static void main(String args[]){
	int i;
	int[] numbers = new int[5];

	Scanner obj = new Scanner(System.in);

	System.out.println("Enter the 5 elements ");
	
		for(i = 0;i<5;i++){
			numbers [i] = obj.nextInt();
		}	
		Arrays.sort(numbers);
		for(i=0;i<5;i++){
		 System.out.print(" " + numbers[i]);
		}
	}

}