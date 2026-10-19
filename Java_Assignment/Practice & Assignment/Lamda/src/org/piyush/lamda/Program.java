package org.piyush.lamda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Program {
	public static void main(String[] args) 
	{
//		Predicate<String> validatePassword = str -> str.length()>=5 ? true : false;
//		System.out.println("hello " + validatePassword.test("helo"));
		
		ArrayList<String> trainees = new ArrayList<>();
		trainees.add("Kajal");
		trainees.add("Rahul");
		trainees.add("Kiyan");
		trainees.add("Aishwarya");
		trainees.add("Vivek");
		
		trainees.stream()
		.filter(str -> str.startsWith("k"))
		.sorted()
		.forEach(System.out::println);
		
//		trainees.sort((first, second) -> 
//				first.compareTo(second) > 0 ?1: 	
//				first.compareTo(second) <0?-1:0);
//		
//		System.out.println(trainees);
//	//Sort array 
//		
//		ArrayList<Integer> numbers = new ArrayList<>();
//		numbers.add(56);
//		numbers.add(15);
//		numbers.add(26);
//		numbers.add(58);
//		numbers.add(10);
//		numbers.add(89);
//		
//		numbers.sort((first,second) -> 
//				first.compareTo(second)>0?1: 
//				first.compareTo(second)<0?-1:0);
//		
//		System.out.println(numbers);
//		System.out.println(numbers.get(numbers.size()-1));
//		System.out.println(numbers.get(0));
//	//Largest number
//		
//		Supplier<Integer> Randomnum = () -> (int)(Math.random()*1000);
//		System.out.println(Randomnum.get());
//	//random 3 digit number
//		
//		Function<ArrayList<Integer>,ArrayList<Integer>> Revarray = (arr) -> {
//			ArrayList<Integer> rev = new ArrayList<>();
//			
//			for(int temp = 0;temp<arr.size();temp++)
//			{
//				rev.add(arr.get(arr.size()-1-temp));
//			}
//			return rev ;
//		};
//		ArrayList<Integer> result = Revarray.apply(numbers);
//		System.out.println(result);
//	//reverse the array
		
		
	}
}







//	Display objDisplay =new Display()
//			{
//				@Override
//				public void show()
//				{
//					System.out.println("This is display");		
//				}
//			};
//			
//	Display objDisplay2 =new Display()
//			{
//				@Override
//				public void show()
//				{
//					System.out.println("This is display");				
//				}
//			};		
//			
//}
/////////////////////////////////////////////////////////////////////////////

//	PasswordValidator basicValidator = (String str) ->
//		{
//			if(str.length()>=5)
//				return true;
//			else
//				return false;
//		};

//different way to difine lambda 
//	PasswordValidator basicValidator = (str) ->
//		{
//			if(str.length()>=5)
//				return true;
//			else
//				return false;
//		};		

//way 3 for a single argument
//	PasswordValidator basicValidator = str ->
//		{
//			if(str.length()>=5)
//				return true;
//			else
//				return false;
//		};	

//PasswordValidator basicValidator = str -> str.length()>=5 ? true: false;
//
//
//System.out.println(basicValidator.validate("Text"));
//System.out.println(basicValidator.validate("Hello"));
//
//PasswordValidator advanceValidator = str->
//{
//	if(str.length()>=5 && str.indexOf('@')!=-1)
//		return true;
//	else
//		return false;
//};
//
//System.out.println("hello@123 : " + advanceValidator.validate("Hello@123"));
//System.out.println("hello123 : " + advanceValidator.validate("Hello123"));