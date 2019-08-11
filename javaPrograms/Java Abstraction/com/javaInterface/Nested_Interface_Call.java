/**
 * Nested Interface in Java
 */
package com.javaInterface;

import com.javaInterface.Nested_Interface.Interface;

/**
 * @author Kunal
 * @since 2019
 * @implNote We implement here nested interface methods
 */
public class Nested_Interface_Call implements Interface, Nested_Interface

{
	public void print()
	{
		System.out.println("Prining Outside Interface...");
	}

	public void show()
	{
		System.out.println("Prining Inside Interface...");
	}

	public static void main(String[] args)
	{
		new Nested_Interface_Call().print();
		new Nested_Interface_Call().show();

	}
}
