/**
 * Java Exception Propagation
 */
package com.javaExceptionPropagation;

import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Exception Propagation
 * @implNote -> An exception is first thrown from the top of the stack and if it
 *           is not caught, it drops down the call stack to the previous
 *           method,If not caught there, the exception again drops down to the
 *           previous method, and so on until they are caught or until they
 *           reach the very bottom of the call stack.This is called exception
 *           propagation.
 * @implNote -> Rule: By default, Checked Exceptions are not forwarded in
 *           calling chain (propagated).
 */
public class Test_Exception_Propagation_Checked_Exception
{
	void m()
	{
		throw new IOException("Input Output Exception.."); // Unhandled exception type IOException
	}

	void n()
	{
		m();
	}

	void p()
	{
		try
		{
			n();
		}
		catch (Exception e)
		{
			System.out.println("exception handeled");
		}
	}

	public static void main(String[] args)
	{
		new Test_Exception_Propagation_Checked_Exception().p();
	}
}
