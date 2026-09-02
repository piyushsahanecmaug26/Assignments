class EvenNumber{

	void printEvenNumber(int s){
	
	if(s%2 == 0){
	System.out.print(" " + s );
	}
			
	}

	public static void main(String args[]){

	int s = 1;
	int e = 50;
	
	while(s <= e){	
	
	EvenNumber m1 = new EvenNumber();
	m1.printEvenNumber(s);
	
	s++;}
	
	}

}	