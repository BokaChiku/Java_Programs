/**
 * this(): to invoke current class constructor
 */
package com.javaThisKeyword;

/**
 * @author Kunal
 * @since this(): to invoke current class constructor
 * @implNote -> this() constructor call can be used to imvoke the current class
 *           constructor.
 * @implNote -> It is used to reuse the constructor.
 * @implNote -> It is used for constructor chaining.
 */
public class This_Keyword_To_Invoke_Constructor2
{
	static int number = 5;

	This_Keyword_To_Invoke_Constructor2(int x)
	{
		System.out.println("Given Number is: " + x);
	}

	This_Keyword_To_Invoke_Constructor2()
	{
		this(number);
		System.out.println("This is default constructor");
	}

	public static void main(String[] args)
	{
		This_Keyword_To_Invoke_Constructor2 Obj = new This_Keyword_To_Invoke_Constructor2();
	}
}
