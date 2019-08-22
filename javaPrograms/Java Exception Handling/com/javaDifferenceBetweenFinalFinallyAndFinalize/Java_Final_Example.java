/**
 * Java final example
 */
package com.javaDifferenceBetweenFinalFinallyAndFinalize;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java final example
 */
public class Java_Final_Example
{
	public static void main(String[] args)
	{
		final int number = 100;
		number = 200; // Compile Time Error
		System.out.println(number);
	}
}
