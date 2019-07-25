/**
 * Java do-while Loop
 */
package java_Do_While_Loop;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The Java do-while loop is used to iterate a part of the program
 *           several times.
 * @implNote If the number of iteration is not fixed and you must have to
 *           execute the loop at least one, it is recommended to use do-while
 *           loop.
 * @implNote The java do-while loop is executed at least once because condition
 *           is checked after loop body.
 * @implNote Syntax:
 * @implNote do
 * @implNote {
 * @implNote // Code to be executed
 * @implNote }while(condition);
 */
public class Do_While_Example
{
	int count = 1;

	public static void main(String[] args)
	{
		Do_While_Example Obj = new Do_While_Example();
		do
		{
			System.out.println(Obj.count);
			Obj.count++;
		}
		while (Obj.count <= 10);
	}
}
