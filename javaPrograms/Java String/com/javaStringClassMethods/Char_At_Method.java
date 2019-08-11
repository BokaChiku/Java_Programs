/**
 * Java String class Methods
 */
package com.javaStringClassMethods;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String charAt() Method
 * @implNote -> The string charAt() methods returns a charachter at specified
 *           index.
 */
public class Char_At_Method
{
	String name = "Kunal";

	public static void main(String[] args)
	{
		Char_At_Method obj = new Char_At_Method();
		char ch1 = obj.name.charAt(0);
		System.out.println("Charachter at 0 index is: " + ch1);

	}
}
