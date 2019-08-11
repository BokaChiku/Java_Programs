/**
 * What Is Invoked First Constructor Or Instance Initializer Block?
 */
package com.javaInstanceInitializerBlock;

/**
 * @author Kunal
 * @since 2019
 * @implNote 1. Instance Initializer Block is not invoked first.
 * @implNote 2. Instance Initializer Block is invoked at object creation time.
 * @implNote 3. The java compiler copies instance intializer block in
 *           cunstructor after the statement super().
 * @implNote 4. So first constructor invoked.
 */
public class What_Is_Invoked_First_Constructor_Or_Instance_Initializer_Block
{
	int speed;

	What_Is_Invoked_First_Constructor_Or_Instance_Initializer_Block()
	{
		// super();
		System.out.println("Constructor is invoked");
	}

	{
		System.out.println("Instance initializer Block Invoked");
	}

	public static void main(String[] args)
	{
		new What_Is_Invoked_First_Constructor_Or_Instance_Initializer_Block();
		new What_Is_Invoked_First_Constructor_Or_Instance_Initializer_Block();
	}
}
