/**
 * Anonymous Object
 */
package com.javaObjectsAndClasses;

/**
 * @author Kunal
 * @since 2019
 * @implNote Anonymous Object:
 * @implNote -> Anonymous simply means nameless.
 * @implNote -> An object which has no reference is knows as anonymous object.
 * @implNote -> It can be used at the time of object creation only.
 * @implNote -> If you have an object only once, an anonymous object is good
 *           approach.
 * @implNote For Example: new Calcualtion(); // anonymous object
 * @implNote 1. Calling method through a reference:
 * @implNote Calculation c = new Calculation();
 * @implNote 2. Calculation c.fact(5);
 * @implNote Calling method through an anonymous object
 * @implNote new Calculation().fact(5);
 */

class Calculation
{
	int fact = 1;

	void fact(int number)
	{
		for (int i = 1; i <= number; i++)
		{
			fact = fact * i;
		}

		System.out.println("Factorial Number is: " + fact);
	}
}

public class Anonymous_Object
{
	public static void main(String[] args)
	{
		new Calculation().fact(5); // Calling method with anonymous object
	}
}
