/**
 * Java Object to String Example: Converting StringBuilder
 */
package com.javaObjectToString;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Object to String Example: Converting StringBuilder
 */
public class ObjectToStringExample2
{
	public static void main(String[] args)
	{
		String s = "Hello";
		StringBuffer obj = new StringBuffer(s);
		obj.reverse();
		String s1 = obj.toString();
		System.out.println(s1);
	}
}
