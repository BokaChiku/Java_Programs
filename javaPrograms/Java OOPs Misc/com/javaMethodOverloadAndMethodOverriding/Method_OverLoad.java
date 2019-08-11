/**
 * 
 */
package com.javaMethodOverloadAndMethodOverriding;

/**
 * @author Kunal
 * @since 2019
 * @implNote Method Overloading:
 * @implNote 1. It is compile time polymorphism.
 * @implNote 2. Overloading can't be performed bt changing return type of the
 *           method. If return type is same then parameter should be different.
 * @implNote 3.In case of method overloading, parameter must be different.
 * @implNote 4. Method overloading is performed within class.
 * @implNote 5. It increase readability of the program.
 */
public class Method_OverLoad
{
	void sum(int num1, int num2)
	{
		System.out.println("Addition of Integer: " + (num1 + num2));
	}

	void sum(float num1, float num2)
	{
		System.out.println("Addition of Float: " + (num1 + num2));
	}

	void sum(double num1, double num2)
	{
		System.out.println("Addition of Double: " + (num1 + num2));
	}

	String charachter(String ch)
	{
		return ch;
	}

	String charachter(String ch, String ch1)
	{
		return ch + " " + ch1;
	}

	public static void main(String... args)
	{
		Method_OverLoad obj = new Method_OverLoad();
		obj.sum(23.45D, 50.76D);
		obj.sum(76.54F, 32.12F);
		obj.sum(10, 20);
		System.out.println(obj.charachter("Kunal"));
		System.out.println(obj.charachter("Kunal", "Chavan"));
	}
}
