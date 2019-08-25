/**
 * Java Convert double to String
 */
package com.javaDoubleToString;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert double to String
 * @implNote 1) String.valueOf()
 */
public class DoubleToStringExample1
{
	public static void main(String[] args)
	{
		String num;
		double number = 234.456;
		num = String.valueOf(number);
		System.out.println("String is: " + num);
	}
}
