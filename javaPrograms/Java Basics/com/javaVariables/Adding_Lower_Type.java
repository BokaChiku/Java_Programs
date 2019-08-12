/**
 * Java variable example: Adding Lower Type
 */
package com.javaVariables;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Adding Lower Type
 */
public class Adding_Lower_Type
{
	public static void main(String[] args)
	{
		byte a = 10;
		byte b = 20;
		// byte c = a + b; //Compile time error
		byte c = (byte) (a + b);
		System.out.println(c);
	}
}
