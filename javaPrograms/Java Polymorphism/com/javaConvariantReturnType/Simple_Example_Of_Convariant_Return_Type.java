/**
 * Simple Example of Convariant Return Type
 */
package com.javaConvariantReturnType;

/**
 * @author Kunal
 * @since 2019
 * @implNote Convariant Return Type:
 * @implNote 1. It specifies that return type may be vary in same direction as
 *           per subclass.
 * @implNote 2. Before Java5, it was not possible to override any method by
 *           changing the return type.
 * @implNote 3. But now, since java 5 it is possible to override method by
 *           changing the return type if subclass overrides any method whose
 *           return type is Non-Primitive but it canges its return type subclass
 *           type.
 * @implNote
 * @implNote The return type of the get() method of A class is A but return type
 *           of the get() method in class
 *           Simple_Example_Of_Convariant_Return_Type is
 *           Simple_Example_Of_Convariant_Return_Type. Both methods have
 *           different return type but it is method overriding. This is known as
 *           convariant return type.
 * @implNote How is Covaariant return types implemented?
 * @implNote -> Java doesn't allow the rturn type based overloading but JVM
 *           allows return type based overloading. JVM uses full signature of a
 *           method for lokkup/resolution. Full signature means it inclued
 *           return type in addition to argument types.
 */
class A
{
	A get()
	{
		return this;
	}
}

public class Simple_Example_Of_Convariant_Return_Type extends A
{
	Simple_Example_Of_Convariant_Return_Type get()
	{
		return this;
	}

	void message()
	{
		System.out.println("Welcome to Cognizant !!");
	}

	public static void main(String[] args)
	{
		new Simple_Example_Of_Convariant_Return_Type().message();
	}
}
