/**
 * Java Wrapper in Switch Statement
 */
package com.javaSwitch;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Java allows us to use four wrapper classes:
 * @implNote -> Byte
 * @implNote -> Short
 * @implNote -> Integer
 * @implNote -> Long
 */
public class Wrapper_Switch_Statement
{
	public static void main(String[] args)
	{
		Integer age = 18;
		switch (age)
		{
			case 16:
				System.out.println("You are under 18");
				break;

			case 18:
				System.out.println("You are eligible for vote.");
				break;

			case 65:
				System.out.println("You are senior citizen");
				break;

			default:
				System.out.println("Please provide valid age.");
				break;
		}
	}
}
