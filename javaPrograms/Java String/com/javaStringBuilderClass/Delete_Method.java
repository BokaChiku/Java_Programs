/**
 * Java StringBuilder class
 */
package com.javaStringBuilderClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java StringBuilder class
 * @implNote -> It is used to create mutable (modified) string.
 * @implNote -> It is same as StringBuffer except it is not non-synchronized.
 * @implNote
 * @implNote iportant Constructor of StringBuilder class
 * @implNote 1. StringBuilder(): create an empty string builder with initial
 *           capacity 16.
 * @implNote 2. StringBuilder(String str): create a string builder with
 *           specified string.
 * @implNote 3. StringBuilder(int length): create an empty string builder with
 *           specified capacity of length.
 * @implNote
 * @implNote Important methods of StringBuilder class
 * @implNote
 * @implNote -> public StringBuilder append(String str): is used to append
 *           specified string with this string. The append() method is overload
 *           as per append(char), append(int), append(boolean), append(float),
 *           append(double).
 * @implNote -> public StringBuilder insert(int offSet, String str): is used to
 *           insert specified string at the specified position with this
 *           string.The insert() method is overload as per insert(int, char),
 *           insert(int, int), insert(int, boolean), insert(int, float),
 *           insert(int, double).
 * @implNote -> public StringBuilder delete(int startIndex, int endIndex): is
 *           used to delete the string from startIndex and endIndex.
 * @implNote -> public StringBuilder reverse(): is used to reverse string.
 * @implNote -> public int capacity(): it returns the current capacity.
 * @implNote -> public void ensureCapacity(int minimumCapacity): is used to
 *           ensure the capacity at least equal to given minimum
 * @implNote -> public char charAt(int index): it returns the charachter at
 *           specified position.
 * @implNote -> public int length(): is used to return length of the string.
 *           total number of charachters.
 * @implNote -> public String substring(int beginIndex): it return subString
 *           from the specified beginIndex.
 * @implNote -> public String substring(int beginIndex, int endIndex):it return
 *           subString from the specified beginIndex to endIndex.
 * @implNote
 * @implNote StringBuilder delete() method:
 * @implNote -> It will delete string from beginIndex and endindex.
 */
public class Delete_Method
{
	public static void main(String[] args)
	{
		StringBuilder name = new StringBuilder("Kunal Chavan");
		name.delete(5, 12);
		System.out.println(name); // Kunal
	}
}
