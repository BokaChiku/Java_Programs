/**
 * Java Convert int to long
 */
package com.javaIntToLong;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert int to long
 * @implNote -> We can convert int to long in java using assignment operator.
 *           There is nothing to do extra because lower type can be converted to
 *           higher type implicitly.
 */
public class IntToLongExample1
{
	public static void main(String[] args)
	{
		int number = 24;
		long num;
		num = number;
		System.out.println("Long number is: " + num);
	}
}
