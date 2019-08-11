/**
 * Multidimensional Array in Java
 */
package com.javaMultiDimensionalArray;

/**
 * @author Kunal
 * @since 2019
 * @implNote Syntax to declare Multidimensional Array:
 * @implNote 1. dataType[][] arrayRefvar;
 * @implNote 2. dataType [][]arrayRefVer;
 * @implNote 3. dataType arrayRefvar[][];
 * @implNote 4. dataType []arrayRefVar[];
 * @implNote
 * @implNote Example to instantiate multidimensional Array in Java
 * @implNote int[][] arr = new int[3][3] // 3 row and 3 column
 * @implNote Example to initialize Multidimensional Array in Java
 * @implNote arr[0][0] = 1;
 * @implNote arr[0][1] = 2;
 * @implNote arr[0][2] = 3;
 * @implNote arr[1][0] = 4;
 * @implNote arr[1][1] = 5;
 * @implNote arr[1][2] = 6;
 * @implNote arr[2][0] = 7;
 * @implNote arr[2][1] = 8;
 * @implNote arr[2][2] = 9;
 */
public class Example_Of_MultiDimensional_Array
{
	public static void main(String[] args)
	{
		// declaring and initializing 2D array
		int Array[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };

		for (int i = 0; i < Array.length; i++)
		{
			for (int j = 0; j < Array.length; j++)
			{
				System.out.print(Array[i][j] + " ");
			}

			System.out.println();
		}
	}
}
