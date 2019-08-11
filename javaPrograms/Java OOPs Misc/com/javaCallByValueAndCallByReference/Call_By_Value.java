/**
 * Call By value Example in Java
 */
package com.javaCallByValueAndCallByReference;

/**
 * @author Kunal
 * @since 2019
 * @implNote Call By Value Example:
 * @implNote 1. There is only call by value in java, not call by reference. If
 *           we call a method by passing value it is called call by valye.
 */
public class Call_By_Value
{
	int number = 50;
	int number2 = 500;

	void operation(int number)
	{
		this.number = this.number + number;
		System.out.println("Number is: " + this.number);
	}

	void operation2(int number2)
	{
		number2 = number2 + 100;
	}

	public static void main(String[] args)
	{
		new Call_By_Value().operation(new Call_By_Value().number);
		new Call_By_Value().operation2(500);
		System.out.println(new Call_By_Value().number2);
	}
}
