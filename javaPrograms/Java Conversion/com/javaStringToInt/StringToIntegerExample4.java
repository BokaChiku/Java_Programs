/**
 * NumberFormatException Case
 */
package com.javaStringToInt;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote NumberFormatException Case
 * @implNote If you don't have numbers in string literal, calling
 *           Integer.parseInt() or Integer.valueOf() methods throw
 *           NumberFormatException.
 */
public class StringToIntegerExample4
{
	void calculation(String number)
	{
		int num;
		num = Integer.parseInt(number);
		System.out.println("Integer number is: " + num);
	}

	public static void main(String[] args)
	{
		String number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");
		number = scan.nextLine();
		new StringToIntegerExample4().calculation(number);
		scan.close();
	}
}
