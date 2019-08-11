/**
 * Substring in Java
 */
package com.javaSubstringInJava;

/**
 * @author Kunal
 * @since 2019
 * @implNote Substring in Java
 * @implNote -> A part of string is called substring. In other words, substring
 *           is a subset of another string.
 * @implNote -> In case of substring startIndex is inclusive and endIndex is
 *           exclusive.
 * @implNote -> Note: Index start from 0.
 * @implNote -> There are two methods so that you can get substring from the
 *           given string object by one of the two methods.
 * @implNote 1. public String subString(int stratIndex): This method returns new
 *           String object conctaining the substring of the given string from
 *           specified startIndex (inclusive).
 * @implNote 2. public String subString(int stratIndex, int endIndex): This
 *           method returns new string object containing the substring of the
 *           given string from specified startIndex to endIndex.
 * @implNote
 * @implNote In case of String:
 * @implNote -> startIndex: inclusive
 * @implNote -> endIndex: exclusive
 * @implNote
 * @implNote Example of stratIndex and endIndex:
 * @implNote String name = "Kunal";
 * @implNote System.out.println(name.substring(0,2)); // Ku
 */
public class Example_Of_Java_Substring
{
	public static void main(String[] args)
	{
		String name = "Kunal Chavan";
		System.out.println(name.substring(6)); // Chavan
		System.out.println(name.substring(0, 5)); // Kunal

	}
}
