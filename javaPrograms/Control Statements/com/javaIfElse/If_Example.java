/**
 * 
 */
package com.javaIfElse;

import java.util.Scanner;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The Java if statement is used to test the condition.It checks
 *           boolean condition: true or false.
 * @implNote Types of if statement:
 * @implNote 1. if statement
 * @implNote 2. if-else statement
 * @implNote 3. if-else-if ladder
 * @implNote 4. nested if statement
 * @implNote -> Java if statement:
 * @implNote It tests the condition. It executes if block if condition is true.
 * @implNote Syntax:
 * @implNote if(condition)
 * @implNote {
 * @implNote // code to be executed
 * @implNote }
 */
public class If_Example
{
	int age; // instance variable

	boolean result; // instance variable

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		If_Example Obj = new If_Example();
		System.out.println("Please enter your current age..");
		Obj.age = scan.nextInt();
		scan.close();
		System.out.println("Your age is: " + Obj.age);
		Obj.result = Obj.ifLogin(Obj.age);
		if (Obj.result == true)
		{
			System.out.println("You are adult !!");
		}

	}

	boolean ifLogin(int Age)
	{
		boolean flag = false;
		// Checking the age
		if (Age >= 18)
			flag = true;
		return flag;
	}
}
