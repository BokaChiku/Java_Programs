/**
 * Java Convert String to double
 */
package com.javaStringToDouble;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert String to double
 * @implNote -> We can convert String to double in java using
 *           Double.parseDouble() method.
 */
public class StringToDoubleExample
{
	void calculation(String num)
	{
		double number;
		number = Double.parseDouble(num);
		System.out.println("Double number: " + number);
	}

	public static void main(String[] args)
	{
		String number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter string double");
		number = scan.nextLine();
		new StringToDoubleExample().calculation(number);
		scan.close();
	}
}
