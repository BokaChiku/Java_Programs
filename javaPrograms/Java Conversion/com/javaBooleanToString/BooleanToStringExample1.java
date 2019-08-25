/**
 * Java Convert boolean to String
 */
package com.javaBooleanToString;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert boolean to String
 * @implNote -> We can convert boolean to String in java using
 *           String.valueOf(boolean) method.
 * @implNote -> Alternatively, we can use Boolean.toString(boolean) method which
 *           also converts boolean into String.
 * @implNote 1) String.valueOf()
 * @implNote -> The String.valueOf() method converts boolean to String. The
 *           valueOf() is the static method of String class.
 */
public class BooleanToStringExample1
{
	public static void main(String[] args)
	{
		boolean flag = false;
		boolean flag2 = true;
		String name = String.valueOf(flag);
		String name2 = String.valueOf(flag2);
		System.out.println(name);
		System.out.println(name2);

	}
}
