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
 * @implNote 1) String Concatenation by + (string concatenation) operator
 * @implNote Java strings concatenation operator (+) is used to add strings.
 * @implNote The Java Compiler Transforms above code to this:
 * @implNote String name = (new
 *           StringBuilder()).append("Sanjay").append("Chavan").toString();
 */
public class String_Concatenation_by_Plus_Operator
{
	public static void main(String[] args)
	{
		String name = "Kunal" + " Sanjay" + " Chavan";
		String name2 = (new StringBuilder()).append("Kunal ").append("Sanjay ").append("Chavan").toString();
		// System.out.println("My Full Name Is: " + name + " Sanjay" + " Chavan");
		System.out.println("My Full Name Is: " + name); // My Full Name Is: Kunal Sanjay Chavan
		System.out.println("My Full Name Is: " + name2); // My Full Name Is: Kunal Sanjay Chavan
	}
}
