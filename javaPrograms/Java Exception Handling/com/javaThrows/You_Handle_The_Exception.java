/**
 * Rule: If you are calling a method that declares an exception, you must either
 * caught or declare the exception.
 */
package com.javaThrows;

import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote Case1:You caught the exception i.e. handle the exception using
 *           try/catch.
 * @implNote In case you handle the exception, the code will be executed fine
 *           whether exception occurs during the program or not.
 */

class HandledException
{
	void m() throws IOException
	{
		throw new IOException("Exception throw..");
	}
}

public class You_Handle_The_Exception
{
	public static void main(String[] args)
	{
		try
		{
			HandledException obj = new HandledException();
			obj.m();
		}
		catch (Exception e)
		{
			System.out.println("Exception handled..");
		}
	}
}
