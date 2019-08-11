/**
 * this: to invoke current class method
 */
package com.javaThisKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote this: to invoke current class method
 * @implNote -> We can invoke the method of the current class by using the this
 *           keyword.
 * @implNote -> If you don't use this keyword, compiler automatically adds this
 *           keyword while invoking method.
 */
public class This_Keyword_To_Invoke_Class_Method
{
	void displayFirst()
	{
		System.out.println("Hello India !!");
	}

	void displaySecond()
	{
		this.displayFirst();
		// displayFirst(); Same as above line
		System.out.println("Hello India Again !!");
	}

	public static void main(String[] args)
	{
		This_Keyword_To_Invoke_Class_Method Obj = new This_Keyword_To_Invoke_Class_Method();
		Obj.displaySecond();
	}
}
