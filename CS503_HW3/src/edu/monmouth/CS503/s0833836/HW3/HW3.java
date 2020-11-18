package edu.monmouth.CS503.s0833836.HW3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import edu.monmouth.CS503.s0833836.Book.*;

public class HW3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			   PrintStream newIO = new PrintStream(HW3Constants.LOGFILENAME);
			   System.setOut(newIO);
			   System.setErr(newIO);
		       }//try 
		
		catch (FileNotFoundException e) {
			   System.err.println("Cannot redirect STDERR or STDOUT ");
			   e.printStackTrace();
			   System.exit(HW3Constants.CANTREDIRECT);
		       }//catch
		
		ArrayList<String> stringObjects = new ArrayList<String>();
		LinkedList<String> otherStringObjects = new LinkedList<String>();
		
		try {
			   BufferedReader reader = new BufferedReader(
				   new FileReader(HW3Constants.FILENAME1));
			   String text;
			   while((text = reader.readLine()) != null) {
			    stringObjects.add(text);
			    otherStringObjects.add(text);
			   }//while
			} catch (IOException e) {
				System.err.println("Cannot open file " + HW3Constants.FILENAME1);
				e.printStackTrace();
				System.exit(HW3Constants.CANTOPENFILE);
			}//catch
		
			for(String s : stringObjects) {
				System.out.println(s);
			}//for
			
			for(String i : otherStringObjects) {
				System.out.println(i);
			}//for
			
			Iterator<String> iterator = stringObjects.iterator();
		       while(iterator.hasNext()) {
			   System.out.println(iterator.next());
		    }//Iterator
			
			List<Book> bookObjects = new ArrayList<Book>();
			List<Book> otherBookObjects = new LinkedList<Book>();
			
			try {
				   BufferedReader reader = new BufferedReader(
					   new FileReader(HW3Constants.FILENAME2));
				   String text;
				   while((text = reader.readLine()) != null) {
				       System.out.println("Just read " + text);
				       String result[] = text.split(HW3Constants.SEPARATOR);
				       for(String part : result) {
					   System.out.println(part);
				       }//for
				   }//while
				   
				   bookObjects.add(text);
				   otherBookObjects.add(text);
				   
				} catch (IOException e) {
					System.err.println("Cannot open file " + HW3Constants.FILENAME2);
					e.printStackTrace();
					System.exit(HW3Constants.CANTOPENFILE);
				}//catch
			
			Iterator<Book> iterator = bookObjects.iterator();
		       while(iterator.hasNext()) {
			   System.out.println(iterator.next());
		    }//Iterator
	}//main

}//HW3
