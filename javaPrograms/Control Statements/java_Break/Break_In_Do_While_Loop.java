/**
 * Java Break Statement in do-while loop
 */
package java_Break;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Java Break Statement in do-while loop
 */
public class Break_In_Do_While_Loop
{
	int i = 1;

	public static void main(String[] args)
	{
		Break_In_Do_While_Loop Obj = new Break_In_Do_While_Loop();
		do
		{
			System.out.println(Obj.i);
			Obj.i++;
			if (Obj.i == 5)
			{
				break;
			}
		}
		while (Obj.i <= 10);
	}
}
