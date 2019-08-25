/**
 * Java static nested class example with static method
 */
package com.javaStaticNestedClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java static nested class example with static method
 * @implNote If you have the static member inside static nested class, you don't
 *           need to create instance of static nested class.
 */
public class TestOuter2
{
	static int number = 10;

	static class Inner
	{
		static void print()
		{
			System.out.println("Display Method.. " + number);
		}

	}

	public static void main(String[] args)
	{
		TestOuter2.Inner.print();// no need to create the instance of static nested class
	}
}
