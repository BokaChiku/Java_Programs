/**
 * Java Break Statement in While Loop
 */
package java_Break;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Break statement in while loop.
 */
public class Break_In_While
{
	public static void main(String[] args)
	{
		int i = 1;
		while (i <= 10)
		{
			if (i == 5)
			{
				break; // It will break the loop
			}
			System.out.println(i);
			i++;
		}
	}
}
