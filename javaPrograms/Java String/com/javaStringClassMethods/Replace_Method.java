/**
 * Java String class Methods
 */
package com.javaStringClassMethods;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String replace() method:
 * @implNote -> The string() replace method replaces all occurence of first
 *           sequence of charachter with second sequence of charachter.
 */
public class Replace_Method
{
	String title = "Java is high level programming lanaguge !!";

	public static void main(String[] args)
	{
		Replace_Method obj = new Replace_Method();
		System.out.println(obj.title.replace("Java", "Kunal"));
	}
}
