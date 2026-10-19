package org.piyush;

public class Employee {
private String Name;
private int age;
private int basicsalary;

Employee(String Name,int age,int basicsalary)
{
	this.Name=Name;
	this.age=age;
	this.basicsalary=basicsalary;
}

public String getName() {
	return Name;
}

public void setName(String Name) {
	this.Name=Name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getBasicsalary() {
	return basicsalary;
}

public void setBasicsalary(int basicsalary) {
	this.basicsalary = basicsalary;
}
public double calculatesalary()
{
	return getBasicsalary();
}
}
