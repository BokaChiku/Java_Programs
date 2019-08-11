/**
 * 
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 * @since 2019
 * @implNote Anonymous Array in Java
 */

public class Anonymous_Array_In_Java
{
	void operation(int Array[])
	{
		for (int arr : Array)
		{
			System.out.println(arr);
		}
	}

	public static void main(String[] args)
	{
		Anonymous_Array_In_Java Obj = new Anonymous_Array_In_Java();
		Obj.operation(new int[] { 10, 20, 30, 40 }); // Passing anonymous array to method
	}
}
