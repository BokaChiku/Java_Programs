/**
 * Java Access meodifiers with Method Overriding
 */
package com.javaAccessModifiers;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Access Modifiers with method Overrideing:
 * @implNote -> If you are overriding any method, overridden method (i.e
 *           declared in subclass) must not be more restrictive.
 */

class A4
{
	protected void message()
	{
		System.out.println("Hello Java !!");
	}
}

public class Java_Access_Modifiers_With_Method_Overriding extends A4
{
	void message() // Cannot reduce the visibility of the inherited method from A4
	{
		System.out.println("It will gives Compile Time Error");
	}

	public static void main(String[] args)
	{
		Java_Access_Modifiers_With_Method_Overriding obj = new Java_Access_Modifiers_With_Method_Overriding();
		obj.message();
	}
}
