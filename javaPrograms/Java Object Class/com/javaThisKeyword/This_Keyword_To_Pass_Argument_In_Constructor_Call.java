/**
 * this: to pass an argument in the constructor call.
 */
package com.javaThisKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote We can pass the this keyword in constructor also.
 * @implNote It is useful if we have to use one object in multiple classes.
 */

class A
{
	This_Keyword_To_Pass_Argument_In_Constructor_Call Obj;

	A(This_Keyword_To_Pass_Argument_In_Constructor_Call Obj)
	{
		this.Obj = Obj;
	}

	void display()
	{
		System.out.println(Obj.data);
	}
}

public class This_Keyword_To_Pass_Argument_In_Constructor_Call
{
	int data = 10;

	This_Keyword_To_Pass_Argument_In_Constructor_Call()
	{
		A Obj = new A(this);
		Obj.display();
	}

	public static void main(String[] args)
	{
		This_Keyword_To_Pass_Argument_In_Constructor_Call Obj = new This_Keyword_To_Pass_Argument_In_Constructor_Call();
	}
}
