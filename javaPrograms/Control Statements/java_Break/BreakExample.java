/**
 * Java Break Example
 */
package java_Break;

/**
 * @author Kunal24
 * @since 2019
 * @implNote When a break statement is encountered inside a loop, the loop is
 *           immediately terminated and the program control resumes at the next
 *           statement following loop,
 * @implNote The Java break is used to break loop or switch loop. It breaks the
 *           current flow of the program at specified condition. In case of
 *           inner loop, it breaks only inner loop.
 * @implNote We can use break statement in all types of loops such as for loop,
 *           while loop and do-while loop.
 * @implNote Syntax:
 * @implNote jump-statement;
 * @implNote break;
 */
public class BreakExample
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			if (i == 5)
			{
				break;
			}
			System.out.println(i);
		}
	}
}
