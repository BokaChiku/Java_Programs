/**
 * Java String class Methods
 */
package com.javaStringClassMethods;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java valueOf() Method:
 * @implNote -> The string valueOf() method convert given type such as int,
 *           float, double, boolean, char, and char array into string.
 */
public class ValueOf_Method
{
	int number = 10;

	public static void main(String[] args)
	{
		ValueOf_Method obj = new ValueOf_Method();
		String number2 = String.valueOf(obj.number);
		System.out.println(number2 + obj.number);
	}
}
