/**
 * 
 */
package com.javaWrapperClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Unboxing:
 * @implNote 1. The automatic conversion of wrapper class to primitive data type
 *           is known as unboxing.
 * @implNote 2. It is reverse process of Autoboxing.
 * @implNote 3. From Java 5 we don't need to include intValue method of wrapper
 *           class to convert wraper type into primitive.
 */
public class Unboxing
{
	public static void main(String[] args)
	{
		// unboxing example of Integer to int
		// Converting Integer to int
		Integer number = 10;
		int number2 = number.intValue();
		System.out.println(number2);
		int number3 = number; // number3 = number.intValue();
		System.out.println(number3); 

	}
}
