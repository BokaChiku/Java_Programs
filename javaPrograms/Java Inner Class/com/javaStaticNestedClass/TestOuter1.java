/**
 * Java static nested class
 */
package com.javaStaticNestedClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java static nested class
 * @implNote -> A static class i.e. created inside a class is called static
 *           nested class in java. It cannot access non-static data members and
 *           methods. It can be accessed by outer class name.
 * @implNote It can access static data members of outer class including private.
 * @implNote Static nested class cannot access non-static (instance) data member
 *           or method.
 */
public class TestOuter1
{
	static int number = 24;

	static class Kunal
	{
		void display()
		{
			System.out.println("Number is: " + number);
		}
	}

	public static void main(String[] args)
	{
		TestOuter1.Kunal in = new TestOuter1.Kunal();
		in.display();
	}
}
