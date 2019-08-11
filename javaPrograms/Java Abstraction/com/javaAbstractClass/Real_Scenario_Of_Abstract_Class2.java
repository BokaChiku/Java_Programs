/**
 * Real Scenario Of Abstract Class
 */
package com.javaAbstractClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Abstract class can be used to provide some implemenation of the
 *           interface.
 * @implNote In such case end user may not be forced to override all methods of
 *           interface.s
 */

interface A
{
	void a();

	void b();

	void c();

	void d();
}

abstract class B implements A
{
	public void c()
	{
		System.out.println("C is Print in Class B");
	}
}

class C extends B
{
	public void a()
	{
		System.out.println("A is Print in Class C");
	}

	public void b()
	{
		System.out.println("B is Print in Class C");
	}

	public void d()
	{
		System.out.println("D is Print in Class C");
	}
}

public class Real_Scenario_Of_Abstract_Class2
{
	public static void main(String[] args)
	{
		A Obj = new C();
		Obj.a();
		Obj.b();
		Obj.c();
		Obj.d();

	}
}
