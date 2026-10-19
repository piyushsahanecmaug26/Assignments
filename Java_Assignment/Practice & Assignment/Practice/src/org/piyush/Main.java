package org.piyush;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		//Employee e1 =new Manager("piyush",12,2500,23.23f);
	//	System.out.println(e1.calculatesalary());
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(11,"piyush",5.32));
		students.add(new Student(12,"yash",19.6));
		students.add(new Student(13,"vijay",20.21));
		students.add(new Student(14,"yashika",12.32));
		students.add(new Student(15,"piyush",13.16));
		
		Function<Student,String> f = s-> s.getname();
		for(Student s : students)
			System.out.println(f.apply(s));
		
//		Comparator<Student> id =(First,Second) -> 
//		Double.compare(First.getRollno(),Second.getRollno());
//		students.sort(id);
		
		
//		for(int temp = 0;temp<students.size();temp++)
//		{
//			Student s = students.get(temp);
//			s.Display();
//			System.out.println("*******************************");
//			if(s.getname().equals("sashvat"))
//				System.out.println("found");
//		}
//		System.out.println("enter the name to search");
//		String str = scan.next();
//		for(int temp = 0;temp<students.size();temp++)
//		{
//			Student s = students.get(temp);
//			if(s.getname().equals(str)) 
//			{
//				System.out.println("found");
//				return;
//			}
//			else
//			{
//				System.out.println("Not found");
//				return;
//			}
//			
//		}
		
		Predicate<Student> p = s -> s.getMarks()>15;
		
		for(Student s: students)
		{
			if(p.test(s)) {
				s.Display();
			}
		}

	}

}
