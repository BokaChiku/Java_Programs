/**
 * If the superclass method does not declare an exception
 */
package com.javaExceptionHandlingWithMethodOverridingInJava;

/**
 * @author Kunal
 * @since 2019
 * @implNote 1. If the superclass method does not declare an exception
 * @implNote
 * @implNote -> If the superclass method does not declare an exception, subclass
 *           overridden method cannot declare the checked exception but it can
 *           declare unchecked exception.
 * @implNote
 * @implNote -> Rule: If the superclass method does not declare an exception,
 *           subclass overridden method cannot declare the checked exception but
 *           can declare unchecked exception.
 */

class Parent1
{
	void display()
	{
		System.out.println("Hello world..");
	}
}

public class TestExceptionChild1 extends Parent1
{
	void display() throws ArithmeticException
	{
		super.display();
		System.out.println("ArithmeticException");
	}

	public static void main(String[] args)
	{
		TestExceptionChild1 obj = new TestExceptionChild1();
		obj.display();
	}
}
