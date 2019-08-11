/**
 * Another Example Of Java instanceof operator
 */
package com.javaInstanceOf;

/**
 * @author Kunal
 * @since 2019
 * @implNote An object of the subclass is also a type of parent class.
 * @implNote If Object of subclass can either refer to its subclass or
 *           parentclass.
 */

class Animal
{
	void run()
	{
		System.out.println("We Are Animals..");
	}
}

class Dog extends Animal
{
	void run()
	{
		System.out.println("We Are Animals..");
	}
}

public class Example_InstanceOf_Operator
{

	public static void main(String[] args)
	{
		Dog Obj = new Dog();
		System.out.println(Obj instanceof Animal); // It return true
	}
}
