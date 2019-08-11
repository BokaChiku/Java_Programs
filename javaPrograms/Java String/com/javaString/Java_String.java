/**
 * Java String
 */
package com.javaString;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String
 * @implNote 1. In java, String is basically object of that represents sequence
 *           of char values.
 * @implNote 2. Array of charachters represent java string.
 * @implNote 3. Java String class provides many methods such as: compare(),
 *           concat(), equals(), split(), length(), replace(), compareTo(),
 *           inter(), subString() etc.
 * @implNote 4. The java.lang.String class implements Serializable, Comparable
 *           and CharSequence interface.
 * @implNote CharSequence Interface:
 * @implNote 1. CharSequence interface is used to represent equence of
 *           charachter. String, StringBuffer and StringBuilder class implements
 *           it.
 * @implNote 2. We can create String in java by three using three class:
 * @implNote -> String
 * @implNote -> StringBuffer
 * @implNote -> StringBuilder
 * @implNote 3. Java String is immutable which means it can not be changed.
 *           Whenever we change SGTring new instance is created.
 * @implNote 4. for Mutable String use StringBuffer and StringBuilder class.
 */
public class Java_String
{
	public static void main(String[] args)
	{
		char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		for (int i = 0; i < ch.length; i++)
		{
			System.out.print(ch[i]);
		}
		System.out.println();
		String string = new String(ch);
		// String string = "abcdefgh";
		System.out.println("String of charachter Array is: " + string);
	}
}
