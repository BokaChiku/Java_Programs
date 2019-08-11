/**
 * Public: The public access modifier is accessible everywhere. It has the
 * widest scope among all access modifier.
 */
package com.javaAccessModifiers;

import com.javaAcessModifiers2.A3;

/**
 * @author Kunal
 * @since 2019
 * @implNote Public Access Modifier:
 */

public class B2 extends A3
{
	B2(int id)
	{
		super(id);
		System.out.println("Sub Class Constructor !!");
	}

	{
		System.out.println("Instance Initializer Block !!");
	}

	public static void main(String[] args)
	{
		B2 obj = new B2(10);
		obj.message();
	}
}
