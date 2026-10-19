package piyush.Question1;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        // Author input
	        String authorName = sc.next();
	        String authorEmail = sc.next();
	        char gender = sc.next().charAt(0);

	        // Book input
	        String bookName = sc.next();
	        double price = sc.nextDouble();
	        int quantity = sc.nextInt();

	        // Create Author
	        Author author = new Author(authorName, authorEmail, gender);

	        // Create Book using Author
	        Book book = new Book(bookName, author, price, quantity);

	        // Output
	        System.out.println("Book Name: " + book.getBookName());
	        System.out.println("Price: " + book.getPrice());
	        System.out.println("Quantity: " + book.getqtyInStock());
	        System.out.println("Author Name: " + book.getAuthor().getName());
	        System.out.println("Author Email: " + book.getAuthor().getEmail());
	        System.out.println("Author Gender: " + book.getAuthor().getGender());
	}

}
