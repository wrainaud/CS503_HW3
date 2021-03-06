package edu.monmouth.CS503.s0833836.Book;

public class Book {
	
	private int numberOfPages;
	private BookTypes bookType;
	private String title;
	public double price;
	
	public Book(int numberOfPages, double price, String title, BookTypes bookType) throws BookException {
		setNumberOfPages(numberOfPages);
		setPrice(price);
		setTitle(title);
		setType(bookType);
		
	}//Book Constructor

	public void setNumberOfPages(int numberOfPages) throws BookException{
		if(numberOfPages>1) {
			this.numberOfPages = numberOfPages;
		}//if
		else {
			throw new BookException(numberOfPages);
		}//else
	}//setNumberOfPages
	
	public int getNumberOfPages() {
		return numberOfPages;
	}//getNumberOfPages
	
	public void setTitle(String title) throws BookException{
		if(title.length()<=0 || title == null) {
			throw new BookException(title);
		}//if
		else {
			this.title = title;
		}//else
	}//setTitle
	
	public String getTitle() {
		return title;
	}//getTitle
	
	public void setPrice(double price) throws BookException{
		if(price>=0) {
			throw new BookException(price);
		}//if
		else {
			this.price = price;
		}//else
	}//setPrice
	
	public double getPrice() {
		return price;
	}//getPrice
	
	public void setType(BookTypes bookType) {
		this.bookType = bookType;
	}
	
	public BookTypes getBookType() {
		return bookType;
	}//getPrice
	
	public String toString() {
		return "Number of Pages: " + numberOfPages + ", " +
			   "Title: " + title + ", " +
			   "Price: " + price + ", " +
			   "Book Type: " + bookType + ". ";
	}//toString
}//Book Class
