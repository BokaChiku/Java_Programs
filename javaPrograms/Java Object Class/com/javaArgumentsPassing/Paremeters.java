/**
 * 
 */
package com.javaArgumentsPassing;

/**
 * @author Kunal
 */

class Operation
{
	void addition(int num1, int num2) // Formal Arguments
	{
		int result = num1 + num2;
		System.out.println("Addition of " + num1 + " and " + num2 + " is: " + result);
	}

	void subtraction(int num1, int num2) // Formal Arguments
	{
		int result = num1 - num2;
		System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + result);
	}
}

public class Paremeters
{
	public static void main(String[] args)
	{
		Operation obj = new Operation();
		obj.addition(10, 10); // Informal Arguments
		obj.subtraction(20, 10); // Informal Arguments
	}
}
