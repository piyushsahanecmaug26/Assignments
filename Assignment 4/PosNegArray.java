import java.util.Arrays;
import java.util.Scanner;
class PosNegArray{
	public static void main(String args[]){
	int[] nums = new int[6];

		Scanner obj = new Scanner(System.in);

		System.out.print("Enter the ");

			for(int i=0;i<6;i++){
			nums [i] = obj.nextInt();
			}
		//Arrays.sort(nums);
		int pos = 0;
		int neg = 0;
		for(int i=0;i<6;i++){
			//System.out.print(nums[i]);
				if(nums[i]>0){pos++;}
				else{neg++;}
			}
		System.out.println("the positive : " + pos);
		System.out.println("the neg : " + neg);
		
		
		 
	}

}