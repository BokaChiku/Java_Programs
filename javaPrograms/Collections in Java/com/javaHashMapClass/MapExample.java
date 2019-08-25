/**
 * 
 */
package com.javaHashMapClass;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kunal
 */

class Book
{
	int id;
	String name, author, publisher;
	int quantity;

	Book(int id, String name, String author, String publisher, int quantity)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class MapExample
{
	public static void main(String[] args)
	{
		// Creating map of Books
		Map<Integer, Book> map = new HashMap<Integer, Book>();
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);

		for (Map.Entry<Integer, Book> m : map.entrySet())
		{
			int key = m.getKey();
			Book b12 = m.getValue();
			System.out.println(key + " Details:");
			System.out.println(b12.id + " " + b12.name + " " + b12.author + " " + b12.publisher + " " + b12.quantity);
		}
	}
}
