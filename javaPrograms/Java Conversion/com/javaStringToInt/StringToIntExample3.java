/**
 * Java String to Integer Example: Integer.valueOf()
 */
package com.javaStringToInt;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String to Integer Example: Integer.valueOf()
 */
public class StringToIntExample3
{
	void calulation(String number)
	{
		int num;
		num = Integer.valueOf(number);
		System.out.println("Integer number is: " + num);
	}

	public static void main(String[] args)
	{
		String number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number: ");
		number = scan.nextLine();
		new StringToIntExample3().calulation(number);
		scan.close();
	}
}
