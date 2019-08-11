/**
 * Program Of Instance Initializer Block After Super()
 */
package com.javaInstanceInitializerBlock;

/**
 * @author Kunal
 * @since 2019
 * @implNote Rules Of Instance Initializer Block:
 * @implNote 1. The instance initializer block is created when instance of the
 *           class is created.
 * @implNote 2. The instance initializer block is invoked after the parent class
 *           constructor is invoked (i.e super())
 * @implNote 3. The instance block comes first as per they appear.
 */

class Super2
{
	Super2()
	{
		System.out.println("This is super class !!");
	}

	{
		System.out.println("Hello Parent Class !!");
	}
}

public class Program_Of_Instance_Initializer_Block_After_Super2 extends Super2
{
	Program_Of_Instance_Initializer_Block_After_Super2()
	{
		super();
		System.out.println("Child Constructor !!");
	}

	public static void main(String[] args)
	{
		new Program_Of_Instance_Initializer_Block_After_Super2();
	}
}
