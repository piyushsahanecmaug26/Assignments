import java.util.Scanner;
class PositiveNumber{

	void ForPositive(int num){
	
	System.out.println("You entered a positive number : " + num);
	}


	public static void main(String args[]){

	Scanner obj = new Scanner(System.in);
	int num;
	
	do{
	System.out.println("Enter a positive number : ");
	num = obj.nextInt();
	}
	while(num<=0);	

	PositiveNumber objclass = new PositiveNumber();
	objclass.ForPositive(num);

    }	

}