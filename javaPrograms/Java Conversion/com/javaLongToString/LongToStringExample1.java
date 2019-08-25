/**
 * Java long to String
 */
package com.javaLongToString;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java long to String
 * @implNote -> We can convert long to String in java using String.valueOf() and
 *           Long.toString() methods.
 * @implNote
 * @implNote -> Scenario
 * @implNote -> It is generally used if we have to display long number in
 *           textfield in GUI application because everything is displayed as a
 *           string in form.
 * @implNote
 * @implNote String.valueOf()
 * @implNote -> The String.valueOf() is an overloaded method. It can be used to
 *           convert long to String. The valueOf() is the static method of
 *           String class. The signature of valueOf() method is given below:
 * @implNote public static String valueOf(long i)
 * @implNote
 * @implNote long i=9993939399L;//L is the suffix for long String
 * @implNote s=String.valueOf(i);//Now it will return "9993939399"
 */
public class LongToStringExample1
{
	void calculation(long number)
	{
		String num;
		num = String.valueOf(number);
		System.out.println("String number: " + num);
	}

	public static void main(String[] args)
	{
		long number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter long number: ");
		number = scan.nextLong();
		new LongToStringExample1().calculation(number);
		scan.close();
	}
}
