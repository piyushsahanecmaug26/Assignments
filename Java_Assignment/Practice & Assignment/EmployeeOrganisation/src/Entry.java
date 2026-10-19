import java.util.ArrayList;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class Entry {
	 
	int employeecount =0;
	//Employee[] employees = new Employee[100];
	ArrayList<Employee> employees = new ArrayList<>();

	
	public void Add() {
		int choice;
		do {
			System.out.println("1. Manager");
			System.out.println("2. Engineer");
			System.out.println("3. Sales Person");
			System.out.println("4. Exit");
			choice = ConsoleInput.getInt();
			
			switch(choice) {
			case 1:
				System.out.println("1. Manager");
					System.out.println("Enter the name");
					String namemg = ConsoleInput.getString();
					
					System.out.println("Enter the address");
					String addressmg = ConsoleInput.getString();
					
					System.out.println("Enter the age");
					int agemg = ConsoleInput.getInt();
					
					System.out.print("Enter gender");
				    System.out.println(" 1. Male & 2. Female");
				    int genderChoicemg = ConsoleInput.getInt();
				    boolean gendermg;
				    if (genderChoicemg == 1) {
				        gendermg = true;
				    } else {
				        gendermg = false;
				    }
				    
				    System.out.println("Enter basic salary");
				    float basicSalarymg = ConsoleInput.getFloat();

				    System.out.println("Enter HRA");
				    float hra = ConsoleInput.getFloat();

				    employees.add(new Manager(namemg,addressmg,agemg,gendermg,basicSalarymg,hra));
					
					
				break;
				
			case 2:
				System.out.println("2. Engineer");
				
				System.out.println("Enter the name");
				String nameer = ConsoleInput.getString();

				System.out.println("Enter the address");
				String addresser = ConsoleInput.getString();
				
				System.out.println("Enter the age");
				int ageer = ConsoleInput.getInt();
				
				System.out.print("Enter gender");
			    System.out.println(" 1. Male & 2. Female");
			    int genderChoiceer = ConsoleInput.getInt();
			    boolean genderer;
			    if (genderChoiceer == 1) {
			        genderer = true;
			    } else {
			        genderer = false;
			    }
			    
			    System.out.println("Enter basic salary");
			    float basicSalaryer = ConsoleInput.getFloat();

			    System.out.println("Enter overtime");
			    float overtimeer = ConsoleInput.getFloat();
				

			    employees.add(new Enginer(nameer,addresser,ageer,genderer,basicSalaryer,overtimeer));
			    
				
				break;
				
			case 3:
				System.out.println("3. Sales Person");
				
				System.out.println("Enter the name");
				String namesp = ConsoleInput.getString();

				System.out.println("Enter the address");
				String addresssp = ConsoleInput.getString();
				
				System.out.println("Enter the age");
				int agesp = ConsoleInput.getInt();
				
				System.out.print("Enter gender");
			    System.out.println(" 1. Male & 2. Female");
			    int genderChoicesp = ConsoleInput.getInt();
			    boolean gendersp;
			    if (genderChoicesp == 1) {
			        gendersp = true;
			    } else {
			        gendersp = false;
			    }
			    
			    System.out.println("Enter basic salary");
			    float basicSalarysp = ConsoleInput.getFloat();

			    System.out.println("Enter sales Commission");
			    float comissionsp = ConsoleInput.getFloat();
				

			    employees.add(new Salesperson(namesp,addresssp,agesp,gendersp,basicSalarysp,comissionsp));
			    
				
				break;
	
			case 4:
				System.out.println("4. Exit");
				break;
				
			default:
				System.out.println("Enter valid input");
			}
			
		}while(choice !=4);
		
		
		
	}

	
	public void Display()
	{
		if (employees.isEmpty())
		{
			System.out.println("No Employees  available.");
			return;
		}
		
		for(int temp = 0;temp<employees.size();temp++)
		{
			Employee emp = employees.get(temp);
			
			System.out.println("Employee number" + employeecount);
			System.out.println("Name: " + emp.getName());
	        System.out.println("Address: " + emp.getAddress());
	        System.out.println("Age: " + emp.getAge());
	        System.out.println("Gender: " + (emp.isGender() ? "Male" : "Female"));
	        System.out.println("Basic Salary: " + emp.getBasicSalary());
	        
	        if (emp instanceof Manager) 
	        {
	            Manager manager = (Manager) emp;
	            System.out.println("HRA: " + manager.getHra());
	        } 
	        else if (emp instanceof Enginer)
	        {
	            Enginer engineer = (Enginer) emp;
	            System.out.println("Overtime: " + engineer.getOvertime());
	        } 
	        else if (emp instanceof Salesperson) 
	        {
	            Salesperson salesperson = (Salesperson) emp;
	            System.out.println("Commission: " + salesperson.getCommission());
	        }
	        System.out.println("");
		}
		
	}
	

	public void Delete()
	{
		if (employees.isEmpty())
		{
			System.out.println("No Employees  available.");
			return;
		}
		
		System.out.println("Enter the Employee number to delete");
		int empnumber = ConsoleInput.getInt();
		if(empnumber < 1 || empnumber > employees.size())
		{
			System.out.println("Invalid employee number");
			return;
		}
		else
		{
			employees.remove(empnumber);
		}
		
		System.out.println("Employees  delete success.");
		
	}
	
	
	public void Sort() 
	{
		if(employees.isEmpty())
		{
			System.out.println("No employee available");
			return;
		}
		employees.sort((first,second) -> first.compareTo(second) >0?1:
				first.compareTo(second)<0?-1:0);
		System.out.println("Employee sorted sucessfully");
		
	}


	public void Save()throws IOException
	{
		FileOutputStream fos = new FileOutputStream("Emplyee.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employees);
		oos.close();
	}

	
	public void Load() throws IOException, ClassNotFoundException 
	{
	    FileInputStream fis = new FileInputStream("Emplyee.dat");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    employees = (ArrayList<Employee>) ois.readObject();
	    ois.close();
	    System.out.println("Employees loaded successfully.");
	}
	
}
