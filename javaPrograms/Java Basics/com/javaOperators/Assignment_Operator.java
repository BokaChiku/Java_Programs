/**
 * Java Assignment Operator
 */
package com.javaOperators;

/**
 * @author Kunal24
 * @since 2019
 * @implNote It is used to assign the value on its right to the operand on its
 *           left.
 */
public class Assignment_Operator
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		a += 4; // a = a + 4; ( a = 10 + 4 )
		System.out.println(a += 4);
		b -= 4; // b = b - 4; ( b = 20 - 4 )
		System.out.println(b -= 4);
		a *= 4; // a = a * 4; ( a = 10 * 4 )
		System.out.println(a *= 4);
		b /= 4; // b = b / 4; ( b = 20 / 4 )
		System.out.println(b /= 4);
		b %= 4; // b = b % 4; ( b = 20 % 4 )
		System.out.println(b %= 4);
	}
}
