/**
 * Java 8 Static Method In Interface
 */
package com.javaInterface;

/**
 * @author Kunal
 * @since 2019
 * @implNote Since java 8, we can use static method in the interface.
 */
interface Shape
{
	void draw();

	static int cube(int x)
	{
		return x * x * x;
	}
}

class Area implements Shape
{
	public void draw()
	{
		System.out.println("Drawing..");
	}
}

public class Static_Method_In_Interface extends Area
{
	public static void main(String[] args)
	{
		Static_Method_In_Interface obj = new Static_Method_In_Interface();
		obj.draw();
		int result = Shape.cube(10);
		System.out.println("Cube is: " + result);
	}
}
