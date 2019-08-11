/**
 * Java String Compare
 */
package com.javaStringCompariosn;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String Compare:
 * @implNote 1. By equals() method
 * @implNote 2. By compareTo() method
 * @implNote 3. By == operator.
 * @implNote -> String compare by equals() method
 * @implNote
 * @implNote 1. The String equals() method compares the original content of the
 *           string. It compares values of string equality.
 * @implNote -> public boolean equals(Object another): Compares this string to
 *           the specified object.
 * @implNote -> public boolean equalsIgnoreCase(String another): Compares this
 *           String to another String, ignoring case.
 */
public class String_Compare_By_Equals_Method
{
	public static void main(String[] args)
	{
		String s1 = "Kunal";
		String s2 = "Kunal";
		System.out.println("Check First Two Strings: " + s1.equals(s2)); // true
		String s3 = "kunAl";
		System.out.println("Check Third String With First: " + s3.equals(s1)); // false
		System.out.println("Check Third String With First: " + s3.equalsIgnoreCase(s1)); // true
	}
}
