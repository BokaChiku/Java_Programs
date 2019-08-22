/**
 * 
 */
package com.javaMultipleCatchBlock;

/**
 * @author Kunal
 * @since 2019
 * @implNote Multiple Catch Blocks For One Try Block
 * @implNote -> A try block can be followed by one or more catch block. Each
 *           catch block must contain different exception handler.
 * @implNote -> When we want to perform different task in program then we can
 *           use multiple catch block.
 * @implNote
 * @implNote -> Note:
 * @implNote 1. At a time only one exception occurs and at a time only one catch
 *           block executed.
 * @implNote 2. Catch block should be used from child to parent.i.e
 *           AirthmeticException must come first after that Exception, Trowable
 *           etc.
 * @implNote In this example there are two exceptions but at a time only one
 *           catch will execute.
 */
public class Multiple_Catch_For_One_Try_Third_Example
{
	public static void main(String[] args)
	{
		try
		{
			int array[] = new int[5];
			array[10] = 30 / 0;
			System.out.println(array[10]);
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException Exception");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Exception");
		}
		catch (Exception e)
		{
			System.out.println("Parent Class Exception");
		}
		System.out.println("Normal flow ..");
	}
}
