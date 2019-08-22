/**
 * Java Exception Handling Example
 */
package com.javaExceptionHandling;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Exception Handling Example
 * @implNote
 * @implNote Java Exception Handling where we using a try-catch statement to
 *           handle the exception.
 */
public class ArithmeticException_Example
{
	int number;
	int result;

	void calculation(int number)
	{
		try
		{
			this.number = number;
			result = this.number / 0;
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
		}
		System.out.println("Rest of the code...");
	}

	public static void main(String... args)
	{
		ArithmeticException_Example obj = new ArithmeticException_Example();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Number: ");
		obj.number = scan.nextInt();
		scan.close();
		obj.calculation(obj.number);
	}
}
