package org.piyush;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		List<Book> bookList = Arrays.asList(
				new Book(1000,"core java","piyush",BookGenre.Technology,2026,100),
				new Book(1001,"harry","rayling",BookGenre.Fiction,2016,50),
				new Book(1002,"core java","piyush",BookGenre.Technology,2026,90),
				new Book(1002,"core java","piyush",BookGenre.Technology,2026,90),
				new Book(1001,"new java","james",BookGenre.Technology,2016,5),
				new Book(1001,"extra java","someone",BookGenre.Fiction,2026,500),
				new Book(1001,"java the myth","kailash",BookGenre.Mythology,1800,500),
				new Book(1001,"java the myth 2","kailash",BookGenre.Mythology,1801,500)
				);
		//.forEach(System.out::println);
		//.filter(book -> book.getBookAuthor().equals("piyush"))
		//.distinct()
		

	          	//filterOnAuthor(booklist);
	bookList.stream()
	.filter(book ->book.getBookAuthor().equals("piyush"))
	.forEach(System.out::println);
		
		
		
		
		        //usingcollector(bookList);
//		List<Book> finalList = bookList.stream()
//				.filter(book -> book.getBookGenre()==BookGenre.Technology)
//				.collect(Collectors.toList());
//		finalList.forEach(System.out::println);
//		System.out.println("************************");
//		
//		Iterator<Book> iter = finalList.iterator();
//		While(iter.hasNext());
//		{
//			Book objBook = iter.next();
//			System.out.println(objBook.getBookAuthor());
//			System.out.println(objBook.getBookId());
//		}
//		System.out.println("************************");
//		
//		
		
		             //sorted
//		bookList.stream()
//		.sorted((book1,book2) ->
//		book1.getBookYearPublication()>
//		book2.getBookYearPublication()? 1:
//		book1.getBookYearPublication()<
//		book2.getBookYearPublication()? -1:0)
//		.forEach(System.out::println);

		
		         //uniqueBooks(bookList);
//		bookList.stream()
//		.distinct()
//		.forEach(System.out::println);
		
                              	// parititioning
		
//			Map<Boolean,List<Book>> partitionList = bookList.stream()
//			.collect(Collectors.partitioningBy(book -> book.getBookTotalQuantity()>=100));
//			
//			List<Book> above100 = partitionList.get(true);
//			List<Book> below100 = partitionList.get(false);
//		
//			System.out.println("books with qty>= 100");
//			above100.forEach(System.out::println);
//		
//			System.out.println("************************");
//			System.out.println("Book with qty <100");
//			below100.forEach(System.out::println);
//		
		
		
		                    //grouping(bookList);
		
//		Map<BookGenre,List<Book>> booksByGenre = bookList.stream()
//				.collect(Collectors.groupingBy(Book::getBookGenre));
//		
//		List<Book> bookTech = booksByGenre.get(BookGenre.Technology);
//		List<Book> bookFiction = booksByGenre.get(BookGenre.Fiction);
//		List<Book> bookMythology = booksByGenre.get(BookGenre.Mythology);
//		
//		
//		bookTech.forEach(System.out::println);
//		System.out.println("*****************");
//		
//		bookFiction.forEach(System.out::println);
//		System.out.println("*****************");
//		
//		bookMythology.forEach(System.out::println);
//		System.out.println("*****************");
		
		           //maxBook(bookList);
		
//		Optional<Book> maxBook = bookList.stream()
//		.max((book1,book2)-> book1.getBookTotalQuantity()>book2.getBookTotalQuantity() ? 1:
//			book1.getBookTotalQuantity()<book2.getBookTotalQuantity() ? -1 :0);
//		if(optBook.isPresent())
//		{
//			Book maxBook = optBook.get();
//			System.out.println(maxBook);
//		}
//		if(maxBook.isPresent())
//		{
//			Book data = maxBook.orElseThrow();
//			System.out.println(maxBook);
//		}
	}

}
