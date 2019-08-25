/**
 * Java Convert Object to String
 */
package com.javaObjectToString;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert Object to String
 * @implNote -> We can convert Object to String in java using toString() method
 *           of Object class or String.valueOf(object) method.
 * @implNote
 * @implNote -> You can convert any object to String in java whether it is
 *           user-defined class, StringBuilder, StringBuffer or anything else.
 * @implNote
 * @implNote Java Object to String Example: Converting User-defined class
 */
public class ObjectToStringExample
{
	public static void main(String[] args)
	{
		ObjectToStringExample obj = new ObjectToStringExample();
		System.out.println(obj);
//		System.out.println(obj.toString());
		String s = obj.toString();
		System.out.println(s);
	}
}
