/**
 * Java Nested try block
 */
package com.javaNestedTryBlock;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Nested try block
 * @implNote -> The try block within a try block is known as nested try block in
 *           java.
 * @implNote Why use nested try block
 * @implNote -> Sometimes a situation may arise where a part of a block may
 *           cause one error and the entire block itself may cause another
 *           error. In such cases, exception handlers have to be nested.
 * @implNote
 * @implNote Syntax:
 * @implNote try
 * @implNote {
 * @implNote statement 1;
 * @implNote statement 2;
 * @implNote try
 * @implNote {
 * @implNote statement 1;
 * @implNote statement 2;
 * @implNote }
 * @implNote catch(Exception e)
 * @implNote {
 * @implNote
 * @implNote }
 * @implNote }
 * @implNote catch(Exception e)
 * @implNote {
 * @implNote
 * @implNote }
 * @implNote
 */
public class Java_Nested_Try_Example
{
	public static void main(String[] args)
	{
		int result;
		try
		{
			try
			{
				result = 30 / 0;
				System.out.println("Result is: " + result);
			}
			catch (ArithmeticException e)
			{
				System.out.println(e);
			}

			try
			{
				int array[] = new int[5];
				array[5] = 10;
				System.out.println(array[5]);
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
		}
		catch (Exception e)
		{
			System.out.println("All exception handled !!");
		}

		System.out.println("Normal flow execute here !!");
	}
}
