/**
 * 
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 */
public class Accessing_Array_Values
{
	public static void main(String[] args)
	{
		String car[] = { "BMW", "AUDI", "TOYOTA", "SUZUKI", "HONDA" };

		// This is to store the size of the Array
		int iLength = car.length;
		System.out.println("Length of the Array is ==> " + iLength);

		// This is to access the first element of an array directly with it's position
		String sBMW = car[0];
		System.out.println("First value of the Array is ==> " + sBMW);

		// This is to access the last element of an Array
		String sHonda = car[iLength - 1];
		System.out.println("Last value of the Array is ==> " + sHonda);

		// This is to print all the element values of an Array
		for (int i = 0; i <= iLength - 1; i++)
		{
			System.out.println("The value stored at position " + i + " in aMake array is ==> " + car[i]);
		}

	}
}
