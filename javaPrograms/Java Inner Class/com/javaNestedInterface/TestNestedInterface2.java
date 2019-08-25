/**
 * Syntax of nested interface which is declared within the class
 */
package com.javaNestedInterface;

import com.javaNestedInterface.Test.Showable2;

/**
 * @author Kunal
 * @since 2019
 * @implNote Syntax of nested interface which is declared within the class
 * @implNote class class_name
 * @implNote {
 * @implNote ...
 * @implNote interface nested_interface_name
 * @implNote {
 * @implNote ...
 * @implNote }
 * @implNote }
 */
class Test
{
	interface Showable2
	{
		public abstract void print();
	}
}

public class TestNestedInterface2 implements Showable2
{
	public void print()
	{
		System.out.println("Print method..");
	}

	public static void main(String[] args)
	{
		Test.Showable2 obj = new TestNestedInterface2();
		obj.print();
	}
}
