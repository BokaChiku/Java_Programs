/**
 * Java throws keyword
 */
package com.javaThrows;

import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java throws keyword
 * @implNote -> The Java throws keyword is used to declare an exception. It
 *           gives an information to the programmer that there may occur an
 *           exception so it is better for the programmer to provide the
 *           exception handling code so that normal flow can be maintained.
 * @implNote -> Exception Handling is mainly used to handle the checked
 *           exceptions. If there occurs any unchecked exception such as
 *           NullPointerException, it is programmers fault that he is not
 *           performing check up before the code being used.
 * @implNote
 * @implNote Syntax of java throws
 * @implNote return_type method_name() throws exception_class_name
 * @implNote {
 * @implNote //method code
 * @implNote }
 * @implNote
 * @implNote Which exception should be declared
 * @implNote Ans) checked exception only, because:
 * @implNote 1. unchecked Exception: under your control so correct your code.
 * @implNote 2. error: beyond your control e.g. you are unable to do anything if
 *           there occurs VirtualMachineError or StackOverflowError.
 * @implNote
 * @implNote Advantage of Java throws keyword
 * @implNote 1. Now Checked Exception can be propagated (forwarded in call
 *           stack).
 * @implNote 2. It provides information to the caller of the method about the
 *           exception.
 */
public class Java_Throws_Example
{
	void n() throws IOException
	{
		throw new IOException("Exception Handling..");
	}

	void m() throws IOException
	{
		n();
	}

	void p()
	{
		try
		{
			m();
		}
		catch (Exception e)
		{
			System.out.println("Exception handled");
		}
	}

	public static void main(String[] args)
	{
		new Java_Throws_Example().p();
		System.out.println("Normal flow");
	}
}
