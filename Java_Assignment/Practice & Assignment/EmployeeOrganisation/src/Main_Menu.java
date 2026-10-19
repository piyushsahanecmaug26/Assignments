import java.io.IOException;
import java.lang.ClassNotFoundException;

public class Main_Menu {

	public static void main(String[] args) {
		Entry obj =new Entry();
//					alesperson = new Salesperson[10];
	
		
		System.out.println("         Menu  ");
		int menu;
		
		do{
			System.out.println("1. Add");
			System.out.println("2. Display");
			System.out.println("3. Delete");
			System.out.println("4. Sort");
			System.out.println("5. Save");
			System.out.println("6. Load");
			System.out.println("7. Exit");
			menu = ConsoleInput.getInt();	
			
			switch(menu) {
			case 1:
				System.out.println("Wellcome to Add menue");
				obj.Add();
				System.out.println("***********************************************");
				break;
				
			case 2:
				System.out.println("2. Display");
				obj.Display();
				System.out.println("***********************************************");
				break;
				
			case 3:
				System.out.println("3. Delete");
				obj.Delete();
				System.out.println("***********************************************");
				break;
	
			case 4:
				System.out.println("4. Sort");
				obj.Sort();
				System.out.println("***********************************************");
				break;
	
			case 5:
				System.out.println("5. Save");
				try{
					obj.Save();
				} catch (IOException e) {
					System.out.println("error while saving");
				}
				break;
	
			case 6:
				System.out.println("6. Load");
				try{
					obj.Load();
				}catch (IOException e) 
				 {
					 System.out.println("error loading employee");
				 }catch(ClassNotFoundException e)
				{
					 System.out.println("error class not fount");
				}
				break;
				
			case 7:
				System.out.println("7. Exit");
				break;
		
			default:
				System.out.println("Enter valid option from menu");
			}		
			
		}while(menu!=7);

	}

}
