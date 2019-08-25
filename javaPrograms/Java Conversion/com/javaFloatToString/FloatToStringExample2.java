/**
 * Java Convert float to String
 */
package com.javaFloatToString;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert float to String
 * @implNote -> We can convert float to String in java using String.valueOf()
 *           and Float.toString() methods.
 * @implNote Scenario
 * @implNote -> It is generally used if we have to display float value in
 *           textfield because everything is displayed as a string in form.
 * @implNote
 * @implNote 2) Float.toString()
 * @implNote -> The Float.toString() method also converts float to String. The
 *           toString() is the static method of Float class. The signature of
 *           toString() method is given below:
 */
public class FloatToStringExample2
{
	void calculation(float num)
	{
		String number;
		number = Float.toString(num);
		System.out.println("String is: " + number);
	}

	public static void main(String[] args)
	{
		float number;
		System.out.println("Please enter float number..");
		Scanner scan = new Scanner(System.in);
		number = scan.nextFloat();
		new FloatToStringExample1().calculation(number);
		scan.close();
	}
}
