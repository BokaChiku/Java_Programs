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
 * @implNote
 * @implNote -> Handle multiple catch without sequencing exception.
 */
public class Sequence_Of_Catch_Block
{
	public static void main(String[] args)
	{
		try
		{
			String name = null;
			System.out.println(name.length());
		}
		catch (Exception e)
		{
			System.out.println("Parent Class Exception");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException Exception");
		}
		catch (ArithmeticException e)
		{
			System.out.println("ArithmeticException Exception");
		}
		System.out.println("Normal flow ..");
	}
}
