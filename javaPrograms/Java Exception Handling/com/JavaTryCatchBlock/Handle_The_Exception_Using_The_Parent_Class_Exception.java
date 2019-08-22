/**
 * 
 */
package com.JavaTryCatchBlock;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Handle the exception using the parent class exception
 */
public class Handle_The_Exception_Using_The_Parent_Class_Exception
{
	int number;

	Handle_The_Exception_Using_The_Parent_Class_Exception(int num)
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
			 // handling the exception by using Throwable class 
			catch (Throwable e)
			{
				System.out.println(e);
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
		Handle_The_Exception_Using_The_Parent_Class_Exception obj = new Handle_The_Exception_Using_The_Parent_Class_Exception(
				number);
		obj.calculation(divisor);
		scan.close();
	}
}
