/**
 * 
 */
package com.javaHashSet;

import java.util.HashSet;

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
public class HashSetRemoveElements
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		set.add("Sumit");
		System.out.println("An initial list of elements: " + set);
		// Removing specific element from HashSet
		set.remove("Ravi");
		System.out.println("After invoking remove(object) method: " + set);
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);
		System.out.println("Updated List: " + set);
		// Removing all the new elements from HashSet
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method: " + set);
		// Removing elements on the basis of specified condition
		set.removeIf(str -> str.contains("Vijay"));
		System.out.println("After invoking removeIf() method: " + set);
		// Removing all the elements available in the set
		set.clear();
		System.out.println("After invoking clear() method: " + set);
	}
}
