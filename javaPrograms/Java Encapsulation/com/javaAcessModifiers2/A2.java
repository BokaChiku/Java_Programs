/**
 * Protected
 */
package com.javaAcessModifiers2;

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
public class A2
{
	protected void message()
	{
		System.out.println("This is protected message...");
	}

	protected int id;

	protected A2()
	{
		System.out.println("Protected Constructor");
	}
}
