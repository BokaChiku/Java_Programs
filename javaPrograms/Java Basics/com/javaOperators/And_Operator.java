/**
 * Java AND Operator Example: Logical && and Bitwise &
 */
package com.javaOperators;

/**
 * @author Kunal24
 * @since 2019
 * @implNote 1.Logical &&
 * @implNote -> The logical && operator doesn't check second condition if first
 *           condition is false. It checks second cndition only if first one is
 *           true.
 * @implNote 2. Bitwise &
 * @implNote -> It checks both conditions whether first condition is true or
 *           false.
 */
public class And_Operator
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println("Logical &&: " + (a < b && a < c));// false && true = false
		System.out.println("Bitwise &: " + (a < b & a < c));// false & true = false

	}
}
