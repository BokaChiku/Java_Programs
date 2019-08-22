/**
 * Java finally block
 */
package com.javaJavaFinallyBlock;

/**
 * @author Kunal
 * @since 2019
 * @implNote -> Java finally block is a block that is used to execute important
 *           code such as closing connection, stream etc.
 * @implNote -> Java finally block is always executed whether exception is
 *           handled or not.
 * @implNote -> Java finally block follows try or catch block.
 * @implNote
 * @implNote Note: If you don't handle exception, before terminating the
 *           program, JVM executes finally block(if any).
 * @implNote
 * @implNote Why use java finally
 * @implNote -> Finally block in java can be used to put "cleanup" code such as
 *           closing a file, closing connection etc
 * @implNote
 * @implNote Rule: For each try block there can be zero or more catch blocks,
 *           but only one finally block.
 * @implNote Note: The finally block will not be executed if program
 *           exits(either by calling System.exit() or by causing a fatal error
 *           that causes the process to abort).
 */
public class Java_Finally_Example_Where_Exception_Doesnot_Ooccur
{
	public static void main(String[] args)
	{
		int result;
		try
		{
			result = 25 / 5;
			System.out.println("Result is: " + result);
		}
		catch (NullPointerException e)
		{
			System.out.println("Can not devide by zero.");
		}
		finally
		{
			System.out.println("Finally always execute");
		}
	}
}
