import java.util.Scanner;
class PalindromeString{
	public static void main(String[] args){
		String given = "";
		String back = "";
		char ch;
		int i;

	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the string ");
	given = obj.next();

		
		for(i=0;i<given.length();i++){
			ch = given.charAt(i);
			back = ch+back;
		}
		if(given.equals(back)){
		System.out.println("the string '"+given+"' is a palindrome");
		}
		else{System.out.println("the string '"+given+"' is not a palindrome");}

	}

}