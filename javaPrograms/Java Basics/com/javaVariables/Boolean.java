/**
 * 
 */
package com.javaVariables;

/**
 * @author Kunal
 */
public class Boolean
{
	// Use the boolean keyword to declare boolean variable
	boolean flag2;

	public static void main(String args[])
	{
		boolean flag1 = true;
		Boolean obj = new Boolean();
		// Print the value of boolean variable
		System.out.println("First Flag: " + flag1);
		System.out.println("Second Flag: " + obj.flag2);
		// Change the value of boolean variable
		flag1 = false;
		System.out.println("First Flag: " + flag1);
	}
}
