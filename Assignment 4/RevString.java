import java.util.Scanner;
class RevString{
	public static void main(String[] args){
		String given = "";
		String rev = "";
		char ch;
		int i;

	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the string ");
	given = obj.next();

		
		for(i=0;i<given.length();i++){
			ch = given.charAt(i);
			rev = ch+rev;
		}
		System.out.println(rev);

	}

}