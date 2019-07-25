/**
 * Java While Loop Example
 */
package java_While_Loop;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The Java while loop is used to iterate a part of the program
 *           serveral times.
 * @implNote If the number of iteration is not fixed, it is recommended to use
 *           while loop.
 * @implNote Syntax:
 * @implNote while(condition)
 * @implNote {
 * @implNote // code to be executed
 * @implNote }
 */
public class While_Example
{
	int count = 1;

	public static void main(String[] args)
	{
		While_Example Obj = new While_Example();
		while (Obj.count <= 10)
		{
			System.out.println(Obj.count);
			Obj.count++; // If we don't increment count it will print 1 infinite time.
		}
	}
}
