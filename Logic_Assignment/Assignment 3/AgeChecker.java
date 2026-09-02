import java.util.Scanner;
class AgeChecker{
	
	void checker(int age){
	
		System.out.println("Your age is : " + age);

	if(age<18){System.out.println("Your are an Minor.");}      //minor
	
	else if(age<=59){System.out.println("Your are an Adult.");}        //adult

	else{System.out.println("Your are an Senior Citizen");}  //Senior Citizen

	}

	public static void main(String args[]){
	
	Scanner obj = new Scanner(System.in);

	System.out.println("Enter your age : ");
	int age = obj.nextInt();

	AgeChecker obj1 = new AgeChecker();
	obj1.checker(age);

	
	}

}