/**
 * Java if-else-if ladder statement
 */
package java_If_Else;

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
public class If_Else_If_Ladder
{
	int marks;

	public static void main(String[] args)
	{
		If_Else_If_Ladder Obj = new If_Else_If_Ladder();
		Obj.operation();
	}

	void operation()
	{
		System.out.println("Please enter marks..");
		Scanner scan = new Scanner(System.in);
		marks = (int) scan.nextFloat();
		scan.close();
		if (marks <= 100)
		{
			if (marks < 50 && marks > 0)
			{
				System.out.println("You are Fail !!");
			}
			else if (marks >= 50 && marks < 60)
			{
				System.out.println("You have got D grade !!");
			}
			else if (marks >= 60 && marks < 70)
			{
				System.out.println("You have got B grade !!");
			}
			else if (marks >= 70 && marks < 80)
			{
				System.out.println("You have got A grade !!");
			}
			else if (marks >= 80 && marks < 90)
			{
				System.out.println("You have got A+ grade !!");
			}
			else if (marks >= 90 && marks <= 100)
			{
				System.out.println("You have got O grade !!");
			}
			else
			{
				System.out.println("Result not found or invalid marks");
			}
		}
		else
		{
			System.out.println("Inavalid Marks Or Greater than 100");
		}
	}
}
