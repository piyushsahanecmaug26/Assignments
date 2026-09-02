class PatternOne{
	public static void main(String args[]){
	int i; 
	int j;
	int n = 5;
	
		for(i=1;i<=5;i++){
			for(j=1;j<=i;j++){
				if(j<i){System.out.print(j + "*");}
				else{
				System.out.print(j);}
			}
		System.out.println("");

		}
	}
}
