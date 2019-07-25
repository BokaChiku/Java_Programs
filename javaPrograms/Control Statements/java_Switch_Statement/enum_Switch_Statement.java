/**
 * Java Enum in Switch Statement
 */
package java_Switch_Statement;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Java allow us to use enum in switch statement.
 */
public class enum_Switch_Statement
{
	public enum Day {
		Sun, Mon, Tue, Wed, Thu, Fri, Sat
	}

	public static void main(String[] args)
	{
		Day[] DayNow = Day.values();
		for (Day Now : DayNow)
		{
			switch (Now)
			{
				case Sun:
					System.out.println("Sunday");
					break;

				case Mon:
					System.out.println("Monday");
					break;

				case Tue:
					System.out.println("Tuesday");
					break;

				case Wed:
					System.out.println("Wednasday");
					break;

				case Thu:
					System.out.println("Thursday");
					break;

				case Fri:
					System.out.println("Friday");
					break;

				case Sat:
					System.out.println("Saturday");
					break;
			}
		}
	}
}
