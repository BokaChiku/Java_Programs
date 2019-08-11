/**
 * static method that performs normal calculation
 */
package com.javaStaticKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java program to get the cube of a given number using static method
 */
public class Calculate_Cube
{
	static double area;

	static double calculate(double number)
	{
		return (number * number * number);
	}

	public static void main(String[] args)
	{
		area = Calculate_Cube.calculate(10.23);
		System.out.println("Area of cube is: " + area);
	}
}
