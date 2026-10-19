import java.io.Serializable;

public abstract  class Employee implements Comparable<Employee> ,Serializable {
	protected String name;
	protected String address;
	protected int age;
	protected boolean gender;
	protected float basicSalary;
	
	public Employee(String name,String address,int age,boolean gender,float basicSalary) {
		super();
		this.name = name;
		this.address = address;
		setAge(age);
		this.gender = gender;
		this.basicSalary = basicSalary;
	}
	@Override
	public int compareTo(Employee other) 
	{
		int compare = this.name.compareTo(other.name);	
		
		if(compare != 0)
			return compare;
		
		else
		return Integer.compare(this.age, other.age);
	}
//	@Override
//	public int compareToAge(Employee other) 
//	{
//		return Integer.compare(this.age, other.age);	
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<18 || age>65)
			this.age=21;
		else
			this.age=age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
	
}
