/**
 * Java String to float
 */
package com.javaStringToFloat;

import java.util.Scanner;

/**
 * @author Kunal
 * @since Java String to float
 * @implNote Scenario
 * @implNote -> It is generally used if we have to perform mathematical
 *           operations on the string that contains float number. Whenever we
 *           get data from textfield or textarea, entered data is received as a
 *           string. If entered data is float, we need to convert string to
 *           float. To do so, we use Float.parseFloat() method.
 * @implNote -> The parseFloat() is the static method of Float class. The
 *           signature of parseFloat() method is given below:
 * @implNote public static float parseFloat(String s)
 */
public class StringToFloatExample
{
	void calculation(String number)
	{
		float num;
		num = Float.parseFloat(number);
		System.out.println("Float number is: " + num);
	}

	public static void main(String[] args)
	{
		String number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string in float number");
		number = scan.nextLine();
		new StringToFloatExample().calculation(number);
		scan.close();
	}
}
