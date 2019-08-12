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
 * @implNote StringBuffer:
 * @implNote 1. StringBuffer is synchronized i.e. thread safe. It means two
 *           threads can't call the methods of StringBuffer simultaneously.
 * @implNote 2. StringBuffer is less efficient than StringBuilder.
 */
public class StringBuffer_Class
{
	public static void main(String[] args)
	{
		StringBuffer name = new StringBuffer("Kunal");
		name.append(" Chavan");
		System.out.println("My Name Is: " + name);
	}
}
