/**
 * 
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 */
public class Returning_Array_From_Method
{
	String car[] = { "BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA" };

	String[] printArray(String array[])
	{
		return array;
	}

	public static void main(String[] args)
	{
		Returning_Array_From_Method obj = new Returning_Array_From_Method();
		String array[] = obj.car;
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Printing all the values of an Array ==> " + array[i]);
		}
	}
}
