/**
 * Adding Short
 */
package com.javaOperators;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Adding Short
 */
public class Adding_Short
{
	public static void main(String[] args)
	{
		short a = 10;
		short b = 10;
		a += b;// a = a + b
		// a = a + b; // Compile Time error because 10 + 10 = 20 which in integer
		a = (short) (a + b);
		System.out.println(a);
	}
}
