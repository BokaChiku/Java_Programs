/**
 * 
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 * @since 2019
 * @implNote Cloning an Array in Java
 */
public class Cloning_An_Array_In_Java
{
	public static void main(String[] args)
	{
		int array[] = { 1, 2, 3, 4, 5 };
		System.out.println("Printing orignianl Array..");
		for (int arr : array)
		{
			System.out.println(arr);
		}

		System.out.println("Printing clone array ");
		int array2[] = array.clone();
		for (int arr : array2)
		{
			System.out.println(arr);
		}
		System.out.println("Are these two array are equal?");
		System.out.println("Two Arrays are equal.." + (array == array2));
	}
}
