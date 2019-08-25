/**
 * 
 */
package com.javaArrayList;

import java.util.ArrayList;

/**
 * @author Kunal
 * @since 2019
 * @implNote ArrayList Addition
 */
public class ArrayListExampleToAddElements
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Kunal");
		list.add("Chavan");
		System.out.println("Array List Elements are: " + list);
		list.add(1, "Sanjay");
		System.out.println("Array List Elements are: " + list);
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Amit");
		list2.add("Neha");
		list.addAll(list2);
		System.out.println("Array List Elements are: " + list);
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("Eshan");
		list3.add("Baraskar");
		list.addAll(1, list3);
		System.out.println("Array List Elements are: " + list);
	}
}
