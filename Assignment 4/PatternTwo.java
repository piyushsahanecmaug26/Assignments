class PatternTwo{
	public static void main(String args[]){
		int i;
		int j;
		int n = 5;

		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				if(i<=j){System.out.print(i);}
				else{System.out.print(i + "*");}
			}
		System.out.println("");
			
		}
		for(i=1;i<=n;i++){
			for(j=n;j>=i;j--){
				if(i>=j){System.out.print((n+1-i));}
				else{System.out.print((n+1-i) + "*");}
			}
		System.out.println("");
		}
	}

}
