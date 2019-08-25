/**
 * Java anonymous inner class example using interface
 */
package com.javaAnonymousInnerClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java anonymous inner class example using interface
 * @implNote
 */

interface Person1
{
	public abstract void display();

	default void print()
	{
		System.out.println("Print World !!");
	}

	static void print2()
	{
		System.out.println("Static Print World !!");
	}

}

public class Java_Anonymous_Inner_Class_Example_Using_Interface
{
	public static void main(String[] args)
	{
		Person1 obj = new Person1()
		{
			public void display()
			{
				System.out.println("Java !!");
			}
		};
		obj.display();
		obj.print();
		Person1.print2();
	}
}
