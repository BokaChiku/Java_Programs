/**
 * Problem without exception handling
 */
package com.JavaTryCatchBlock;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Problem without exception handling
 * @implNote the rest of the code is not executed (in such case, the Calculation
 *           Code Complete!!/Given Number Is: statement is not printed). There
 *           can be 100 lines of code after exception. So all the code after
 *           exception will not be executed.
 */
public class Problem_Without_Exception_Handling
{
	int number;

	Problem_Without_Exception_Handling(int number)
	{
		this.number = number;
		System.out.println("Given Number Is: " + this.number);
	}

	void calculation()
	{
		int result;
		result = number / 0; // may throw exception
		System.out.println("Result Is: " + result);
		System.out.println("Calculation Code Complete!!");
	}

	public static void main(String[] args)
	{
		int number;
		System.out.println("Please Enter One Number !!");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		Problem_Without_Exception_Handling obj = new Problem_Without_Exception_Handling(number);
		obj.calculation();
		scan.close();
	}
}
