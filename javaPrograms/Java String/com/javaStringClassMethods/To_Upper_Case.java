/**
 * Java String class Methods
 */
package com.javaStringClassMethods;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String class Methods:
 * @implNote -> The java.lang.String class provides lot of methods to work on
 *           string. By the help of these methods, we can perform operations
 *           such as trimming, concatenating, converting, comparing, replacing
 *           string etc.
 * @implNote -> Java String toUpperCase():
 * @implNote -> The java string toUpperCase() method convert this string to
 *           UpperCase.
 */
public class To_Upper_Case
{
	String name = "Kunal";

	public static void main(String[] args)
	{
		To_Upper_Case obj = new To_Upper_Case();
		System.out.println("Orignal Name Is: " + obj.name);
		System.out.println("Upper Case: " + obj.name.toUpperCase());
	}
}
