/**
 * 
 */
package com.javaStringCompariosn;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String Compare:
 * @implNote 1. By equals() method
 * @implNote 2. By compareTo() method
 * @implNote 3. By == operator
 * @implNote String compare by compareTo() method:
 * @implNote
 * @implNote -> The String compareTo() method compares values lexicographically
 *           and returns an integer value that describes if first string is less
 *           than, equal to or greater than second string.
 * @implNote Suppose s1 and s2 are two string variable. If:
 * @implNote
 * @implNote 1. s1 == s2: 0
 * @implNote 2. s1 > s2: Positive Value
 * @implNote 3. s1 < s2: Negative Value
 */
public class String_CompareTo_Method
{
	public static void main(String[] args)
	{
		String s1 = "Kunal";
		String s2 = "Kunal";
		String s3 = "Chavan";
		System.out.println(s1.compareTo(s2)); // 0
		System.out.println(s3.compareTo(s2)); // -8
		System.out.println(s1.compareTo(s3)); // 8
		System.out.println(s2.compareTo(s1)); // 0
	}
}
