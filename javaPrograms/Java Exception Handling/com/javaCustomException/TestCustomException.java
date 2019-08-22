/**
 * Java Custom Exception
 */
package com.javaCustomException;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Custom Exception
 * @implNote -> If you are creating your own Exception that is known as custom
 *           exception or user-defined exception.
 * @implNote -> Java custom exceptions are used to customize the exception
 *           according to user need.
 * @implNote -> By the help of custom exception, you can have your own exception
 *           and message.
 */
public class TestCustomException
{
	static void validateAge(int age) throws InvalidAgeException
	{
		if (age < 18)
			System.out.println("Invalid age exception");
		else
			System.out.println("Valid age");
	}

	public static void main(String[] args)
	{
		try
		{
			validateAge(13);
		}
		catch (Exception e)
		{
			System.out.println("Exception handled..");
		}

		System.out.println("rest of the code...");

	}
}
