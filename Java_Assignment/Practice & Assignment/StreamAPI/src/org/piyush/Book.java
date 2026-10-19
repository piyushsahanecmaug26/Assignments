package org.piyush;

import java.util.Objects;

public class Book {
		int bookId;
		String bookName;
		String bookAuthor;
		int bookYearPublication;
		int bookTotalQuantity;
		BookGenre BookGenre;
		
		public Book(int bookId,String bookName,String bookAuthor,BookGenre BookGenre,int bookYearPublication,int bookTotalQuantity)
		{
			super();
			this.bookId = bookId;
			this.bookName = bookName;
			this.bookAuthor =bookAuthor;
			this.bookYearPublication = bookYearPublication;
			this.bookTotalQuantity = bookTotalQuantity;
			this.BookGenre = BookGenre;
			
		}

		public int getBookId() {
			return bookId;
		}

		public void setBookId(int bookId) {
			this.bookId = bookId;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public String getBookAuthor() {
			return bookAuthor;
		}

		public void setBookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
		}

		public int getBookYearPublication() {
			return bookYearPublication;
		}

		public void setBookYearPublication(int bookYearPublication) {
			this.bookYearPublication = bookYearPublication;
		}

		public int getBookTotalQuantity() {
			return bookTotalQuantity;
		}

		public void setBookTotalQuantity(int bookTotalQuantity) {
			this.bookTotalQuantity = bookTotalQuantity;
		}

		public BookGenre getBookGenre() {
			return BookGenre;
		}

		public void setBookGenre(BookGenre bookGenre) {
			BookGenre = bookGenre;
		}

		@Override
		public int hashCode() {
			return Objects.hash(BookGenre, bookAuthor, Integer.valueOf(bookId), bookName,
					Integer.valueOf(bookTotalQuantity), Integer.valueOf(bookYearPublication));
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			return BookGenre == other.BookGenre && Objects.equals(bookAuthor, other.bookAuthor)
					&& bookId == other.bookId && Objects.equals(bookName, other.bookName)
					&& bookTotalQuantity == other.bookTotalQuantity && bookYearPublication == other.bookYearPublication;
		}

		@Override
		public String toString() {
			return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
					+ ", bookYearPublication=" + bookYearPublication + ", bookTotalQuantity=" + bookTotalQuantity
					+ ", BookGenre=" + BookGenre + "]";
		}
	
	

}
