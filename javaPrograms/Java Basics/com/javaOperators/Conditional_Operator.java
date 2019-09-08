/**
 * 
 */
package com.javaOperators;

/**
 * @author Kunal
 */
public class Conditional_Operator
{
	public static void main(String[] args)
	{
		int Ten = 10;
		int Twenty = 20;
		int Thirty = 30;
		System.out.println(((Twenty == Ten + 10)? true : false));
		System.out.println(((Twenty == Ten + 10)? 20 : 10));
		System.out.println((!(Thirty == Twenty + 10)? 50 : 100));
		
	}
}
