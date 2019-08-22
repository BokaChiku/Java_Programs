/**
 * 
 */
package com.JavaTryCatchBlock;

/**
 * @author Kunal
 * @since 2019
 * @implNote ArrayIndexOutofBoundsExxception
 */
public class Unchecked_Exception_Array
{
	public static void main(String[] args)
	{
		int array[] = new int[5];
		try
		{
			System.out.println(array[12]);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array has only 5 index !!");
		}
		System.out.println("Normal flow..");
	}
}
