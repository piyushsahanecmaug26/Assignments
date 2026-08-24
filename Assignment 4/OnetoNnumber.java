import java.util.Scanner;
class OnetoNnumber{
	public static void main(String args[]){
	int n;
	int i;	
	
	Scanner obj =new Scanner(System.in);
	
	
	System.out.println("Enter the number : ");
	n = obj.nextInt();

	for(i=1;i<=n;i++){
		System.out.print(" "+ i);
		
	  }

	}
}