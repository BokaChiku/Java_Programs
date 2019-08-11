/**
 * Example of Method Overloading with Type Promotion if matching found
 */
package com.javaMethodOverloading;

/**
 * @author Kunal
 * @since 2019
 * @implNote If there are matching type arguments in the method, type promotion
 *           is not performed.
 */
public class Method_Overloading_With_Type_Promotion_Matching
{

	void sum(int a, int b)
	{
		System.out.println(" Int arg method invoked..");
	}

	void sum(long a, long b)
	{
		System.out.println(" Long arg method invoked..");
	}

	public static void main(String[] args)
	{
		Method_Overloading_With_Type_Promotion_Matching Obj = new Method_Overloading_With_Type_Promotion_Matching();
		Obj.sum(20, 20); // now int arg sum() method gets invoked
	}
}
