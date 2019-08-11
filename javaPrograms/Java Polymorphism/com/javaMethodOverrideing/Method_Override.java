/**
 * Example of Method Override
 */
package com.javaMethodOverrideing;

/**
 * @author Kunal
 * @since 2019
 * @implNote In below example we have implemented parent calss method in sub
 *           class but different specification. The method name and parameter is
 *           same and there is IS-A relationship between classes.
 */
class ParentClass2
{
	void run()
	{
		System.out.println("Parent Method !!");
	}
}

public class Method_Override extends ParentClass2
{
	void run()
	{
		System.out.println("Child Method !!");
	}

	public static void main(String[] args)
	{
		Method_Override Obj = new Method_Override();
		Obj.run(); // It will call subclass run method
		ParentClass2 Obj2 = new Method_Override();
		Obj2.run(); // It will call subclass run method
		ParentClass2 Obj3 = new ParentClass2();
		Obj3.run(); // It will call parent class
	}
}
