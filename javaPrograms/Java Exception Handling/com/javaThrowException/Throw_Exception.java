/**
 * Java throw exception
 */
package com.javaThrowException;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java throw keyword
 * @implNote -> The Java throw keyword is used to explicitly throw an exception.
 * @implNote -> We can throw either checked or uncheked exception in java by
 *           throw keyword. The throw keyword is mainly used to throw custom
 *           exception.
 * @implNote
 * @implNote The syntax of java throw keyword is given below.
 * @implNote -> throw exception;
 * @implNote Example
 * @implNote -> throw new IOException("sorry device error);
 * @implNote
 * @implNote -> In this example, we have created the validate method that takes
 *           integer value as a parameter. If the age is less than 18, we are
 *           throwing the ArithmeticException otherwise print a message welcome
 *           to vote.
 */
public class Throw_Exception
{
	void calculate(int age)
	{
		if (age < 18)
		{
			throw new ArithmeticException("Age Not Valid !!");
		}
		else
		{
			System.out.println("You can vote..");
		}
	}

	public static void main(String[] args)
	{
		int age = 13;
		new Throw_Exception().calculate(age);
		System.out.println("Rest of the code...");
	}
}
