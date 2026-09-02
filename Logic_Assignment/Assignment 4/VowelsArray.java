import java.util.Scanner;
class VowelsArray{
	public static void main(String[] args){
		String given = "";
		char ch;
		int i;
		int vowels = 0;

	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the string ");
	given = obj.next();

		
		for(i=0;i<given.length();i++){
			given.charAt(i);
			if(given.charAt(i) == 'a' || given.charAt(i) == 'e' || given.charAt(i) == 'i' || given.charAt(i) == 'o' || given.charAt(i) == 'u'){
			vowels++;
			}
		}
		System.out.println(vowels);

	}

}