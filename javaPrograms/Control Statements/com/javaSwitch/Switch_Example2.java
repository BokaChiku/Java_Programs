/**
 * Finding Month Example
 */
package com.javaSwitch;

import java.util.Scanner;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The java switch statement executes one statement from multiple
 *           conditions. It is like if-else-if ladder statement. The switch
 *           statement works with byte, short, int, long, enum tyes, String and
 *           char.
 * @implNote Points To rememeber:
 * @implNote -> There can b one or N number of case value for a switch
 *           expression.
 * @implNote -> The case value must be of switch expression type only. The case
 *           value must be literal or constant. It dosen't allow variables.
 * @implNote -> The case value must be unique. In case of duplicate value, it
 *           render compile - time error.
 * @implNote -> Java switch expression must be byte, short, int , long, char,
 *           String, and enum types.
 * @implNote -> Each case statement can have a break statement which is
 *           optional. When control reaches to the break statement, it jumps the
 *           control after switch expression.If break statement is not found it
 *           executes the next case.
 * @implNote -> The case value can have a default label which is optional.
 * @implNote Syntax:
 * @implNote switch(expression)
 * @implNote {
 * @implNote case value1:
 * @implNote // Code to be executed;
 * @implNote break; // optional
 * @implNote case value2:
 * @implNote // code to be executed;
 * @implNote break; // optional
 * @implNote .....
 * @implNote default:
 * @implNote // code to be executed if all cases are not matched;
 * @implNote }
 */
public class Switch_Example2
{
	public static void main(String[] args)
	{
		int month = 0;
		Switch_Example2 Obj = new Switch_Example2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter month number..");
		month = scan.nextInt();
		scan.close();
		Obj.operation(month);
	}

	void operation(int month)
	{
		String Month = null;
		if (month > 13 || month < 0)
		{
			System.out.println("Invalid month enter by user: " + month);
		}
		else
		{
			switch (month)
			{
				case 1:
					Month = "Jan";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				case 2:
					Month = "Feb";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				case 3:
					Month = "Mar";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				case 4:
					Month = "Apr";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				case 5:
					Month = "May";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				case 6:
					Month = "Jun";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				case 7:
					Month = "Jul";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				case 8:
					Month = "Aug";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				case 9:
					Month = "Sep";
					System.out.println("Number: " + month + " and and name is: " + Month);
					break;
				case 10:
					Month = "Oct";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				case 11:
					Month = "Nov";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				case 12:
					Month = "Dec";
					System.out.println("Number: " + month + " and name is: " + Month);
					break;
				default:
					System.out.println("No month match with number..");
			}
		}
	}
}
