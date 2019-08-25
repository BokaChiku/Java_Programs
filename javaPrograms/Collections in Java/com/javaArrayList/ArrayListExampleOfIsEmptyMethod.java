/**
 * 
 */
package com.javaArrayList;

import java.util.ArrayList;

/**
 * @author Kunal
 * @since 2019
 * @implNote ArrayList example of isEmpty() method
 */
public class ArrayListExampleOfIsEmptyMethod
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		System.out.println("After Insertion");
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
	
	}
}
