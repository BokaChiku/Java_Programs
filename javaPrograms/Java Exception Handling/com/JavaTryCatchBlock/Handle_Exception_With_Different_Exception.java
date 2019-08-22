/**
 * 
 */
package com.JavaTryCatchBlock;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote In this example, we are handling Arithmetic Exception with
 *           different type of exception class.
 */
public class Handle_Exception_With_Different_Exception
{
	int number, divsor;

	Handle_Exception_With_Different_Exception(int number, int divsor)
	{
		this.number = number;
		this.divsor = divsor;
	}

	void calculation()
	{
		int result;
		try
		{
			result = number / divsor;
			System.out.println("Result is: " + result);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}

		System.out.println("Rest code is executed..");
	}

	public static void main(String[] args)
	{
		int number, divisor;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number: ");
		number = scan.nextInt();
		System.out.println("Please enter divisor: ");
		divisor = scan.nextInt();
		Handle_Exception_With_Different_Exception obj = new Handle_Exception_With_Different_Exception(number, divisor);
		obj.calculation();
		scan.close();
	}
}
