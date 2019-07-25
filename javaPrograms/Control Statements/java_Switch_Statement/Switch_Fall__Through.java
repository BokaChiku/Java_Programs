/**
 * Java Switch Statement is fall-through
 */
package java_Switch_Statement;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The java switch statement is fall - through. It means it executes
 *           all statements after the first match if a break is not preset.
 */
public class Switch_Fall__Through
{
	int number = 20;

	public static void main(String[] args)
	{
		Switch_Fall__Through Obj = new Switch_Fall__Through();
		switch (Obj.number)
		{
			case 10:
				System.out.println("10");

			case 20:
				System.out.println("20");

			case 30:
				System.out.println("30");

			default:
				System.out.println("No found 10, 20, 30");
		}
	}
}
