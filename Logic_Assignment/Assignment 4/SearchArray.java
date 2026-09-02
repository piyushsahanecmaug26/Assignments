import java.util.Arrays;
import java.util.Scanner;

class SearchArray {
    public static void main(String args[]) {

        Integer[] numbers = new Integer[5];

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = obj.nextInt();
        }

        System.out.print("Enter number to search: ");
        int search = obj.nextInt();

        if (Arrays.asList(numbers).contains(search)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}