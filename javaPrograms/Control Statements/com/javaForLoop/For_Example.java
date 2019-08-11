/**
 * for loop example
 */
package com.javaForLoop;

/**
 * @author Kunal24
 * @since 2019
 * @implNote In programming language, loops are used to execute a set of
 *           instruction/function repeadedly when condition becom true.Types of
 *           loops:
 * @implNote -> for loop:
 * @implNote If the number of iteration is fixed, it is recommended to use for
 *           loop.
 * @implNote Syntax:
 * @implNote for(init;condition;inc/decr)
 * @implNote {
 * @implNote // Code to be exected here
 * @implNote }
 * @implNote Syntax for infinitive loop:
 * @implNote for(;;)
 * @implNote {
 * @implNote // code to be executed
 * @implNote }
 * @implNote -> while loop:
 * @implNote If the number of iteration is not fixed, it is recommended to use
 *           while loop.
 * @implNote Syntax:
 * @implNote while(condition)
 * @implNote {
 * @implNote // Code to be executed
 * @implNote }
 * @implNote Syntax for infinitive loop
 * @implNote while(true)
 * @implNote {
 * @implNote // Code to be executed
 * @implNote }
 * @implNote -> do-while loop:
 * @implNote If the number of iteration is not fixed and you must have to execte
 *           the loopat least once, it is recommended to use the
 *           do-while loop.
 * @implNote Syntax:
 * @implNote do
 * @implNote {
 * @implNote // Code to be executed
 * @implNote }while(condition);
 * @implNote Syntax for infinitive loop
 * @implNote do
 * @implNote {
 * @implNote // code to be executed
 * @implNote }while(true)
 */
public class For_Example
{
	int number = 10;

	public static void main(String[] args)
	{
		For_Example Obj = new For_Example();
		for (int i = 0; i <= Obj.number; i++)
		{
			if (i > 0)
				System.out.println(i);
		}
	}
}
