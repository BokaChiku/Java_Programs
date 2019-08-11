/**
 * 
 */
package com.javaMultiDimensionalArray;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Multiplication of 2 matrices in Java
 */
public class Multiplication_Of_Two_Matrix
{
	public static void main(String[] args)
	{
		int row = 0;
		int column = 0;
		Scanner scan = new Scanner(System.in);
		try
		{
			System.out.println("Please two number for row and column but both should be same..");
			row = scan.nextInt();
			column = scan.nextInt();

			if (row == column)
			{
				// Create and Print Array 1st
				int array[][] = new int[row][column];
				System.out.println("Please enter elements for first array");
				for (int i = 0; i < array.length; i++)
				{
					for (int j = 0; j < array.length; j++)
					{
						array[i][j] = scan.nextInt();
					}
				}

				for (int i = 0; i < array.length; i++)
				{
					for (int j = 0; j < array.length; j++)
					{
						System.out.print(array[i][j] + " ");
					}
					System.out.println();
				}
				// Create and Print Array 2nd
				int array2[][] = new int[row][column];
				System.out.println("Please enter elements for second array");
				for (int i = 0; i < array2.length; i++)
				{
					for (int j = 0; j < array2.length; j++)
					{
						array2[i][j] = scan.nextInt();
					}
				}

				for (int i = 0; i < array2.length; i++)
				{
					for (int j = 0; j < array2.length; j++)
					{
						System.out.print(array2[i][j] + " ");
					}
					System.out.println();
				}
				scan.close();
				// Create 3rd array and apply multiplication logic
				int array3[][] = new int[row][column];
				System.out.println("Multiplication of two Arrays..");
				for (int i = 0; i < array3.length; i++)
				{
					for (int j = 0; j < array3.length; j++)
					{
						array3[i][j] = 0;
						for (int k = 0; k < array3.length; k++)
						{
							array3[i][j] += array[i][k] * array2[k][j];
						}
						System.out.print(array3[i][j] + " ");
					}
					System.out.println();
				}
			}
			else
			{
				System.out.println("both numbers are not matching..");
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println(e);
		}

	}
}
