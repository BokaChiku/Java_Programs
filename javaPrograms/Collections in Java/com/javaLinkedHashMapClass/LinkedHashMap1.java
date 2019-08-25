/**
 * 
 */
package com.javaLinkedHashMapClass;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Kunal
 * @since 2019
 * @implNote 1. Java LinkedHashMap contains values based on the key.
 * @implNote 2. Java LinkedHashMap contains unique elements.
 * @implNote 3. Java LinkedHashMap may have one null key and multiple null
 *           values.
 * @implNote 4. Java LinkedHashMap is non synchronized.
 * @implNote 5. Java LinkedHashMap maintains insertion order.
 */
public class LinkedHashMap1
{
	public static void main(String args[])
	{

		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");

		for (Map.Entry<Integer, String> m : hm.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
