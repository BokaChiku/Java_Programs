/**
 * 
 */
package com.javaIfElse;

/**
 * @author Kunal
 * @since 2019
 * @implNote return keyword
 */
public class Return
{
	int addition(int num1, int num2)
	{
		return num1 + num2;
	}

	public static void main(String[] args)
	{
		int a = 10, b = 10, result;
		Return obj = new Return();
		result = obj.addition(a, b);
		System.out.println("Addition is: " + result);
	}
}
