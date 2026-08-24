import java.util.Scanner;
class NamesArray{
	public static void main(String args[]){
	String[] names = new String[5];

	Scanner obj = new Scanner(System.in);

	System.out.print("Enter the 5 Names ");
	
		for(int i =0;i<5;i++){
			names [i] = obj.next();
		}
		for(String name : names){
			System.out.println(name);
		}
	
	}

}