/**
 * Integer.toString()
 */
package com.javaIntToString;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Integer.toString()
 * @implNote -> The Integer.toString() method converts int to String. The
 *           toString() is the static method of Integer class. The signature of
 *           toString() method is given below:
 * @implNote public static String toString(int i)
 * @implNote
 * @implNote Java int to String Example using Integer.toString()
 * @implNote int i=10;
 * @implNote String s=Integer.toString(i);//Now it will return "10"
 */
public class IntToStringExample2
{
	void calculation(int number)
	{
		String num;
		num = Integer.toString(number);
		System.out.println(152 + num);
		System.out.println(100 + number);
	}

	public static void main(String[] args)
	{
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number..");
		num = scan.nextInt();
		new IntToStringExample2().calculation(num);
		scan.close();
	}
}
