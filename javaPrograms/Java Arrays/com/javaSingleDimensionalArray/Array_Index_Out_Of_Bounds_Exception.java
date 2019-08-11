/**
 * 
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 * @since 2019
 * @implNote JVm thorws an ArrayIndexOutOfBoundsException if length of the array
 *           in negative, equal to the array size or greater than array size
 *           while traversing the array.
 */
public class Array_Index_Out_Of_Bounds_Exception
{
	public static void main(String[] args)
	{
		int Array[];
		Array = new int[5];
		Array[0] = 1;
		Array[1] = 2;
		Array[2] = 3;
		Array[3] = 4;
		Array[4] = 5;
		Array[5] = 6; // ArrayIndexOutOfBoundsException

		for (int i = 0; i < Array.length; i++)
		{
			System.out.println(Array[i]);
		}
	}
}

/*
 * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5
 * out of bounds for length 5 at
 * com.javaSingleDimensionalArray.Array_Index_Out_Of_Bounds_Exception.main(
 * Array_Index_Out_Of_Bounds_Exception.java:24)
 */