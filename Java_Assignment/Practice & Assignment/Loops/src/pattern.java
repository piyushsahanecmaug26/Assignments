public class pattern {

	public static void main(String[] args) {
		for(int temp =0;temp<5;temp++) {
			for(int temp2 =0;temp2<temp+1;temp2++) {
				System.out.print("*");
			}
			System.out.println("");
		}
//======================================		
		System.out.println("reverse parymide");
		for(int temp =0;temp<5;temp++) {
			for(int temp2 =5;temp2>temp;temp2--) {
				System.out.print("*");
			}
			System.out.println("");
		}
//============================================	
		System.out.println("number parymide");
		int num=0;
		for(int temp =0;temp<4;temp++) {
			for(int temp2 =0;temp2<temp+1;temp2++) {
				num++;
				System.out.print(" " + num);
			}
			System.out.println("");
		}
		
//============================================			
		System.out.println("column number parymide");
		for(int temp =0;temp<6;temp++) {
			for(int temp2 =0;temp2<temp+1;temp2++) {
				System.out.print(" " + (temp2+1));
			}
			System.out.println("");
		}
		
//============================================================
		System.out.println("reverse column parymide");
		for(int temp =0;temp<6;temp++) {
			for(int temp2 =1;temp2<=(6-temp);temp2++) {
				System.out.print(" " + (temp2));
			}
			System.out.println("");
		}
		
		
	}

}
