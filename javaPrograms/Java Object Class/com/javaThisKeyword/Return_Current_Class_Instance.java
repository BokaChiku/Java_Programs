/**
 * this keyword can be used to return current class instance
 */
package com.javaThisKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote this keyword can be used to return current class instance
 * @implNote -> We ca return this keyword as an statement from the method. In
 *           such case, return type of the method must be class type
 *           (Non-primitive).
 * @implNote -> Syntax of this that can be returned as a statement
 * @implNote return_type method_name()
 * @implNote {
 * @implNote return this;
 * @implNote }
 */
class A1
{
	A1 getA()
	{
		return this;
	}

	void message()
	{
		System.out.println("Hello Java !!");
	}
}

public class Return_Current_Class_Instance
{
	public static void main(String[] args)
	{
		new A1().getA().message();
	}
}
