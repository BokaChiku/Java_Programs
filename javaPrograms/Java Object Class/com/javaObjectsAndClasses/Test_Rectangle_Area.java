/**
 * Test Rectange Area
 */
package com.javaObjectsAndClasses;

/**
 * @author Kunal
 * @since 2019
 * @implNote Initializaing an object through methods.
 * @implNote In this example, we are creating two objects of Rectangle class and
 *           initializing the value to these objects by invoking insert()
 *           method.
 * @implNote We are displaying state (data) of the objects by invoking
 *           calculateArea() method.
 */

class Rectangle
{
	float length;
	float width;

	void insert(float len, float wid)
	{
		length = len;
		width = wid;
	}

	void calculateArea()
	{
		System.out.println("Area is: " + (length * width) + "for Length: " + length + " & for Width: " + width);
	}
}

public class Test_Rectangle_Area
{
	public static void main(String[] args)
	{

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.length = 23.04F;
		r1.width = 3.9F;
		r1.insert(r1.length, r1.width);
		r2.insert(10.25F, 11.45F);
		r1.calculateArea();
		r2.calculateArea();
	}
}
