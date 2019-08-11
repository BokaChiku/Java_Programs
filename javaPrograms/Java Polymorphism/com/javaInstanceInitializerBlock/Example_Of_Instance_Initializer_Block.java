/**
 * Example Of Instance Initializer Block
 */
package com.javaInstanceInitializerBlock;

/**
 * @author Kunal
 * @since 2019
 * @implNote Instance Initialize Block:
 * @implNote -> Instance Initialize Block is used to initialize instance
 *           variable.
 * @implNote -> It run each time when object is created for the class.
 * @implNote Why use Instance Initialize Block:
 * @implNote -> Suppose we have to perform some operation while assigning value
 *           to instance data member. e.g for loop to fill a complex array or
 *           error handling etc.
 * @implNote There are three places in java where you can use perform
 *           operations:
 * @implNote 1. method
 * @implNote 2. constructor
 * @implNote 3. block
 */
public class Example_Of_Instance_Initializer_Block
{
	int speed;

	Example_Of_Instance_Initializer_Block()
	{
		System.out.println("Speed is: " + speed);
	}

	{
		speed = 24;
	}

	public static void main(String[] args)
	{
		new Example_Of_Instance_Initializer_Block();
		new Example_Of_Instance_Initializer_Block();
	}
}
