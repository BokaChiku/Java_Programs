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
 * @implNote
 * @implNote String return the new HashCode but StringBuffer return the same
 *           HashCode.
 */
public class String_Vs_StringBuffer_HashCode
{
	static void stringHashCode()
	{
		System.out.println("String HashCode:");
		String name = "Java";
		System.out.println(name.hashCode());
		name = "Kunal";
		System.out.println(name.hashCode());
	}

	static void stringbufferHashCode()
	{
		System.out.println("StringBuffer HashCode:");
		StringBuffer name = new StringBuffer("Kunal");
		System.out.println(name.hashCode());
		name = name.append("Chavan");
		System.out.println(name.hashCode());
	}

	public static void main(String[] args)
	{
		String_Vs_StringBuffer_HashCode.stringHashCode();
		String_Vs_StringBuffer_HashCode.stringbufferHashCode();
	}
}
