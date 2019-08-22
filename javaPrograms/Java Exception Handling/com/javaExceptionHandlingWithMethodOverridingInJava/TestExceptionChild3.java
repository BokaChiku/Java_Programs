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

class Parent3
{
	void display() throws Throwable
	{
		System.out.println("Exception");
	}
}

public class TestExceptionChild3 extends Parent3
{
	void display() throws Exception
	{
		System.out.println("Exception");
	}

	public static void main(String[] args)
	{
		try
		{
			TestExceptionChild3 obj = new TestExceptionChild3();
			obj.display();
		}
		catch (Exception e)
		{
			System.out.println("Exception");
		}
	}
}
