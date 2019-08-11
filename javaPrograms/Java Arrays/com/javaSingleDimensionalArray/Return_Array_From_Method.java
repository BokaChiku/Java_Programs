/**
 * Returning Array from the Method
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 * @since 2019
 * @implNote Returning Array from the Method
 * @implNote -> We can also return an array from the method in java.
 */
public class Return_Array_From_Method
{
	static int[] getArray()
	{
		return new int[] { 10, 20, 30, 40, 50 };
	}

	public static void main(String[] args)
	{
		/*
		 * for (int arr : Return_Array_From_Method.getArray()) {
		 * System.out.println(arr); }
		 */

		int Array[] = Return_Array_From_Method.getArray();

		for (int i = 0; i < Array.length; i++)
		{
			System.out.println("Array Index [" + i + "] => " + Array[i]);
		}
	}
}
