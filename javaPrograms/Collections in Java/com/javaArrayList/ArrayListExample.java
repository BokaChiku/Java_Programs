/**
 * 
 */
package com.javaArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Kunal
 * @since 2019
 * @implNote
 */

class Book
{
	String bookName;
	String bookAuthor;
	double bookPrice;
	int bookPage;

	Book(String bookName, String bookAuthor, double bookPrice, int bookPage)
	{
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookPage = bookPage;
	}
}

public class ArrayListExample
{
	public static void main(String[] args)
	{
		Book obj = new Book("Kunal", "Chavan", 234.345D, 45);
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(obj);
		Iterator itr = list.iterator();
		while (itr.hasNext())
		{
			Book st = (Book) itr.next();
			System.out.println(st.bookAuthor + " " + st.bookName + " " + st.bookPage + " " + st.bookPrice);
		}
	}
}
