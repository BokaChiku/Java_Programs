/**
 * Java Runtime Polymorphism: Shape
 */
package com.javaRunTimePolymorphism;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Runtime Polymorphism: Shape
 */
class Shape
{
	void drawing()
	{
		System.out.println("Drawing..");
	}
}

class Rectange extends Shape
{
	void drawing()
	{
		System.out.println("Rectange Shape..");
	}
}

class Circle extends Shape
{
	void drawing()
	{
		System.out.println("Circle Shape..");
	}
}

class Square extends Shape
{
	void drawing()
	{
		System.out.println("Square Shape..");
	}
}

public class TestPolymorphism2
{
	public static void main(String[] args)
	{
		Shape s1 = new Rectange();
		s1.drawing();
		Shape s2 = new Circle();
		s2.drawing();
		Shape s3 = new Square();
		s3.drawing();
	}
}
