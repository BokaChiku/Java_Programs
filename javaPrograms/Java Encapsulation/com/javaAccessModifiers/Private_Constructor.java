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
 * @implNote 2. If you create constructor private then you can not create it's
 *           instance outside of class.
 * @implNote Note: A class cannot be private or protected except nested class.
 */

class PrivateConstructor
{
	PrivateConstructor()
	{
		System.out.println("Private Constructor !!");
	}

	void message()
	{
		System.out.println("Default Method !!");
	}

}

// public class Private_Constructor extends PrivateConstructor Implicit super constructor PrivateConstructor() is not visible for default constructor.Must define an explicit constructor

public class Private_Constructor
{

	public static void main(String[] args)
	{
		// PrivateConstructor obj = new PrivateConstructor(); The constructor
		// PrivateConstructor() is not visible becuase we create it private.
		PrivateConstructor obj = new PrivateConstructor();
		obj.message();
	}
}
