/**
 * Java if-else-if ladder statement
 */
package com.javaIfElse;

import java.util.Scanner;

/**
 * @author Kunal24
 * @since 2019
 * @implNote It executes one condition from multiple statement.
 * @implNote Syntax:
 * @implNote if(condition)
 * @implNote {
 * @implNote // code to be executed if condition 1 is true
 * @implNote }
 * @implNote else if(condition2)
 * @implNote {
 * @implNote // code to be executed if condition 2 is true
 * @implNote }
 * @implNote ...
 * @implNote else
 * @implNote {
 * @implNote code to be executed if all condition fails
 * @implNote }
 */
public class If_Else_If_Ladder2
{
	int number;

	public static void main(String[] args)
	{
		If_Else_If_Ladder2 Obj = new If_Else_If_Ladder2();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter one number.");
		Obj.number = scan.nextInt();
		scan.close();
		Obj.operation(Obj.number);
	}

	void operation(int Number)
	{
		if (Number > 0)
		{
			System.out.println("Given number is positive");
		}
		else if (Number < 0 || Number > -1234567890)
		{
			System.out.println("Given number is negative");
		}
		else
		{
			System.out.println("Given number is zero");
		}
	}
}
