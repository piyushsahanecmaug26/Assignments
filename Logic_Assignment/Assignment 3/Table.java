import java.util.Scanner;
class Table{
static int num;

	void printTable(int num){
	  int i;
		for(i=1;i<=10;i++){
		int r = i*num;
		System.out.println(num + " x " + i + " = " + r);
		}
	}

	public static void main(String args[]){

		Scanner givenno = new Scanner(System.in);

		System.out.println("Enter the number ");
		num = givenno.nextInt();

		Table call = new Table();
		call.printTable(num);
		
   }

}