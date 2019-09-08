/**
 * 
 */
package com.javaSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Kunal
 * @since 2019
 * @implNote Set dosen't allow duplicate elements
 */
public class SetInterface
{
	public static void main(String[] args)
	{
		Set obj = new TreeSet<Iterator>();
		obj.add(10);
		obj.add(98);
		obj.add(40);
		obj.add(100);
		obj.add(40); // duplicate value
		Iterator<Iterator> itr = obj.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(obj.size());
		System.out.println(obj.isEmpty());
	}
}
