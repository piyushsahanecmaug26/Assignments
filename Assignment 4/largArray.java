import java.util.Arrays;
import java.util.Scanner;
class largArray{
	public static void main(String args[]){
	String[] nums = new String[5];

		Scanner obj = new Scanner(System.in);

		System.out.print("Enter the ");

			for(int i=0;i<5;i++){
			nums [i] = obj.next();
			}
		Arrays.sort(nums);
		System.out.print(nums[4]);
		
		 
	}

}