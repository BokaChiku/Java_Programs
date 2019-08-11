/**
 * For-each Loop for Java Array
 */
package com.javaForEachLoop;

/**
 * @author Kunal
 * @since 2019
 * @implNote For-each Loop for Java Array:
 * @implNote -> We can print java array by using for each loop.
 * @implNote -> java for-each loop prints the array elements one by one.
 * @implNote -> Syntax for-each loop:
 * @implNote for( dataType var:Array)
 * @implNote {
 * @implNote // body of loop
 * @implNote }
 */
public class For_Each_Loop_for_java_Array
{
	public static void main(String[] args)
	{
		int Array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// printing array using for-each loop
		for (int arr : Array)
		{
			System.out.println(arr);
		}
	}
}
