/**
 * Understand Problem without Method Override
 */
package com.javaMethodOverrideing;

/**
 * @author Kunal
 * @since 2019
 * @implNote Method Override in java:
 * @implNote -> If subclass (child class) has the same method as declared in
 *           parent class, it is known as "Method Override in Java".
 * @implNote -> Usage of Java Method Override:
 * @implNote 1. Method override is used to provide specific implementation of
 *           method which is already provided by superclass.
 * @implNote 2. It is run time polymorphism.
 * @implNote -> Rules for Java Method Override:
 * @implNote 1. Method must have same name as per parent class.
 * @implNote 2. Method must have same parameter as per parent class.
 * @implNote 3. There must be IS-A relationship. (Inheritance)
 * @implNote In the below program problem is that I have to provide a specific
 *           implementation of run() method in subclass that is why we use
 *           method override.
 */
public class Without_Method_Override extends ParentClass
{

	public static void main(String[] args)
	{
		Without_Method_Override Obj = new Without_Method_Override();
		Obj.run();
	}
}

class ParentClass
{
	void run()
	{
		System.out.println("Parent Class !!");
	}
}