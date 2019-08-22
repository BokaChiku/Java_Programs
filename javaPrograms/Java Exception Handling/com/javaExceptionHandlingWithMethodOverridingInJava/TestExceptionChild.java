/**
 * 
 */
package com.javaExceptionHandlingWithMethodOverridingInJava;

import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote ExceptionHandling with MethodOverriding in Java
 * @implNote 1. If the superclass method does not declare an exception
 * @implNote
 * @implNote -> If the superclass method does not declare an exception, subclass
 *           overridden method cannot declare the checked exception but it can
 *           declare unchecked exception.
 * @implNote
 * @implNote 1) Rule: If the superclass method does not declare an exception,
 *           subclass overridden method cannot declare the checked exception.
 */

class Parent
{
	void display()
	{
		System.out.println("this is parent method..");
	}
}

public class TestExceptionChild extends Parent
{
	void display() throws IOException // Exception IOException is not compatible with throws clause in
										// Parent.display()
	{
		System.out.println("IOException..");
	}

	public static void main(String[] args)
	{
		TestExceptionChild obj = new TestExceptionChild();
		obj.display();
	}
}
