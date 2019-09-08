/**
 * 
 */
package com.javaVariables;

/**
 * @author Kunal
 * @since 2019
 * @implNote Scope and Lifetime of Variable
 */
public class Scope_Of_Variable
{
	int a = 100; // Instance Variable
	int b = 200; // Instance Variable

	{
		int c = 300;
		System.out.println("Value of C is: " + c);
		System.out.println("Value of A is: " + a);
		System.out.println("Value of B is: " + b);
	}

	public static void main(String[] args)
	{
		int a = 100; // Instance Variable
		int b = 200; // Instance Variable

		{
			int c = 300;
			System.out.println("Value of C is: " + c);
			System.out.println("Value of A is: " + a);
			System.out.println("Value of B is: " + b);
		} // block and scope of c ends with end of bock
			// System.out.println("Value of A+B+C= " + (a + b + c));
		System.out.println("Value of A+B= " + (a + b));
	}
}
