/**
 * Immunatable String in Java
 */
package com.javaImmunatableString;

/**
 * @author Kunal
 * @since 2019
 * @implNote Immunatable String in Java
 * @implNote 1. In java, String objects are immunatable.
 * @implNote 2. Immunatable means they can't be modified or unchanged.
 * @implNote Please refer below Example:
 * @implNote 3. In the below example, Kuldeep is not changes in string constant
 *           pool but new object is created Kuldeep Chavan. That's why String is
 *           immunatable.
 */
public class Immunatable_String_Example
{
	public static void main(String[] args)
	{
		String name = "Kuldeep";
		name.concat(" Chavan"); // concat() method appends string at the end
		System.out.println("Name is: " + name); // It will print sachine because String is immunatable object.
	}
}
