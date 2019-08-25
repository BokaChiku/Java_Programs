/**
 * Java Convert int to String
 */
package com.javaIntToString;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert int to String
 * @implNote -> We can convert int to String in java using String.valueOf() and
 *           Integer.toString() methods. Alternatively, we can use
 *           String.format() method, string concatenation operator etc.
 * @implNote Scenario
 * @implNote -> It is generally used if we have to display number in textfield
 *           because everything is displayed as a string in form.
 * @implNote
 * @implNote 1) String.valueOf()
 * @implNote -> The String.valueOf() method converts int to String. The
 *           valueOf() is the static method of String class. The signature of
 *           valueOf() method is given below:
 * @implNote public static String valueOf(int i)
 * @implNote
 * @implNote int i=10;
 * @implNote String s=String.valueOf(i);//Now it will return "10"
 */
public class IntToStringExample1
{
	void calculation(int number)
	{
		String num;
		System.out.println(number + 200);
		num = String.valueOf(number);
		System.out.println(100 + num);
	}

	public static void main(String[] args)
	{
		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter integer number: ");
		number = scan.nextInt();
		new IntToStringExample1().calculation(number);
	}
}
