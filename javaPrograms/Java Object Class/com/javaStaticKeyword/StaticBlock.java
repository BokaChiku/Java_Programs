/**
 * 
 */
package com.javaStaticKeyword;

/**
 * @author Kunal
 * @since 2019
 */
public class StaticBlock
{
	static int x, y;

	static
	{
		System.out.println("You are in static block");
		x = 10;
		y = 20;
	}
	
	public static void main(String[] args)
	{
		System.out.println("value of X is: " + x);
		System.out.println("value of Y is: " + y);
	}
}
