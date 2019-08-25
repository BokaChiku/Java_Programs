/**
 * Java Convert char to String
 */
package com.javaCharToString;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert char to String
 * @implNote -> We can convert char to String in java using String.valueOf(char)
 *           method of String class and Character.toString(char) method of
 *           Character class.
 * @implNote char c='S';
 * @implNote String s=String.valueOf(c);
 */
public class CharToStringExample1
{
	public static void main(String[] args)
	{
		char ch = 'K';
		String name = String.valueOf(ch);
		System.out.println(" String is: " + name);
	}
}
