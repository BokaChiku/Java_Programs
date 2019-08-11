/**
 * Java Continue Statement with Labled For Loop
 */
package com.javaContinue;

/**
 * @author Kunal24
 * @since 2019
 * @implNote We can use continue statement with a albel.
 * @implNote THis feature is imtroduced into JDK 1.5. So we can continue any
 *           loop in Java now whether it is outer loop or inner.
 */
public class Continue_Statement_Inner_Loop_Labled
{
	public static void main(String[] args)
	{
		AA:
		for (int i = 1; i <= 5; i++)
		{
			BB:
			for (int j = 1; j <= 5; j++)
			{
				if (i == 3 && j == 3)
				{
					continue BB;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}
