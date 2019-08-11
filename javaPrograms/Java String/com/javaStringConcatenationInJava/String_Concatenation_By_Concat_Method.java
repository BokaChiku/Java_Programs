/**
 * String Concatenation in Java
 */
package com.javaStringConcatenationInJava;

/**
 * @author Kunal
 * @since 2019
 * @implNote String Conacatenation in Java
 * @implNote In java, String concatenation forms a new string that is the
 *           combination of multiple strings. There are two ways to concat
 *           string in java:
 * @implNote 1. By + (string concatenation) operator
 * @implNote 2. By concat() method
 * @implNote
 * @implNote 2. By concat() method:
 * @implNote -> The string concate() method concatenates the specified string to
 *           the end of current string.
 * @implNote -> Syntax:
 * @implNote public String concat(String another)
 */
public class String_Concatenation_By_Concat_Method
{
	public static void main(String[] args)
	{
		String s1 = "Kunal";
		String s2 = " Chavan";
		System.out.println("Name Is: " + s1.concat(s2)); // Kunal Chavan
		String s3 = s1.concat(s2);
		System.out.println("Name Is: " + s3); // Kunal Chavan
	}
}
