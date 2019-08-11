/**
 * 
 */
package com.javaMethodOverloading;

/**
 * @author Kunal
 * @since 2019
 * @implNote Method overloading is not possible by chaning the return type of
 *           the method only because ambiguity.
 * @implNote Compile time Error is better than Run Time Error. So java compiler
 *           renders compiler time error if you declare the same method having
 *           same parameters.
 */
public class Method_Overloading_Not_Poosible_by_Chaning_Return_Type_Of_Method
{
	static int add(int num1, int num2)
	{
		return (num1 + num2);
	}

	static double add(int num1, int num2)
	{
		return (num1 + num2);
	}

	public static void main(String[] args)
	{
		System.out.println(Method_Overloading_Not_Poosible_by_Chaning_Return_Type_Of_Method.add(10, 20)); // Ambiguity
	}
}
