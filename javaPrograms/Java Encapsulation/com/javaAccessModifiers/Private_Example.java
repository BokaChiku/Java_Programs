/**
 * Private Example
 */
package com.javaAccessModifiers;

/**
 * @author Kunal
 * @since 2019
 * @implNote Access Modifiers In Java
 * @implNote -> There are two types of modifiers in java: Access Modifiers and
 *           Non-Access Modifiers.
 * @implNote 1. Access Modifers:
 * @implNote -> It specifies the accessibility or scope of a field, method,
 *           constructor or class.
 * @implNote -> We can change access level at field, method, constructor or
 *           class.
 * @implNote -> Four types of Access Modifiers:
 * @implNote 1. Private: Access level is only within the same class. It can not
 *           be accessed from outside of class.
 */

class A
{
	private int data = 40;

	void display()
	{
		System.out.println("Private Data is: " + data);
	}
}

public class Private_Example
{
	public static void main(String[] args)
	{
		A obj = new A(); // The constructor A() is not visible because class has access modifier private
		// obj.display(); // The method display() from the type A is not visible because it is private
		// private int data = 40; is not accessible here.
		obj.display();

	}
}
