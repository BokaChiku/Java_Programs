/**
 * Java 8 Default Method In Interface
 */
package com.javaInterface;

/**
 * @author Kunal
 * @since 2019
 * @implNote Since Java 8, we can have method body in interface but we have to
 *           make that method as default.
 */

interface Drawable2
{
	public abstract void draw();

	default void msg()
	{
		System.out.println("This is default use in interface...");
	}
}

class Rectangle2 implements Drawable2
{
	public void draw()
	{
		System.out.println("Rectangle..");
	}
}

public class Default_Method_In_Interface extends Rectangle2
{
	public static void main(String[] args)
	{
		//Rectangle2 obj = new Default_Method_In_Interface();
		Default_Method_In_Interface obj = new Default_Method_In_Interface();
		obj.draw();
		obj.msg();
	}
}
