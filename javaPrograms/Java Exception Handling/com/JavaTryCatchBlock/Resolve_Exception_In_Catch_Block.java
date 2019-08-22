/**
 * 
 */
package com.JavaTryCatchBlock;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Resolve the exception in a catch block
 */
public class Resolve_Exception_In_Catch_Block
{
	int number;

	Resolve_Exception_In_Catch_Block(int num)
	{
		number = num;
	}

	void calculation(int divisor)
	{
		int result;
		if (divisor == 0)
		{
			try
			{
				result = number / divisor; // may throw exception
				System.out.println("Result is: " + result);
			}
			// handling the exception by using Exception class
			catch (Exception e)
			{
				// displaying the custom message
				System.out.println("Can't Divide by Zero !!");
				result = (number / (divisor + 2));
				System.out.println("Result is: " + result);
			}
		}
		else
		{
			result = number / divisor;
			System.out.println("Result is: " + result);
		}
	}

	public static void main(String[] args)
	{
		int number, divisor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter The Number: ");
		number = scan.nextInt();
		System.out.println("Please Enter The Divisor: ");
		divisor = scan.nextInt();
		Resolve_Exception_In_Catch_Block obj = new Resolve_Exception_In_Catch_Block(number);
		obj.calculation(divisor);
		scan.close();
	}
}
