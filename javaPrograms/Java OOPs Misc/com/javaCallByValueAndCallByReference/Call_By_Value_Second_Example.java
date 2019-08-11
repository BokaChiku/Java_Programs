/**
 * Call By Value Example
 */
package com.javaCallByValueAndCallByReference;

/**
 * @author Kunal
 * @since 2019
 * @implNote Call By Value Second Example
 */
public class Call_By_Value_Second_Example
{
	int number = 50;

	void operation(Call_By_Value_Second_Example obj)
	{
		obj.number = number + 100;
	}

	public static void main(String[] args)
	{
		Call_By_Value_Second_Example obj = new Call_By_Value_Second_Example();
		obj.operation(obj);
		System.out.println(obj.number);
	}
}
