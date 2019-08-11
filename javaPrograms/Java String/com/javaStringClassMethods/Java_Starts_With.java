/**
 * Java String class Methods
 */
package com.javaStringClassMethods;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String class Methods:
 * @implNote -> startsWith(): It return boolean value
 */
public class Java_Starts_With
{
	String name = "Kunal";

	public static void main(String[] args)
	{
		Java_Starts_With obj = new Java_Starts_With();
		System.out.println("Java Starts With Method Case InSensitive: " + obj.name.startsWith("ku")); // false
		System.out.println("Java Starts With Method Case Sensitive: " + obj.name.startsWith("Ku")); // true
	}
}
