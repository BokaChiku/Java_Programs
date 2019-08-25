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
 * @implNote 1) String.valueOf()
 * @implNote -> The String.valueOf() is an overloaded method. It can be used to
 *           convert float to String. The valueOf() is the static method of
 *           String class. The signature of valueOf() method for the float
 *           conversion is given below:
 * @implNote public static String valueOf(float f)
 */
public class FloatToStringExample1
{
	void calculation(float num)
	{
		String number;
		number = String.valueOf(num);
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
