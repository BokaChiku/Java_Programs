/**
 * 
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 */
public class Passing_Array_To_Method
{
	String car[] = { "BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA" };

	void printArray(String array[])
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Printing all the values of an Array ==> " + array[i]);
		}
	}

	public static void main(String args[])
	{
		Passing_Array_To_Method obj = new Passing_Array_To_Method();
		obj.printArray(obj.car);
	}
}
