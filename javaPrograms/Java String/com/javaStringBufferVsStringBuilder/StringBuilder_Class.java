/**
 * Difference between StringBuffer and StringBuilder
 */
package com.javaStringBufferVsStringBuilder;

/**
 * @author Kunal
 * @since 2019
 * @implNote Difference between StringBuffer and StringBuilder
 * @implNote -> Java provides three classes to represent a sequence of
 *           characters: String, StringBuffer, and StringBuilder.
 * @implNote -> The String class is an immutable class whereas StringBuffer and
 *           StringBuilder classes are mutable.
 * @implNote
 * @implNote StringBuilder
 * @implNote 1. StringBuilder is non-synchronized i.e. not thread safe. It means
 *           two threads can call the methods of StringBuilder simultaneously.
 * @implNote 2. StringBuilder is more efficient than StringBuffer.
 */
public class StringBuilder_Class
{
	public static void main(String[] args)
	{
		StringBuilder name = new StringBuilder("Kunal");
		name.append(" Chavan");
		System.out.println("My Name Is: " + name);
	}
}
