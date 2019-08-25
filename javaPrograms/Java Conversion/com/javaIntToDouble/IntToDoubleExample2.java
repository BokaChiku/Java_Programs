/**
 * Java Convert int to double
 */
package com.javaIntToDouble;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert int to double
 * @implNote -> We can convert int to double in java using assignment operator.
 *           There is nothing to do extra because lower type can be converted to
 *           higher type implicitly. *
 */
public class IntToDoubleExample2
{
	public static void main(String[] args)
	{
		int number = 24;
		Double d = new Double(number);
		Double d1 = Double.valueOf(number);
		System.out.println(d);
		System.out.println(d1);
	}
}
