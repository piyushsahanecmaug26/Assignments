class PiramidReverse{
	public static void main(String args[]){
	int i;
	int j;
	int k;

	for(i=1;i<=5;i++){
		for(j=5;j>=i;j--){
			System.out.print(" ");
		}
		for(k=1;k<=i*2-1;k++){
			System.out.print("#");
		}
	System.out.println("");
	}

	for(i=1;i<=5;i++){
		for(j=1;j<=i+1;j++){
			System.out.print(" ");
		}
		for(k=7;k>=i*2-1;k--){
			System.out.print("#");
		}
	System.out.println("");
	}			
    }
}