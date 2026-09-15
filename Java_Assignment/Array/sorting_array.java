
public class sorting_array {

	int arr [];
	
	public static void main(String[] args) {
		System.out.println("Enter the elements to input in array :");
		int numofinput = ConsoleInput.getInt();
		
		int arr [] = new int [numofinput];
		
			
		for(int temp = 0;temp<numofinput;temp++) {
			System.out.print("Enter the " + (temp+1) + " element : ");
			arr[temp] = ConsoleInput.getInt();
		}
		
		System.out.print("The array is : " );
		for(int temp = 0;temp<numofinput;temp++) {
			System.out.print(" "+ arr[temp]); 
		}
		System.out.println("");
//add========================================================================
		int arraysum =0;
		for(int temp = 0;temp<numofinput;temp++) {
			arraysum += arr[temp];
		}
		System.out.println("The sum of array is : " + arraysum );

//avg=========================================================================	
		double avgofarray = (double)arraysum/numofinput;
		
		System.out.println("The avg of array is : " + avgofarray );
//coping the array==================================================
		int arrnew [] = new int [numofinput];
		for(int temp = 0;temp<numofinput;temp++) {
			arrnew[temp] = arr[temp];
		}
		System.out.print("The second array is : " );
		for(int temp = 0;temp<numofinput;temp++) {
			System.out.print(" "+ arrnew[temp]); 
		}
		System.out.println("");

//max & min ===========================================================
		int min = arr[0];
		int max = arr[0];
		for(int temp = 0;temp<numofinput;temp++) {
			if(min>arr[temp])
				min=arr[temp];
			
			if(max<arr[temp])
				max = arr[temp];
		}
		System.out.println("Minimum element in array is " + min);
		System.out.println("Maximum element in array is " + max);
		
//reverse================================================================
		System.out.print("The reverse array is : ");
		for(int temp = numofinput-1;temp>=0;temp--) {
			System.out.print(" " + arr[temp]);
		}
		System.out.println("");
//duplicate===========================================================
		System.out.print("The duplicate elements are : ");
		for(int temp = 0;temp<numofinput;temp++) {
			for(int temp2 = (temp+1);temp2<numofinput;temp2++) {
				if(arr[temp]==arr[temp2])
					System.out.print(" " + arr[temp] + " at index " + temp);				
			}
		}
		System.out.println("");
//2 array compare ====================================================================		
		int arr1 [] = new int [numofinput];
		int arr2 [] = new int [numofinput];
		
		System.out.println("Enter the first array elements to compare ");
		for(int temp = 0;temp<numofinput;temp++) {
			System.out.print("Enter the " + (temp+1) + " element of first array : ");
			arr1[temp] = ConsoleInput.getInt();
		}
		
		System.out.println("Enter the secont array elements to compare ");
		for(int temp = 0;temp<numofinput;temp++) {
			System.out.print("Enter the " + (temp+1) + " element of second array : ");
			arr2[temp] = ConsoleInput.getInt();
		}
		
		System.out.println("The dublicate elements from both arrays are : ");
		for(int temp = 0;temp<numofinput;temp++) {
			for(int temp2 = 0;temp2<numofinput;temp2++) {
				if(arr1[temp]==arr2[temp2])
					System.out.print(arr1[temp] + ", ");				
			}
		}
		
     }
}
