import java.util.Scanner;
class oddNumber {
	public static void main(String args[]){
	int num;
	int i;

	Scanner obj = new Scanner(System.in);

	System.out.println("Enter a number: ");
	num = obj.nextInt();

	for(i=1;i<=num;i+=2){
		System.out.println(i);
	}
	
   }
	
}