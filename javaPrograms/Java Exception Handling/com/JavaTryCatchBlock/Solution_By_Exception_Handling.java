/**
 * 
 */
package com.JavaTryCatchBlock;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Solution by exception handling
 * @implNote Solution of the below problem by a java try-catch block.
 * @implNote As displayed in the above example, the rest of the code is
 *           executed, i.e., the Normal flow continues from here !! statement is
 *           printed.
 */
public class Solution_By_Exception_Handling
{
	int number;

	Solution_By_Exception_Handling(int number)
	{
		this.number = number;
		System.out.println("Given number is: " + this.number);
	}

	void calculation()
	{
		try
		{
			int result;
			result = number / 0; // may throw exception
			System.out.println("Result is: " + result);
		}
		// handling the exception
		catch (ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("Normal flow continues from here !!");
	}

	public static void main(String[] args)
	{
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");
		number = scan.nextInt();
		Solution_By_Exception_Handling obj = new Solution_By_Exception_Handling(number);
		obj.calculation();
		scan.close();
	}
}
