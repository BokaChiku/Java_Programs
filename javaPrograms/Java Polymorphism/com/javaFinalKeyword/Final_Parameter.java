/**
 * What is final parameter ?
 */
package com.javaFinalKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote What is final parameter ?
 * @implNote -> If we declare any parameter as final tthen we can't change it's
 *           value.
 */
abstract class Area
{
	public abstract void area(final int number);
}

public class Final_Parameter extends Area
{
	public void area(final int number)
	{
		number = number * number; // The final local variable number cannot be assigned. It must be blank and not
									// using a compound assignment
		System.out.println("Area Is: " + number);
	}

	public static void main(String[] args)
	{
		new Final_Parameter().area(10);
	}
}
