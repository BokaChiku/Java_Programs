/**
 * Java Unary Operator
 * Example: ~ and !
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
public class Java_Unary_Operator3
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = -10;
		boolean flag1 = true;
		boolean flag2 = false;
		System.out.println(~a); // -11 (minus of total positive value which starts from 0)
		System.out.println(~b); // 9 (positive of total minus,positive start from 0)
		System.out.println(!flag1); // false (Oppsoite of boolean value)\
		System.out.println(!flag2); // true (Oppsoite of boolean value)

	}
}
