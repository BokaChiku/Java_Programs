/**
 * Java Continue Statement in While Loop
 */
package com.javaContinue;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Java Continue Statement in While Loop
 */
public class Continue_While_Example
{
	public static void main(String[] args)
	{
		int i = 1;
		while (i <= 10)
		{
			if (i == 5)
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}
}
