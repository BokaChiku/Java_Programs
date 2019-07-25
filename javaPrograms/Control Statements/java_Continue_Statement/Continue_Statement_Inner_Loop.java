/**
 * Java Continue Statement with Inner Loop
 */
package java_Continue_Statement;

/**
 * @author Kunal24
 * @since 2019
 * @implNote It continues inner loop only if you use the continue statement
 *           inside the inner loop.
 */
public class Continue_Statement_Inner_Loop
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 3; i++)
		{
			for (int j = 1; j <= 3; j++)
			{
				if (i == 2 && j == 2)
				{
					continue;
				}

				System.out.println(i + " " + j);
			}
		}
	}
}
