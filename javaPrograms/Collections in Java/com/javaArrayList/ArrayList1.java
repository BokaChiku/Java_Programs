/**
 * Java ArrayList class
 */
package com.javaArrayList;

import java.util.ArrayList;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java ArrayList class
 * @implNote -> ArrayList<String> al=new ArrayList<String>();//creating new
 *           generic arraylist
 * @implNote -> Java ArrayList class can contain duplicate elements.
 * @implNote -> Java ArrayList class maintains insertion order.
 * @implNote -> Java ArrayList class is non synchronized.
 * @implNote -> Java ArrayList allows random access because array works at the
 *           index basis.
 */
public class ArrayList1
{
	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<String>();
		// Adding object in arraylist
		obj.add("Kunal");
		obj.add("Sanjay");
		obj.add("Chavan");
		obj.add("Kunal");
		// Invoking arraylist object
		System.out.println(obj);
	}
}
