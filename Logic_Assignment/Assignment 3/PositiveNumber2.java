import java.util.Scanner;
class PositiveNumber2{

static int num;

	int ForPositive(int num){
	
	Scanner obj = new Scanner(System.in);
		do{
			System.out.println("Enter a positive number : ");
			num = obj.nextInt();
		}
		while(num<=0);	
	return num;
	}


	public static void main(String args[]){

	PositiveNumber2 objclass = new PositiveNumber2();
	num = objclass.ForPositive(num);

	System.out.println("You entered a positive number : " + num);

    }	

}
