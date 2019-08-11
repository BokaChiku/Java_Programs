/**
 * Java static block
 */
package com.javaStaticKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java static block:
 * @implNote 1. It is used to initialize the static data member.
 * @implNote 2. It is executed before the main method at the time of class
 *           loading.
 */
public class Java_Stataic_Block
{
	static
	{
		System.out.println("This is static block.");
	}

	public static void main(String[] args)
	{
		System.out.println("Hello Friends !!");
	}
}
