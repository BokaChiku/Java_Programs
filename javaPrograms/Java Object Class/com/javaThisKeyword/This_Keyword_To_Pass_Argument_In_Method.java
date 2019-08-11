/**
 * this: to pass an argument in the method.
 */
package com.javaThisKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote 1. The this keyword can also be used to be passed as an arguments
 *           in the method.
 * @implNote 2. It is mainly used in the event handling.
 * @implNote Application of this that can be used to be passed as an argument:
 * @implNote -> In event handling (or) in a situation where we have to provide
 *           reference of a class to another one. It is used to reuse one object
 *           in many methods.
 */
public class This_Keyword_To_Pass_Argument_In_Method
{
	void method(This_Keyword_To_Pass_Argument_In_Method Obj)
	{
		System.out.println("Method is invoked.");
	}

	void method2()
	{
		method(this);
	}

	public static void main(String[] args)
	{
		This_Keyword_To_Pass_Argument_In_Method Obj = new This_Keyword_To_Pass_Argument_In_Method();
		Obj.method2();
	}
}
