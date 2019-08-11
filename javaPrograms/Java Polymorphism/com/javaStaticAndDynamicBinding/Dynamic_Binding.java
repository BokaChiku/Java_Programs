/**
 * Example Of Dynamic Binding
 */
package com.javaStaticAndDynamicBinding;

/**
 * @author Kunal
 * @since 2019
 * @implNote When type of the object determined at run time is called dynamic
 *           binding.
 * @implNote In the below example, object type can not be determined by
 *           compiler, because instance of Dog class is also instance of Animal
 *           Class.
 */

class Animal
{
	void run()
	{
		System.out.println("Eating...");
	}
}

class Dog extends Animal
{
	void run()
	{
		System.out.println("Barking...");
	}
}

public class Dynamic_Binding
{
	public static void main(String[] args)
	{
		Animal A1 = new Dog();
		A1.run();
	}
}
