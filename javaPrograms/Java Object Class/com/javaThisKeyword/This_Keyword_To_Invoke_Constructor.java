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
public class This_Keyword_To_Invoke_Constructor
{
	This_Keyword_To_Invoke_Constructor()
	{
		System.out.println("This is default constructor");
	}

	This_Keyword_To_Invoke_Constructor(int x)
	{
		this();
		System.out.println("Given Number is: " + x);
	}

	public static void main(String[] args)
	{
		This_Keyword_To_Invoke_Constructor Obj = new This_Keyword_To_Invoke_Constructor(5);
	}
}
