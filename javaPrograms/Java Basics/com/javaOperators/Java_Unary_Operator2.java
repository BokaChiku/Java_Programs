/**
 * Java Unary Operator
 * Example: ++ and --
 */
package com.javaOperators;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The java unary operators require only one operand. Unary operators
 *           are used to perform various operations i.e:
 * @implNote 1. incrementing/decrementing a value by one
 * @implNote 2. negating an expression
 * @implNote 3. inverting the value of boolean. *
 */
public class Java_Unary_Operator2
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		System.out.println(a++ + ++a);// 10 + 12 = 22
		System.out.println(b++ + b++);// 20 + 21 = 41
	}
}
