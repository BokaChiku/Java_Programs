/**
 * 
 */
package com.javaMultiDimensionalArray;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Addition of 2 Matrices in Java
 */
public class Addition_Of_Two_Matrix
{
	public static void main(String[] args)
	{
		int row = 0;
		int column = 0;
		System.out.println("Please Enter Row And Column Size !!");
		Scanner scan = new Scanner(System.in);
		try
		{
			row = scan.nextInt();
			column = scan.nextInt();
			if (row == column)
			{
				// create first Array
				int array[][] = new int[row][column];
				System.out.println("Now Enter Elements in 1st sarray");
				for (int i = 0; i < array.length; i++)
				{
					for (int j = 0; j < array.length; j++)
					{
						array[i][j] = scan.nextInt();
					}
					System.out.println();
				}

				// Print first array

				for (int i = 0; i < array.length; i++)
				{
					for (int j = 0; j < array.length; j++)
					{
						System.out.print(array[i][j] + " ");
					}
					System.out.println();
				}

				// create second Array
				int array2[][] = new int[row][column];
				System.out.println("Now Enter Elements in 2nd array");
				for (int i = 0; i < array2.length; i++)
				{
					for (int j = 0; j < array2.length; j++)
					{
						array2[i][j] = scan.nextInt();
					}
					System.out.println();
				}

				// Print second array

				for (int i = 0; i < array2.length; i++)
				{
					for (int j = 0; j < array2.length; j++)
					{
						System.out.print(array2[i][j] + " ");
					}
					System.out.println();
				}

				// create 3rd array

				int array3[][] = new int[row][column];

				// addition login

				for (int i = 0; i < array3.length; i++)
				{
					for (int j = 0; j < array2.length; j++)
					{
						array3[i][j] = array[i][j] + array2[i][j];
					}
					System.out.println();
				}

				// Print third array
				System.out.println("Addition of two arrays is: ");
				for (int i = 0; i < array3.length; i++)
				{
					for (int j = 0; j < array3.length; j++)
					{
						System.out.print(array3[i][j] + " ");
					}
					System.out.println();
				}
				scan.close();
			}

			else
			{
				System.out.println("You have enter incorrect number..Both Number should be same");
			}
		}
		catch (InputMismatchException e)
		{
			System.out.println(e);
		}
	}

}
