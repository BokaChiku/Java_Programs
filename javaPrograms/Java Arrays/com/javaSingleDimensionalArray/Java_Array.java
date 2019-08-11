/**
 * Example of Array
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Arrays
 * @implNote -> Array is a collection of similar data types which have
 *           contiguous memory location.
 * @implNote -> Java array is an object which contains similar data type.
 * @implNote -> We can store only fixed set of elements in a array.
 * @implNote -> Array in java is index based, first element of the array is
 *           stored at 0th place, second element is stored on 1st index.
 * @implNote
 * @implNote Advantage of Arrays:
 * @implNote 1. Code Optimization: It makes the code optimized, we can retrive
 *           or sort the data efficiency.
 * @implNote 2. Random Access: We can get any data located at an index position.
 * @implNote
 * @implNote Disadvantages:
 * @implNote 1. Size Limit: We can store only the fixed size of elements in the
 *           array. It doesn't grow its size at runtime. To solve this problem,
 *           collection framework is used in java which grows automatically.
 * @implNote
 * @implNote Types of Array in Java:
 * @implNote 1. Single Dimensional Array
 * @implNote 2. Multi Dimensional Array
 * @implNote
 * @implNote Single Dimensional Array in Java
 * @implNote Syntax to declare Array:
 * @implNote 1. dataType[] arr;
 * @implNote 2. dataType []arr;
 * @implNote 3. dataType arr[];
 * @implNote
 * @implNote Instantiation of an Array in java:
 * @implNote 1. arrayRefVar = new dataType[size];
 */
public class Java_Array
{
	public static void main(String[] args)
	{
		int size = 5;

		int Array[] = new int[size];
		Array[0] = 10;
		Array[1] = 20;
		Array[2] = 30;
		Array[3] = 40;
		Array[4] = 50;

		for (int i = 0; i < Array.length ; i++)
		{
			System.out.println("Array index[" + i + "] => " + Array[i]);
		}
	}
}
