/**
 * 
 */
package com.javaHashMapClass;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kunal
 */
public class HashMap1
{
	public static void main(String[] args)
	{
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Kunal");
		map.put(2, "Sanjay");
		map.put(3, "Chavan");
		System.out.println(map);
		for (Map.Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		map.putIfAbsent(4, "Gaurav");
		System.out.println("After invoking putIfAbsent() method ");
		for (Map.Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(5, "Ravi");
		map.putAll(map2);
		for (Map.Entry<Integer, String> m : map.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
