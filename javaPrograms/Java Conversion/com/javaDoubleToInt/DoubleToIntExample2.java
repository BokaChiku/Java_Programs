/**
 * Java Convert double to int
 */
package com.javaDoubleToInt;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert double to int
 * @implNote -> We can convert double to int in java using typecasting. To
 *           convert double data type into int, we need to perform typecasting.
 */
public class DoubleToIntExample2
{
	public static void main(String[] args)
	{
		Double d = new Double(234.567);
		int number = d.intValue();
		System.out.println("Integer number: " + number);
	}
}
