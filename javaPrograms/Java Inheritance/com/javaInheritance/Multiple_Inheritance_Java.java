/**
 * Why multiple inheritance is not supported in java?
 */
package com.javaInheritance;

/**
 * @author Kunal
 * @since 2019
 * @implNote Why multiple inheritance is not supported in java?
 * @implNote 1. To reduce the complexity and simplify the language, multiple
 *           inheritance is not supported in java.
 * @implNote 2. Consider a scenario where A, B and C are three classes. The
 *           class C inherits A and B classes. If A and B classes have the same
 *           method and you call it from child class object, there will be
 *           ambiguity to call the method of A and B class.
 * @implNote 3. Compile-time error are better than runtime error, Java renders
 *           compile-time error if you inherit 2 classes.
 */
class A
{
	void msg()
	{
		System.out.println("Hello");
	}
}

class B
{
	void msg()
	{
		System.out.println("Welcome");
	}
}

public class Multiple_Inheritance_Java extends A,B
{

	public static void main(String args[])
	{
		Multiple_Inheritance_Java Obj = new Multiple_Inheritance_Java();
		Obj.msg(); // Now which msg() method would be invoked?
	}
}
