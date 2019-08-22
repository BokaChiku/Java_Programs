/**
 * Java Exception Propagation
 */
package com.javaExceptionPropagation;

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
 * @implNote -> Rule: By default Unchecked Exceptions are forwarded in calling
 *           chain (propagated).
 * @implNote -> In the above example exception occurs in divison() method where
 *           it is not handled,so it is propagated to previous functionCall()
 *           method where it is not handled, again it is propagated to
 *           functionHandled() method where exception is handled. Exception can
 *           be handled in any method in call stack either in main() method,
 *           divison() method, functionCall() method or functionHandled()
 *           method.
 */
public class Test_Exception_Propagation_Unchecked_Exception
{
	void divison()
	{
		int a = 10, b = 0;
		int result = a / b;
		System.out.println("Result is: " + result);
	}

	void functionCall()
	{
		divison();
	}

	void functionHandled()
	{
		try
		{
			functionCall();
		}
		catch (ArithmeticException e)
		{
			System.out.println("Exception handled.");
		}
	}

	public static void main(String[] args)
	{
		new Test_Exception_Propagation_Unchecked_Exception().functionHandled();
		System.out.println("Normal flow execute.");
	}
}
