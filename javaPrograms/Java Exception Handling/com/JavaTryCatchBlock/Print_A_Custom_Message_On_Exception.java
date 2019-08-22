/**
 * 
 */
package com.JavaTryCatchBlock;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Print a custom message on exception
 */
public class Print_A_Custom_Message_On_Exception
{
	int number;

	Print_A_Custom_Message_On_Exception(int num)
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
		Print_A_Custom_Message_On_Exception obj = new Print_A_Custom_Message_On_Exception(number);
		obj.calculation(divisor);
		scan.close();
	}
}
