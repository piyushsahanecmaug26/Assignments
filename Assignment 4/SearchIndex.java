import java.util.Arrays;
import java.util.Scanner;

class SearchIndex {
    public static void main(String args[]) {

        int[] numbers = new int[5];

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter 5 integers: ");

        for (int i = 0; i < 5; i++) {
            numbers[i] = obj.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print("Enter the number to search: ");
        int search = obj.nextInt();

        int index = Arrays.binarySearch(numbers, search);

        if (index >= 0) {
            System.out.println("The number " + search + " is found at index " + index);
        } else {
            System.out.println("Not Found");
        }
    }
}