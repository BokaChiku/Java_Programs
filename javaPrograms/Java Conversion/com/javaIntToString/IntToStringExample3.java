/**
 * String.format()
 */
package com.javaIntToString;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote String.format()
 * @implNote -> The String.format() method is used to format given arguments
 *           into String. It is introduced since Jdk 1.5.
 * @implNote -> public static String format(String format, Object... args)
 */
public class IntToStringExample3
{
	void calculation(int num)
	{
		String number;
		number = String.format("%d", num);
		System.out.println("String number is: " + number);
	}

	public static void main(String[] args)
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number..");
		num = scan.nextInt();
		new IntToStringExample3().calculation(num);
		scan.close();
	}
}
