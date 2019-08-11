/**
 * Java Break Statement with Labeled For Loop
 */
package com.javaBreak;

/**
 * @author Kunal24
 * @since 2019
 * @implNote We can use break statement with a label. This feature is introduced
 *           since JDK 1.5. So, we can break any loop in Java now wheter it is
 *           outer loop or inner.
 */
public class Java_Break_With_Labeled_Loop
{
	public static void main(String[] args)
	{
		AA:
		for (int i = 1; i <= 3; i++)
		{
			BB:
			for (int j = 1; j <= 3; j++)
			{
				if (i == 2 && j == 2)
				{
					break AA;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
