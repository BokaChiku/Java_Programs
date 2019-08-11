/**
 * Example of Abstract Class That Has Abstract Method
 */
package com.javaAbstractClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Abstract Class in Java:
 * @implNote -> A class which is declared with abstract keyword then it is
 *           called abstract class.
 * @implNote -> Abstract class can have abstract method or non abstract
 *           method(method with body).
 * @implNote
 * @implNote Abstraction in Java:
 * @implNote 1. Abstraction is the process of hiding implementation detail and
 *           showing only functionality to user.
 * @implNote 2. Another way, it shows essential things to the user and hides
 *           internal things.
 * @implNote For Example: We send SMS to another person and message send when
 *           the number is correct. In this process we don't know about
 *           background functionality.
 * @implNote Abstraction lets you focus on what object dows instead of how it
 *           does.
 * @implNote Ways to achieve abstraction:
 * @implNote 1. Abstract Class(0% to 100%)
 * @implNote 2. Interface(100%)
 * @implNote
 * @implNote Abstract Class in Java:
 * @implNote -> A class which is declared as abstract it is known as abstract
 *           class.
 * @implNote -> Abstract class can have abstract method or non abstract
 *           method(method with body).
 * @implNote -> It need to be extends and implements its method.
 * @implNote -> Abstract class can not be instantiated.
 * @implNote Note: Points To Remember:
 * @implNote 1. An abstract class must be declared with abstract keyword.
 * @implNote 2. It can have abstract method and non-abstract method.
 * @implNote 3. It can not be instantiated.
 * @implNote 4. It can have constructors and static methods.
 * @implNote 5. It can have final method which will focus the subclass not to
 *           change the body of the method.
 * @implNote
 * @implNote Example of Abstract Class:
 * @implNote abstract class A
 * @implNote {
 * @implNote
 * @implNote }
 * @implNote
 * @implNote Abstract Method in Java
 * @implNote
 * @implNote A method which is declared as an abstract and does not have
 *           implementation then is is abstract method.
 * @implNote
 * @implNote Example of Abstract Method:
 * @implNote abstract void display() // No method body and abstract.
 */

abstract class Bike
{
	public abstract void function();

	/*
	 * public static void main(String[] args) 
	 * {
	 * Bike Obj = new Bike(); // Cannot instantiate the type Bike 
	 * }
	 */
	
	void function2() 
	{
		System.out.println("We create method in Abstract Class !!");
	}
}

public class Abstract_Class_With_Abstract_Method extends Bike
{
	public void function()
	{
		System.out.println("We create method in subclass !!");
	}

	public static void main(String[] args)
	{
		Bike A = new Abstract_Class_With_Abstract_Method();
		A.function();
		A.function2();
	}
}
