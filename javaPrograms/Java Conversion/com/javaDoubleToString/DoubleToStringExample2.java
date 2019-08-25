/**
 * Java Convert double to String
 */
package com.javaDoubleToString;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert double to String
 * @implNote 2) Double.toString()
 * @implNote -> The Double.toString() method also converts float to String. The
 *           toString() is the static method of Double class. The signature of
 *           toString() method is given below:
 */
public class DoubleToStringExample2
{
	public static void main(String[] args)
	{
		String number;
		double num;
		num = 34.466;
		number = Double.toString(num);
		System.out.println("String is: " + number);
	}
}
