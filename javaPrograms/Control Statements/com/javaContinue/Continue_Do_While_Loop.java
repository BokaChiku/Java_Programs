/**
 * Java Continue Statement in do-while Loop
 */
package com.javaContinue;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Java Continue Statement in do-while Loop
 */
public class Continue_Do_While_Loop
{
	public static void main(String[] args)
	{
		int i = 1;
		do
		{
			if (i == 5)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		while (i <= 10);
	}
}
