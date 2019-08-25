/**
 * Java Nested Interface
 */
package com.javaNestedInterface;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Nested Interface
 * @implNote An interface i.e. declared within another interface or class is
 *           known as nested interface. The nested interfaces are used to group
 *           related interfaces so that they can be easy to maintain. The nested
 *           interface must be referred by the outer interface or class. It
 *           can't be accessed directly.
 * @implNote 1. Nested interface must be public if it is declared inside the
 *           interface but it can have any access modifier if declared within
 *           the class.
 * @implNote 2. Nested interfaces are declared static implicitely.
 * @implNote interface interface_name{
 * @implNote ...
 * @implNote interface nested_interface_name{
 * @implNote ...
 * @implNote }
 * @implNote }
 */

interface Showable
{
	void message();

	interface Print
	{
		void print();
	}
}

public class TestNestedInterface1 implements Showable.Print
{
	public void print()
	{
		System.out.println("Inner interface..");
	}

	public static void main(String[] args)
	{
		Showable.Print obj = new TestNestedInterface1(); // upcasting
		obj.print();
	}
}
