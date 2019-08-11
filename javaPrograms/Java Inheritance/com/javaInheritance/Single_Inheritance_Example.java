/**
 * Single Inheritance Example
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
 * @implNote Single Inheritance Example
 */

class Animal
{
	void eat()
	{
		System.out.println("Eat...");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}

public class Single_Inheritance_Example extends Dog
{
	public static void main(String[] args)
	{
		Dog Obj = new Dog();
		Obj.bark();
		Obj.eat();
	}
}
