/**
 * If the superclass method declares an exception
 */
package com.javaExceptionHandlingWithMethodOverridingInJava;

/**
 * @author Kunal
 * @since 2019
 * @implNote Rule: If the superclass method declares an exception, subclass
 *           overridden method can declare same, subclass exception or no
 *           exception but cannot declare parent exception.
 */

class Parent2
{
	void display() throws ArithmeticException
	{
		System.out.println("ArithmeticException");
	}
}

public class TestExceptionChild2 extends Parent2
{
	void display() throws Exception // Exception Exception is not compatible with throws clause in Parent2.display()
	{
		System.out.println("Exception");
	}

	public static void main(String[] args)
	{
		TestExceptionChild2 obj = new TestExceptionChild2();
		obj.display(); // Unhandled exception type Exception
	}
}
