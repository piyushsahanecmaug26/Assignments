import java.util.Scanner;
class EvenNumber{
	public static void main(String args[]){
	int i;
	int num;
	
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter a number: ");
	num = obj.nextInt();

	for(i=2;i<=num;i+=2){
		System.out.print(" " + i);
	}
   }
}