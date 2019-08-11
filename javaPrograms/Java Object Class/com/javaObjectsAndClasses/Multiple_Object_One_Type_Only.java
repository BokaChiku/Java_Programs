/**
 * Creating multiple objects by one type only
 */
package com.javaObjectsAndClasses;

/**
 * @author Kunal
 * @since 2019
 * @implNote We can create multiple objects by one type only as we do in case
 *           perimitives.
 * @implNote Initialization of primitive variables:
 * @implNote -> int a = 10, b = 20;
 * @implNote Initialization of reference variables:
 * @implNote -> Rectangle r1 = new Rectangle(), r2 = new Rectangle(); //
 *           creating two objects
 */

class RectangleNew
{
	double length;
	double width;

	void insert(double len, double wid)
	{
		length = len;
		width = wid;
	}

	void calculateArea()
	{
		System.out.println("Area is: " + (length * width) + " for length: " + length + " & for width: " + width);
	}
}

public class Multiple_Object_One_Type_Only
{
	public static void main(String[] args)
	{
		RectangleNew r1 = new RectangleNew(), r2 = new RectangleNew(), r3 = new RectangleNew(); // Creating three
																								// Objects
		r1.insert(12.3, 10.25);
		r2.insert(0.25, 0.36);
		r3.insert(1.25, 2.36);
		r1.calculateArea();
		r2.calculateArea();
		r3.calculateArea();
	}
}
