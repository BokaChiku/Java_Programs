/**
 * 
 */
package com.javaIfElse;

/**
 * @author Kunal
 */
public class If_Else
{
	public static void main(String[] args)
	{
		int number = 7;
		String toDay = "Saturday";

		if (number == 6)
		{
			System.out.println("Today is Saturday");
		}
		else
		{
			System.out.println("Today is Sunday");
		}

		if (toDay.equals("Sunday"))
		{
			System.out.println("toDay is equal to Sunday");
		}
		else
		{
			System.out.println("toDay is equal to Saturday");
		}
	}
}
