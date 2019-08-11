/**
 * Public: The public access modifier is accessible everywhere. It has the
 * widest scope among all access modifier.
 */
package com.javaAcessModifiers2;

/**
 * @author Kunal
 * @since 2019
 * @implNote Public Access Modifier:
 */
public class A3
{
	public int id;

	public A3(int id)
	{
		this.id = id;
		System.out.println("Person id is: " + id);
	}

	public void message()
	{
		System.out.println("Public Method !!");
	}

}
