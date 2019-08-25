/**
 * Java Convert String to Object
 */
package com.javaStringToObject;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert String to Object
 * @implNote -> We can convert String to Object in java with assignment
 *           operator. Each class is internally a child class of Object class.
 *           So you can assign string to Object directly.
 * @implNote String s="hello";
 * @implNote Object obj=s;
 */
public class StringToObjectExample
{
	public static void main(String[] args)
	{
		String name = "Kunal";
		Object obj = name;
		System.out.println(obj);
	}
}
