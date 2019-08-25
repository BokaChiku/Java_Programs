/**
 * Java String to long
 */
package com.javaStringToLong;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String to long
 * @implNote -> We can convert String to long in java using Long.parseLong()
 *           method.
 * @implNote Scenario
 * @implNote -> It is generally used if we have to perform mathematical
 *           operations on the string that contains long number. Whenever we get
 *           data from textfield or textarea, entered data is received as a
 *           string. If entered data is long, we need to convert string to long.
 *           To do so, we use Long.parseLong() method.
 * @implNote
 * @implNote Signature
 * @implNote -> The parseLong() is the static method of Long class. The
 *           signature of parseLong() method is given below:
 * @implNote -> public static long parseLong(String s)
 */
public class StringToLongExample
{
	void calculation(String number)
	{
		long num;
		num = Long.parseLong(number);
		System.out.println("Long number is: " + num);
	}

	public static void main(String[] args)
	{
		String number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string in long");
		number = scan.nextLine();
		new StringToLongExample().calculation(number);
		scan.close();
	}
}
