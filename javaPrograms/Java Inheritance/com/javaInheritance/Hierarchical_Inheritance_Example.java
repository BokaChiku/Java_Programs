/**
 * Hierarchical inheritance Example
 */
package com.javaInheritance;

/**
 * @author Kunal
 * @since 2019
 * @implNote Types Of inheritance in java:
 * @implNote 1. Single
 * @implNote ClassB -> ClassA
 * @implNote 2. Multilevel
 * @implNote ClassC -> ClassB -> ClassA
 * @implNote 3. Hierarchical
 * @implNote ClassB/ClassC -> ClassA
 * @implNote
 * @implNote Note: Multiple inheritance is not supported in java through class.
 * @implNote -> When one class inherits multiple classes, it is known as
 *           multiple inheritance.
 * @implNote ClassC -> ClassA/ClassB
 * @implNote
 * @implNote In java programming, multiple and hybrid inheritance is supported
 *           through interface only.
 * @implNote Hierarchical Inheritance Example
 */

class Animal3
{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog3 extends Animal3
{
	void bark()
	{
		System.out.println("Barking...");
	}
}

class Cats extends Animal3
{
	void meow()
	{
		System.out.println("Meowing...");
	}
}

public class Hierarchical_Inheritance_Example
{
	public static void main(String[] args)
	{
		Cats Obj = new Cats();
		Obj.eat();
		Obj.meow();
		// Obj.bark(); // Compile Time Error
	}
}
