package piyush.Question1;

public class Book {
	 private String bookname;
	    private Author author;
	    private double price;
	    private int qtyInStock;
	    
	    Book(String bookname,Author author,double price,int qtyInStock)
	    {
	        this.bookname=bookname;
	        this.author=author;
	        this.price=price;
	        this.qtyInStock=qtyInStock;
	    }
	    public Author getAuthor(){
	        return author;
	    }
	    public String getBookName(){
	    	return bookname;
	    }
	    public double getPrice(){
	        return price;
	    }
	    public void setPrice(double price)
	    {
	        this.price=price;
	    }
	    public int getqtyInStock(){
	        return qtyInStock;
	    }
	    public void setqtyInStock(int qtyInStock)
	    {
	        this.qtyInStock=qtyInStock;
	    }
	    
}
