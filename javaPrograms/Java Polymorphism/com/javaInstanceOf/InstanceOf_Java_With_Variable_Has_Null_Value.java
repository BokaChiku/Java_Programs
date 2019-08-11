/**
 * instanceof Java With Variable Has Null Value
 */
package com.javaInstanceOf;

/**
 * @author Kunal
 * @since 2019
 * @implNote If we apply instanceof operator with a variable who has null value
 *           then it return false value.
 */

public class InstanceOf_Java_With_Variable_Has_Null_Value
{

	public static void main(String[] args)
	{
		InstanceOf_Java_With_Variable_Has_Null_Value Obj = null;
		System.out.println(Obj instanceof InstanceOf_Java_With_Variable_Has_Null_Value); // It will return false
	}
}
