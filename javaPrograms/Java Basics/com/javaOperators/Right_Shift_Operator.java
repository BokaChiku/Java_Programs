/**
 * Java Right Shift Operator Example
 */
package com.javaOperators;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The java right shift operator >> is used to move left operands
 *           value to right by the the number of bits specified by the right
 *           operand.
 */
public class Right_Shift_Operator
{
	public static void main(String[] args)
	{
		System.out.println(10 >> 2);// 10/2^2=10/4=2
		System.out.println(10 >> 3);// 10/2^3=10/8=1
		System.out.println(10 >> 4);// 10/2^4=10/16=0

	}
}
