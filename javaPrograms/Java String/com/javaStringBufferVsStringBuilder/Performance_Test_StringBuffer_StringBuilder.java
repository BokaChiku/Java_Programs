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
 * @implNote
 * @implNote StringBuffer:
 * @implNote 1. StringBuffer is synchronized i.e. thread safe. It means two
 *           threads can't call the methods of StringBuffer simultaneously.
 * @implNote 2. StringBuffer is less efficient than StringBuilder.
 */
public class Performance_Test_StringBuffer_StringBuilder
{
	void stringBuffer()
	{
		System.out.println("String Buffer: ");
		StringBuffer name = new StringBuffer("Kunal");
		for (int i = 0; i <= 1000; i++)
		{
			name.append(" Chavan");
		}
		System.out.println("My name Is: " + name);
	}

	void stringBuilder()
	{
		System.out.println("String Builder: ");
		StringBuilder name = new StringBuilder("Kunal");
		for (int i = 0; i <= 1000; i++)
		{
			name.append(" Chavan");
		}
		System.out.println("My name is: " + name);
	}

	public static void main(String[] args)
	{
		Performance_Test_StringBuffer_StringBuilder obj = new Performance_Test_StringBuffer_StringBuilder();
		long startTime = System.currentTimeMillis();
		obj.stringBuffer();
		System.out.println("String Buffer Time: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		obj.stringBuilder();
		System.out.println("String Builder Time: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
