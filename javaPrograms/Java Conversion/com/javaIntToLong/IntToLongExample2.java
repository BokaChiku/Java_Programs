/**
 * Java int to Long Example
 */
package com.javaIntToLong;

/**
 * @author Kunal
 * @since 2019
 * @implNote We can convert int value to Long object by instantiating Long class
 *           or calling Long.valueOf() method.
 */
public class IntToLongExample2
{
	public static void main(String[] args)
	{
		int number = 24;
		Long num = new Long(number);
		Long num2 = Long.valueOf(number);
		System.out.println(num);
		System.out.println(num2);

	}
}
