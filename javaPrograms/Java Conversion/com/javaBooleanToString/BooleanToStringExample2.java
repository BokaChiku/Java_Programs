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
 * @implNote -> 2) Boolean.toString()
 * @implNote -> The Boolean.toString() method converts boolean to String. The
 *           toString() is the static method of Boolean class.
 */
public class BooleanToStringExample2
{
	public static void main(String[] args)
	{
		boolean flag = false;
		boolean flag2 = true;
		String name = Boolean.toString(flag);
		String name2 = Boolean.toString(flag2);
		System.out.println(name);
		System.out.println(name2);
	}
}
