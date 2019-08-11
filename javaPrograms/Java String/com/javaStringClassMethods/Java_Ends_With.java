/**
 * Java String class Methods
 */
package com.javaStringClassMethods;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String class Methods:
 * @implNote -> endsWith(): It return boolean value
 */
public class Java_Ends_With
{
	String name = "Kunal";

	public static void main(String[] args)
	{
		Java_Ends_With obj = new Java_Ends_With();
		System.out.println("Java Starts With Method Case InSensitive: " + obj.name.endsWith("NaL")); // false
		System.out.println("Java Starts With Method Case Sensitive: " + obj.name.endsWith("nal")); // true
	}
}
