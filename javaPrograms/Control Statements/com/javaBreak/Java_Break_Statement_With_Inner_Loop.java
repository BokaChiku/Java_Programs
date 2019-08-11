/**
 * Java Break Example With Inner Loop
 */
package com.javaBreak;

/**
 * @author Kunal24
 * @since 2019
 * @implNote It breaks inner loop only if you use break statement inside the
 *           inner loop.
 */
public class Java_Break_Statement_With_Inner_Loop
{
	public static void main(String[] args)
	{
		// Outer Loop
		for (int i = 1; i <= 3; i++)
		{
			// Inner Loop
			for (int j = 1; j <= 3; j++)
			{
				if (i == 2 && j == 2)
				{
					break;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
