/**
 * 
 */
package com.javaHashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Kunal
 * @since 2019
 * @implNote HashSet
 * @implNote 1. HashSet contains unique elements only.
 * @implNote 2. HashSet allows null value.
 * @implNote 3. HashSet class is non synchronized.
 * @implNote 4. HashSet doesn't maintain the insertion order.
 * @implNote 5. HashSet is the best approach for search operations.
 * @implNote Difference between List and Set A list can contain duplicate
 *           elements whereas Set contains unique elements only.
 */
public class HashSet1
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		set.add("One");
		Iterator<String> i = set.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
