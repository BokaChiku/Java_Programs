/**
 * 
 */
package com.javaArrayList;

import java.util.ArrayList;

/**
 * @author Kunal
 * @since 2019
 * @implNote ArrayList Remove
 */
public class ArrayListExampleToRemoveElements
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		System.out.println(al);
		al.remove("Ajay");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.removeIf(str -> str.contains("Anuj"));
		System.out.println(al);
		al.removeAll(al);
		System.out.println(al);
	}
}
