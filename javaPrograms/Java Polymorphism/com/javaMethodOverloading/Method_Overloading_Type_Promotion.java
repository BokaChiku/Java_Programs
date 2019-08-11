/**
 * Example of Method Overloading with Type Promotion
 */
package com.javaMethodOverloading;

/**
 * @author Kunal
 * @since 2019
 * @implNote Method Overloading with TypePromoton
 */
public class Method_Overloading_Type_Promotion
{
	void sum(int a, long b)
	{
		System.out.println("Addition of two number: " + (a + b));
	}

	void sum(int a, int b, int c)
	{
		System.out.println("Addition of three number: " + (a + b + c));
	}

	public static void main(String[] args)
	{
		Method_Overloading_Type_Promotion Obj = new Method_Overloading_Type_Promotion();
		Obj.sum(20, 20); // now second int literal will be promoted to long
		Obj.sum(30, 30, 30);
	}
}
