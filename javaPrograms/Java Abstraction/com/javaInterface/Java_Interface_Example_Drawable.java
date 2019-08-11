/**
 * Java Interface Example Drawable
 */
package com.javaInterface;

/**
 * @author Kunal
 * @since 2019
 * @implNote -> Drawable interface has only one method draw().
 * @implNote -> method implementation provided by Rectangle and Circle class.
 */

interface Drawable
{
	public abstract void draw();
}

class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Rectangle !!");
	}
}

class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Circle !!");
	}
}

public class Java_Interface_Example_Drawable
{
	public static void main(String[] args)
	{
		Rectangle obj = new Rectangle();
		obj.draw();
		Circle obj2 = new Circle();
		obj2.draw();
	}
}
