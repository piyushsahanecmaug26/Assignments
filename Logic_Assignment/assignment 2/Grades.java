class marks{
	public static void main(String arg[]){
  	int maths = 59;
	int science = 79;
	int history = 89;
	
	
	int avg = (maths+science+history)/3;
	System.out.println("Your average marks are: " + avg);
	
	if(avg>=90)
	{System.out.println("Grade: A");}
	
	else if(avg>=70 )
	{System.out.println("Grade: B");}

	else if(avg>=50 )
	{System.out.println("Grade: C");}

	else if(avg>=30 )
	{System.out.println("Grade: D");}

	else
	{System.out.println("Fail");}

  }
}