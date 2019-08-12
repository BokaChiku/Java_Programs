/**
 * Difference of String and StringBuffer
 */
package com.javaStringVsStrigBuffer;

/**
 * @author Kunal
 * @since 2019
 * @implNote Difference of String and StringBuffer
 * @implNote String:
 * @implNote 1. String is immunatable.
 * @implNote 2. String is slow and consumes more memory when you concat too many
 *           string it creates too many instance.
 * @implNote 3. String class override the equals() method of the Object class.
 *           So we can compare two string with equals() method.
 * @implNote
 * @implNote StringBuffer:
 * @implNote 1. StringBuffer is mutable.
 * @implNote 2. StringBuffer is fast and it consumes less memory when you concat
 *           too many string is created.
 * @implNote 3. SringBuffer class doesn't override the equals() method of the
 *           Object class.
 */
public class String_Vs_StringBuffer
{
	String conCatString()
	{
		String name = "Kunal";
		for (int i = 0; i <= 1000; i++)
		{
			name = name + " Chavan";
		}
		return name;
	}

	String conCatWithStringBuilder()
	{
		StringBuilder name = new StringBuilder("Kunal");
		for (int i = 0; i <= 1000; i++)
		{
			name.append(" Chavan");
		}
		return name.toString();
	}

	public static void main(String[] args)
	{
		String_Vs_StringBuffer obj = new String_Vs_StringBuffer();
		long startTime = System.currentTimeMillis();
		obj.conCatString();
		System.out.println("Time taken to concatenate string: " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		obj.conCatWithStringBuilder();
		System.out
				.println("Time taken to concatenate stringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
