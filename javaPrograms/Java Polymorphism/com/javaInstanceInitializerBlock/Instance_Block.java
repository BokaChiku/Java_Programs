/**
 * Another Example of instance block
 */
package com.javaInstanceInitializerBlock;

/**
 * @author Kunal
 * @since 2019
 * @implNote Another Example of instance block
 */

class A
{
	A()
	{
		System.out.println("A Class");
	}
}

class B extends A
{
	B()
	{
		super();
		System.out.println("B Class");
	}

	B(int a)
	{
		System.out.println("Child Class Value: " + a);
	}
}

public class Instance_Block extends B
{
	public static void main(String[] args)
	{
		new Instance_Block();
		new B(10);
	}
}
