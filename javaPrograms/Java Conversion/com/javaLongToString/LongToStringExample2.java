/**
 * Long.toString()
 */
package com.javaLongToString;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Long.toString()
 * @implNote -> The Long.toString() method converts long to String. The
 *           toString() is the static method of Long class. The signature of
 *           toString() method is given below:
 * @implNote
 * @implNote long i=9993939399L;
 * @implNote String s=Long.toString(i);//Now it will return "9993939399"
 */
public class LongToStringExample2
{
	void calculation(long number)
	{
		String num;
		num = Long.toString(number);
		System.out.println("String is: " + num);
	}

	public static void main(String[] args)
	{
		long number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter long number");
		number = scan.nextLong();
		new LongToStringExample2().calculation(number);
		scan.close();
	}
}
