/**
 * 
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
 * @implNote Multilevel Inheritance Example
 */
class Animal2
{
	void eat()
	{
		System.out.println("Eating..");
	}
}

class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("Barking..");
	}
}

class BabyDog extends Dog2
{
	void weep()
	{
		System.out.println("Weeping...");
	}
}

public class MultiLevel_Inheritance_Example extends BabyDog
{
	public static void main(String[] args)
	{
		MultiLevel_Inheritance_Example Obj = new MultiLevel_Inheritance_Example();
		Obj.weep();
		Obj.bark();
		Obj.eat();
	}
}
