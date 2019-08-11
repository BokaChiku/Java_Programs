/**
 * Passing Array to a Method in Java
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 * @since 2019
 * @implNote We can pass java array to method so that we can reuse the same
 *           logic on any array.
 */
public class Passing_Array_To_Method_Java
{
	// createing a method which recives an array as a parameter
	void display(int Array[])
	{
		/*
		 * for (int Arr : Array) { System.out.println(Arr); }
		 */
		for (int i = 0; i < Array.length; i++)
		{
			System.out.println("Array Index [" + i + "] => " + Array[i]);
		}
	}

	public static void main(String[] args)
	{

		int array[] = new int[5]; // Create Array object
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		new Passing_Array_To_Method_Java().display(array); // Passing array
	}
}
