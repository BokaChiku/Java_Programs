/**
 * Understanding String Concatenation Operator
 */
package com.javaStringToInt;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Understanding String Concatenation Operator
 */
public class StringToIntExample2
{
	void calcualtion(String number)
	{
		int num;
		System.out.println(10 + number);
		num = Integer.parseInt(number);
		System.out.println(10 + num);
	}

	public static void main(String[] args)
	{
		String number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter number");
		number = scan.nextLine();
		new StringToIntExample2().calcualtion(number);
		scan.close();
	}
}
