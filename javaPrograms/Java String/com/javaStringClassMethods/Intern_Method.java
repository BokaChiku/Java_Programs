/**
 * Java String class Methods
 */
package com.javaStringClassMethods;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String intern() method:
 * @implNote 1. A pool of strings, initially empty, is maintanined privately by
 *           the class string.
 * @implNote 2. When intern method invoked, if the pool is already contains a
 *           string equal to this string object as determined by the equals
 *           (object) method, then the string from pool will return. Otherwise
 *           this String object is added to the pool and a reference to this
 *           String object is returned.
 */
public class Intern_Method
{

	public static void main(String[] args)
	{
		String name = new String("Kunal Chavan");
		String name1 = name.intern();
		System.out.println(name1);
	}
}
