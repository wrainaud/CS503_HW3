package edu.monmouth.CS503.s0833836.Book;

public class BookException extends Exception{

	public BookException(String s) {
		System.err.println("EXCEPTION CAUGHT: TITLE IS NULL");
	}//BookException - Title
	
	public BookException(int n) {
		System.err.println("EXCEPTION CAUGHT: PAGES CANNOT BE LESS THAN 1");
	}//BookException - Pages
	
	public BookException(double price) {
		System.err.println("EXCEPTION CAUGHT: PRICE CANNOT BE LESS THAN ZERO");
	}//BookException - Price
	
	
}//BookException
