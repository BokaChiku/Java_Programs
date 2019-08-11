/**
 * Method Overloading: Chaning data type of argument We create two methods that
 * differe in data type. The first add method receives two integer arguments The
 * second add method receives two double arguments.
 */
package com.javaMethodOverloading;

/**
 * @author Kunal
 * @since 2019
 * @implNote Method Overloading: Chaning data type of argument
 */
public class Method_Overload_Changing_Data_Type_Of_Arguments
{
	static void add(int num1, int num2)
	{
		System.out.println("Additiona of two number is: " + (num1 + num2));
	}

	static void add(double num1, double num2, double num3)
	{
		System.out.println("Additiona of three number is: " + (num1 + num2 + num3));
	}

	public static void main(String[] args)
	{
		Method_Overload_Changing_Data_Type_Of_Arguments.add(10, 20);
		Method_Overload_Changing_Data_Type_Of_Arguments.add(10.25, 20.36, 58.24);

	}
}
