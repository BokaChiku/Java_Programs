/**
 * Java String class Methods
 */
package com.javaStringClassMethods;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String trim() method:
 * @implNote -> The string trim() method eleminate white spaces before and after
 *           string.
 */
public class Trim_Method
{
	String name = " Kunal ";

	public static void main(String[] args)
	{
		Trim_Method obj = new Trim_Method();
		System.out.println(obj.name);
		System.out.println(obj.name.trim());
	}
}
