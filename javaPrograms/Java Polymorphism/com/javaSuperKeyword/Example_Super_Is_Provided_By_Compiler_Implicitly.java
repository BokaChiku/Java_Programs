/**
 * Example of super keyword
 */
package com.javaSuperKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Example of super keyword where super() is provided by compiler
 *           implicitly.
 */
class ParentClass3
{
	ParentClass3()
	{
		System.out.println("Parent Class !!");
	}
}

public class Example_Super_Is_Provided_By_Compiler_Implicitly extends ParentClass3
{
	Example_Super_Is_Provided_By_Compiler_Implicitly()
	{
		System.out.println("Child Class !!");
	}

	public static void main(String[] args)
	{
		new Example_Super_Is_Provided_By_Compiler_Implicitly();
	}
}
