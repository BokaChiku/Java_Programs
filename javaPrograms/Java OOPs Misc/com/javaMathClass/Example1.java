/**
 * Java Math Class
 */
package com.javaMathClass;

import java.lang.Math;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Math Class:
 * @implNote 1. It provides several methods to work on math calculations like
 *           min(), max(), avg(), sin(), cos(), tan(), round(), ceil(), floor(),
 *           abs() etc.
 */
public class Example1
{
	static public void main(String args[])
	{
		double number1 = 28;
		double number2 = 4;

		// return the maximum of two numbers
		System.out.println("Maximum of two numbers Num1 and Num2 is: " + Math.max(number1, number2));

		// return the miniumum of two numbers
		System.out.println("Minimum of two numbers Num1 and Num2 is: " + Math.min(number1, number2));

		// return the square root num1 number
		System.out.println("Square root of number1 is: " + Math.sqrt(number1));

		// return the square root num2 number
		System.out.println("Square root of num2 is: " + Math.sqrt(number2));

		// return the 28 power of 4 i.e 28*28*28*28
		System.out.println("Power of number1 any number2 is: " + Math.pow(number1, number2));

		// return the logarith of given value
		System.out.println("Logarithm of number1: " + Math.log(number1));
		System.out.println("Logarithm of number2: " + Math.log(number2));

		// return a power of 2
		System.out.println("Exp of Number1 is: " + Math.exp(number1));

		// return the log of number1 + 1
		System.out.println("Log1p of number1 is: " + Math.log1p(number1));

		// return the logarithm of given value when base is 10
		System.out.println("Log10 of number1 is: " + Math.log10(number1));
		System.out.println("Log10 of number2 is: " + Math.log10(number2));

	}
}
