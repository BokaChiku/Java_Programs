/**
 * 
 */
package com.javaStringBufferClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java StringBuffer class
 * @implNote 1. Java StringBuffer class is used to create mutable (modifiable)
 *           string. The StringBuffer class in java is same as String class
 *           except it is mutable. i.e it can be changed.
 * @implNote
 * @implNote Note: Java StringBuffer class is thread-safe. i.e multiple threads
 *           can't access it simultaneously. So it is safe and will result in an
 *           order.
 * @implNote
 * @implNote Important Constructor of StringBuffer class:
 * @implNote -> StringBuffer(): Creates an empty string buffer with the initial
 *           capacity of 16.
 * @implNote -> StringBuffer(String str): creates a string buffer with the
 *           specified string.
 * @implNote -> StringBuffer(int capacity): creates an empty string buffer with
 *           the specified capacity as length.
 * @implNote
 * @implNote Important methods of Stringbuffer class:
 * @implNote -> append(String s): is used to append the specified string with
 *           this string. The append() method is overloaded like append(char),
 *           append(boolean), append(int), append(float), append(double) etc.
 * @implNote -> insert(int offset, String s): is used to insert the specified
 *           string with this string at the specified position. The insert()
 *           method is overloaded like inser(int, char), inser(int, boolean),
 *           insert(int, int), insert(int, float), insert(int, double) etc.
 * @implNote -> replace(int stratIndex, int endIndex, String str): is used to
 *           replace the String from specified stratIndex and endIndex.
 * @implNote -> delete(int startIndex, int endIndex): is used to delete the
 *           string from specified startIndex and endIndex.
 * @implNote -> reverse(): is used to reverse the string.
 * @implNote -> capacity(): is used to return the current capacity.
 * @implNote -> ensureCapacity(int minimumCapacity): is used to ensure the
 *           capacity at least equal to the given minimum.
 * @implNote -> charAt(int index): is used to return the character at the
 *           specified position.
 * @implNote -> length(): is used to return the legth of the string. i.e total
 *           number of charachter.
 * @implNote -> substring(int beginIndex): in used to return the substring from
 *           the specified beginIndex.
 * @implNote -> substring(int beginIndex, int endIndex): is used to return the
 *           substring from the specified beginIndex and endIndex.
 * @implNote
 * @implNote What is mutable string:
 * @implNote A string that can be modified or changed is known as mutable
 *           string. StringBuffer and StringBuilder classes are used for
 *           creating mutable string.
 * @implNote
 * @implNote StringBuffer delete() method:
 * @implNote -> The delete() method of StringBuffer class delete the string from
 *           the specified beginIndex to endIndex.
 */
public class Delete_Method
{
	public static void main(String[] args)
	{
		StringBuffer name = new StringBuffer("Kunal Chavan");
		StringBuffer myName = name.delete(6, 12);
		System.out.println(myName);
	}
}
