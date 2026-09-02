import java.util.Scanner;
class MulOf{
	public static void main(String Args[]){
	int i;
	int n;
	

	Scanner obj = new Scanner(System.in);

	System.out.println("Enter the number: ");
	n = obj.nextInt();

	for(i=1;i<=n;i++){
		if(i%3==0){
		System.out.print(" " + i);
		}
		
	}
    }
}