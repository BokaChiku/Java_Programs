/**
 * Protected
 */

package com.javaAccessModifiers;

import com.javaAcessModifiers2.A2;

/**
 * @author Kunal
 * @since 2019
 * @implNote Protected:
 * @implNote -> The protected access modifiers is accessible withing package and
 *           outside of the package but through inheritance only.
 * @implNote -> The protected can be applied on data member, method and
 *           constructor.
 * @implNote -> It can not be applied on class.
 * @implNote -> It provides more accessiblity than default.
 */
public class B1 extends A2
{
	B1()
	{
		super();
		System.out.println("Without Protected..");
	}

	public static void main(String[] args)
	{
		// A2 obj = new B1(); The method message() from the type A2 is not visible
		B1 obj = new B1();
		obj.message();
		obj.id = 10;
		System.out.println("Now id is: " + obj.id);
	}
}
