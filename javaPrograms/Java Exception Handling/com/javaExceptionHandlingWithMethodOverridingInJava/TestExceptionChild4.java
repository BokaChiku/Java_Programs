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

class Parent4
{
	void display() throws Exception
	{
		System.out.println("Exception");
	}
}

public class TestExceptionChild4 extends Exception
{
	void display() throws ArithmeticException
	{
		System.out.println("ArithmeticException");
	}

	public static void main(String[] args)
	{
		TestExceptionChild4 obj = new TestExceptionChild4();
		obj.display();
	}
}
