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

class Super
{
	Super()
	{
		System.out.println("This is super class !!");
	}

}

public class Program_Of_Instance_Initializer_Block_After_Super extends Super
{
	{
		System.out.println("Hello Parent Class !!");
	}

	Program_Of_Instance_Initializer_Block_After_Super()
	{
		super();
		System.out.println("Child Constructor !!");
	}

	public static void main(String[] args)
	{
		new Program_Of_Instance_Initializer_Block_After_Super();
	}
}
