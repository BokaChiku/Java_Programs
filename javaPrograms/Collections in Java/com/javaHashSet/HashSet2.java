/**
 * 
 */
package com.javaHashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Kunal
 */
public class HashSet2
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");

		HashSet<String> set = new HashSet<String>(list);
		Iterator<String> itr = set.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
