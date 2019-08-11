/**
 * 
 */
package com.javaIfElse;

/**
 * @author Kunal24
 * @since 2019
 * @implNote I represents the if block within if block.If outer if block
 *           condition is true then only inner if block checks.
 * @implNote Syntax:
 * @implNote if(condition)
 * @implNote {
 * @implNote // code to be executed
 * @implNote if(condition)
 * @implNote {
 * @implNote // code to be executed
 * @implNote }
 * @implNote }
 */
public class Nested_If_Example
{
	// Create two static variables
	static int age = 20;

	static float weight = 55.8F;

	public static void main(String[] args)
	{
		if (age >= 20)
		{
			System.out.println("Your age: " + age + " is greater than or equals to 20");
			if (weight >= 60.23)
			{
				System.out.println("Your weight: " + weight + " is greater than or equals to 60.23");
				System.out.println("You can donate blood..");
			}
			else
			{
				System.out.println("Your weight: " + weight + " is less than or equals to 60.23");
				System.out.println("You cannot donate blood..");
			}
		}
		else
		{
			System.out.println("Your age: " + age + " is less than or equals to 20");
		}
	}
}
