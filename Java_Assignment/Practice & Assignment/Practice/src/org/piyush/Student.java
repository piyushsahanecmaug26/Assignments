package org.piyush;
import java.lang.Comparable;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	double marks;
	
Student(int rollno,String name,double marks)
{
	this.rollno=rollno;
	this.name=name;
	this.marks=marks;
	
}
public void setname(String name){
	this.name=name;
}
public String getname(){
	return name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
void Display() {
	System.out.println("Roll No: " + rollno);
    System.out.println("Name: " + name);
    System.out.println("Marks: " + marks);
}

@Override
public String toString() 
{
	return "Roll No: " + rollno +
	           ", Name: " + name +
	           ", Marks: " + marks;
}

@Override
public int compareTo(Student other) 
{
	return this.name.compareTo(other.name);
}
}
