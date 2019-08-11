/**
 * 
 */
package com.javaMethodOverloadAndMethodOverriding;

/**
 * @author Kunal
 * @since 2019
 * @implNote Method Overriding Method
 * @implNote 1. It is example of run time polymorphism.
 * @implNote 2. In case of overriding, parameter must be same
 * @implNote 3. It is occus in two class IS-A relationship
 * @implNote 4. It provides specific implementation of the method that is
 *           already provided by super class.
 * @implNote 5. retun type must be same in method overriding.
 */

class Animal
{
	Animal(int number)
	{
		System.out.println("Number is: " + number);
	}

	Animal()
	{
		System.out.println("Default Constructor of Animal");
	}

	void eating()
	{
		System.out.println("Animals are eating meat..");
	}
}

public class Method_Overiding extends Animal
{
	Method_Overiding()
	{
		super();
	}

	Method_Overiding(int number)
	{
		super(number);
	}

	void eating()
	{
		super.eating();
		System.out.println("Animals are eating veg also..");
	}

	public static void main(String[] args)
	{
		Animal obj = new Method_Overiding();
		obj.eating();
		new Method_Overiding(24);
	}
}
