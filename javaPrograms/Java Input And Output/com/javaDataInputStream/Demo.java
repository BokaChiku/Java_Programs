/**
 * 
 */
package com.javaDataInputStream;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.InputMismatchException;

/**
 * @author Kunal
 * @since 2019
 * @implNote DataInputStream
 */
public class Demo
{

	void displayArray(int array[])
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Array index [" + i + "] => " + array[i]);
		}
	}

	public static void main(String[] args)
	{
		try
		{
			int length;
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Please enter array length: ");
			length = Integer.parseInt(dis.readLine());
			int array[] = new int[length];
			System.out.println("Please enter array elements: ");
			for (int i = 0; i < array.length; i++)
			{
				array[i] = Integer.parseInt(dis.readLine());
			}
			Demo obj = new Demo();
			obj.displayArray(array);
			dis.close();
		}
		catch (InputMismatchException e)
		{
			System.out.println("Input Miss Match Exception..");
		}
		catch (IOException e)
		{
			System.out.println("DataInputStream Exception Handled..");
		}
	}
}
