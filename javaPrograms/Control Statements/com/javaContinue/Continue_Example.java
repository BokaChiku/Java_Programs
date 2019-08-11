/**
 * Java Continue Statement Example
 */
package com.javaContinue;

/**
 * @author Kunal24
 * @since' 2019
 * @implNote The continue statement is used in loop control structure when you
 *           need to jump to the next iteration of the loop immediately. It can
 *           be used with for loop or while loop.
 * @implNote The Java continue statement is used to continue the loop. It
 *           continues the current flow of the program and skips the remaining
 *           code at the specified condition. In case of an inner loop, it
 *           continues the inner loop only.
 * @implNote We can use Java continue statement in all types of loops such as
 *           for loop, while loop and do-while loop.
 * @implNote Syntax:
 * @implNote jump-statement;
 * @implNote continue;
 */
public class Continue_Example
{
	int number = 10;

	public static void main(String[] args)
	{
		Continue_Example Obj = new Continue_Example();
		// for loop
		for (int i = 1; i <= Obj.number; i++)
		{
			if (i == 5)
			{
				// using continue statement
				continue; // it will skip the statement
			}
			System.out.println(i);
		}
	}
}

/*
 * 5 is not printed on the console. It is because the loop is continued when it
 * reaches to 5.
 */