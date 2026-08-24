class PatternThree {
	public static void main(String arg[]){
		int i;
		int j;
		int n = 5;

		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				System.out.print(j*2-1);
				if(j<i){System.out.print("*");}
			}
		System.out.println("");
		}

	}

}