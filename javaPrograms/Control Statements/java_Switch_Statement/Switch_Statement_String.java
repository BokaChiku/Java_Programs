/**
 * Switch Statement with String
 */
package java_Switch_Statement;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The case should be string literal.
 */
public class Switch_Statement_String
{
	public static void main(String[] args)
	{
		String level = "Expert";
		int Level = 0;
		switch (level)
		{
			case "Beginner":
				Level = 1;
				break;

			case "Intermediate":
				Level = 2;
				break;

			case "Expert":
				Level = 3;
				break;

			default:
				Level = 0;
				break;

		}

		System.out.println("Your Level is: " + Level);
	}
}
