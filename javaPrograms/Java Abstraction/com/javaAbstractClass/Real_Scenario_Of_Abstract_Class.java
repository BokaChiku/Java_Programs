/**
 * A real scenario of abstract class
 */
package com.javaAbstractClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote 1. Shape is abstract class.
 * @implNote 2. Its implememntation provided by Rectangle and Circle class.
 * @implNote 3. If we create instance of rectangle class then draw() method of
 *           rectangle will be invoked.
 */

abstract class Shape
{
	abstract public void draw();
}

class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Rectangle Draw !!");
	}
}

class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Circle Draw !!");
	}
}

public class Real_Scenario_Of_Abstract_Class
{
	public static void main(String[] args)
	{
		// Shape Obj = new Rectangle();
		Rectangle Obj = new Rectangle();
		Obj.draw();
		// Shape Obj2 = new Circle();
		Circle Obj2 = new Circle();
		Obj2.draw();
	}
}
