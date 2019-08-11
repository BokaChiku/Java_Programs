/**
 * Declaration Instantiation And Initialization Of Java_Array
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 * @since 2019
 * @implNote Declaration, Instantiation and Initialization of Java Array
 * @implNote int Array[] = {10,20,30,40,50}; // declaration, instantiation and
 *           initialization
 */
public class Declaration_Instantiation_And_Initialization_Of_Java_Array
{

	public static void main(String[] args)
	{
		int Arra[] = { 10, 20, 30, 40, 50 }; // declaration, instantiation and initialization
		for (int i = 0; i < Arra.length; i++) // length is the property of Array
		{
			System.out.println("Array index[" + i + "] => " + Arra[i]);
		}
	}
}
