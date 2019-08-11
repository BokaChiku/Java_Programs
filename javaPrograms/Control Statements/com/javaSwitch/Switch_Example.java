/**
 * Find Number by using switch example
 */
package com.javaSwitch;

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
public class Switch_Example
{
	int number = 48; // instance variable

	public static void main(String[] args)
	{
		Switch_Example Obj = new Switch_Example();

		// Switch expression
		switch (Obj.number)
		{
			// Case Statements

			case 24:
				System.out.println("Twenty Four !!");
				break; // Optional

			case 48:
				System.out.println("Forty Eight !!");
				break;

			// Default case statement

			default:
				System.out.println("Number not matches in cases..");
				break;
		}
	}
}
