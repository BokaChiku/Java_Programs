/**
 * Java if-else Statement
 * Program of Odd and Even Number
 */
package com.javaIfElse;

import java.util.Scanner;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The Java if-else statement is used to test the condition.It
 *           executes if block if condition is true otherwise else bock.
 * @implNote Syntax:
 * @implNote if(condition)
 * @implNote {
 * @implNote // code if condition is true
 * @implNote }
 * @implNote else
 * @implNote {
 * @implNote // code if condition is false
 * @implNote }
 */
public class If_Else_Example
{
	int number = 0; // instance variable

	public static void main(String[] args)
	{
		If_Else_Example Obj = new If_Else_Example();
		Obj.operation();
	}

	void operation()
	{
		System.out.println("Please enter any number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		// Check tf the number is divisible by 2 or not
		if (number % 2 == 0)
		{
			System.out.println("Given number is Even: " + number);
		}
		else
		{
			System.out.println("Given number is Odd: " + number);
		}
		scan.close();
	}
}
