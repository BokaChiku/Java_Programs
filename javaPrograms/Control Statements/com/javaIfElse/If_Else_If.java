/**
 * 
 */
package com.javaIfElse;

/**
 * @author Kunal
 */
public class If_Else_If
{
	public static void main(String[] args)
	{
		String sDay = "Monday";
		int iDay = 7;

		if (sDay.equals("Sunday"))
		{
			System.out.println("Today is Weekend");
		}
		else if (sDay.equals("Saturday"))
		{
			System.out.println("Today is Weekend");
		}
		else
		{
			System.out.println("Today is Workday");
		}

		if (iDay == 7)
		{
			System.out.println("Today is Sunday");
		}
		else if (iDay == 6)
		{
			System.out.println("Today is Saturday");
		}
		else
		{
			System.out.println("Today is a Weekday");
		}
	}
}
