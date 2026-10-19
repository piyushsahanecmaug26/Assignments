package org.piyush;

public class Manager extends Employee{

	protected float hra;
	
	public Manager(String Name,int age,int basicsalary,float hra) {
	super(Name,age,basicsalary);
	this.hra=hra;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}
	@Override
	public double calculatesalary()
	{
		return getBasicsalary()+hra;
	}
}
