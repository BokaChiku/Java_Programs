/**
 * Ternamry operator
 */
package java_If_Else;

import java.util.Scanner;

/**
 * @author Kunal24
 * @since 2019
 * @implNote We can use (?:) to perform the task of if..elsse statement.
 * @implNote It is a shorthand way to check the condition.
 * @implNote If condition is true, the result of ? is retured.
 * @implNote If result is false then, result of : is retured.
 */
public class Ternary_Operator
{
	static int number;

	public static void main(String[] args)
	{
		// using ternary operator
		System.out.println("Please enter one number..");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		System.out.println("Given number is: " + number);
		String result = (number % 2 == 0) ? "Even Number" : "Odd Number";
		System.out.println(result);
	}
}
