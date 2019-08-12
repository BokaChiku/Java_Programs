/**
 * Java Ternary Operator
 */
package com.javaOperators;

/**
 * @author Kunal24
 * @since 2019
 * @implNote -> It is replacement of it - else statement in one line.
 * @implNote -> It is the only condition operator which takes three operands.
 */
public class Ternary_Operator
{
	public static void main(String[] args)
	{
		int a = 2;
		int b = 5;
		int min = (a < b) ? a : b;
		int max = (a > b) ? a : b;
		System.out.println("Min value: " + min);
		System.out.println("Max value: " + max);
	}
}
