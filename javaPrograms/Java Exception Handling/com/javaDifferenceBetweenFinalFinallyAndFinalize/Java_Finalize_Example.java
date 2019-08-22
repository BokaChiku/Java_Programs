/**
 * Java finalize example
 */
package com.javaDifferenceBetweenFinalFinallyAndFinalize;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java finalize example
 */
public class Java_Finalize_Example
{
	public void finalize()
	{
		System.out.println("Finalize Method..");
	}

	public static void main(String[] args)
	{
		Java_Finalize_Example obj = new Java_Finalize_Example();
		Java_Finalize_Example obj2 = new Java_Finalize_Example();
		obj = null;
		obj2 = null;
		System.gc();
	}
}
