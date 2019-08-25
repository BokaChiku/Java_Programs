/**
 * Java ArrayList class
 */
package com.javaArrayList;

import java.util.ArrayList;

/**
 * @author Kunal
 * @since 2019
 * @implNote Ways to iterate the elements of the collection in java
 * @implNote 1. By Iterator interface
 * @implNote 2. By for-each loop
 * @implNote 3. By for loop
 * @implNote 4. By forEach() method
 * @implNote 5. By forEachRemaining() method
 * @implNote 6. By ListIterator interface
 * @implNote
 * @implNote 4. By forEach() method
 */
public class ArrayList5
{

	void display(ArrayList list)
	{
		list.forEach(a -> //Here, we are using lambda expression 
		{
			System.out.println(a);
		});
	}

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kunal");
		list.add("Omkar");
		list.add("Vishal");
		list.add("Ajinkya");
		list.add("Kunal");
		new ArrayList5().display(list);
	}
}
