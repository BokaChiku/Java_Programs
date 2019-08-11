/**
 * Example of Method Overloading with Type Promotion in case of ambiguity
 */
package com.javaMethodOverloading;

/**
 * @author Kunal
 * @since 2019
 * @implNote If there are no matching type arguments in the method, and each
 *           method promotes similar number of arguments, there will be
 *           ambiguity.
 */
public class Method_Overloading_With_Type_Promotion_In_Case_Of_Ambigity
{
	void sum(int a, long b)
	{
		System.out.println("A Method invoked");
	}

	void sum(long a, int b)
	{
		System.out.println("B Method invoked");
	}

	public static void main(String[] args)
	{
		Method_Overloading_With_Type_Promotion_In_Case_Of_Ambigity Obj = new Method_Overloading_With_Type_Promotion_In_Case_Of_Ambigity();
		Obj.sum(20, 20); // now ambiguity
	}
}
