/**
 * Java finally example
 */
package com.javaDifferenceBetweenFinalFinallyAndFinalize;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java finally example
 */
public class Java_Finally_Example
{
	public static void main(String[] args)
	{
		int number = 300;
		try
		{
			System.out.println(number);
		}
		catch (Exception e)
		{
			System.out.println("Exception handled..");
		}
		finally
		{
			System.out.println("Finally always execute..");
		}
	}
}
