/**
 * Leap Year Example: A year is divisible by 4 and 400.But not by 100.
 */
package java_If_Else;

import java.util.Scanner;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The Java if-else statement is used to test the condition.It
 *           executes if block if condition is true otherwise else bock.
 * @implNote Syntax:
 * @implNote if(condition)
 * @implNote {
 * @implNote // code if condition is true
 * @implNote }
 * @implNote else
 * @implNote {
 * @implNote // code if condition is false
 * @implNote }
 */
public class Leap_Year
{
	int year;

	public static void main(String[] args)
	{
		Leap_Year Obj = new Leap_Year();
		Obj.operation();
	}

	void operation()
	{
		System.out.println("Please enter one year..");
		Scanner scan = new Scanner(System.in);
		year = scan.nextInt();
		if (year > 0)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				System.out.println("Given year is leap year: " + year);
			}
			else
			{
				System.out.println("Given year is not leap year: " + year);
			}
		}
		else
		{
			System.out.println("Given year is in negative: " + year);
		}
		scan.close();
	}
}
