/**
 * Java Convert String to int
 */
package com.javaStringToInt;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert String to int
 * @implNote -> We can convert String to an int in java using Integer.parseInt()
 *           method.
 * @implNote -> To convert String into Integer, we can use Integer.valueOf()
 *           method which returns instance of Integer class.
 * @implNote
 * @implNote Scenario
 * @implNote -> It is generally used if we have to perform mathematical
 *           operations on the string which contains a number. Whenever we
 *           receive data from TextField or TextArea, entered data is received
 *           as a string. If entered data is in number format, we need to
 *           convert the string to an int. To do so, we use Integer.parseInt()
 *           method.
 * @implNote
 * @implNote Signature
 * @implNote -> The parseInt() is the static method of Integer class. The
 *           signature of parseInt() method is given below:
 * @implNote -> public static int parseInt(String s)
 */
public class StringToIntExample
{
	void calculation(String number)
	{
		int num = Integer.parseInt(number);
		System.out.println("Integer number is: " + num);
	}

	public static void main(String[] args)
	{
		String number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please eneter number in string..");
		number = scan.nextLine();
		new StringToIntExample().calculation(number);
		scan.close();
	}
}
