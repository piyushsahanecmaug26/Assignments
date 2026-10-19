public class oddnumbers {

	public static void main(String[] args) {
		
//odd no from 1-1000
		System.out.println("odd numbers from 1 to 1000");		
		for(int temp=1;temp<=1000;temp++) {
			int temp2 =temp%2;
			if(temp2 !=0)
				System.out.print(temp + " ");	
		}
		System.out.println("");
		
//even number
		System.out.println("Even numbers from 1 to 500");		
		for(int temp=1;temp<=500;temp++) {
			if(temp%2 ==0)
				System.out.print(temp + " ");	
		}
		System.out.println("");
		
//7th element
		System.out.println("7th element from 1 to 200");		
		for(int temp=1;temp<=200;temp++) {
			if(temp%7 ==0)
				System.out.print(temp + " ");	
		}
		
		
	}

}
