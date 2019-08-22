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
public class InvalidAgeException extends Exception
{
	InvalidAgeException(String s)
	{
		super(s);
	}
}
