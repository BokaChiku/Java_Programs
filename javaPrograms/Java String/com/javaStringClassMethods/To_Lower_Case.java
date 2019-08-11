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
 * @implNote -> Java String toLowerCase():
 * @implNote -> The java string toLowerCase() method convert this string to
 *           LowerCase.
 */
public class To_Lower_Case
{
	String name = "KUNAL";

	public static void main(String[] args)
	{
		To_Lower_Case obj = new To_Lower_Case();
		System.out.println("Original Name Is: " + obj.name);
		System.out.println("Lower Case: " + obj.name.toLowerCase());
	}
}
