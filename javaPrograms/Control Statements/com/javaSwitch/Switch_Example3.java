/**
 * Program to check Vowel or Consonant.
 * If charachter is A,E,I,O or U it is vowel otherwise consonant.
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
 * @implNote // code to be ex
 */
public class Switch_Example3
{
	public static void main(String[] args)
	{
		String word;
		System.out.println("Please enter charachter..");
		Switch_Example3 Obj = new Switch_Example3();
		Scanner scan = new Scanner(System.in);
		word = scan.nextLine();
		scan.close();
		Obj.operation(word.charAt(0));
	}

	void operation(char ch)
	{
		switch (ch)
		{
			case 'A':
			case 'a':
				System.out.println("Given Char:" + ch + " is vowel.");
				break;

			case 'E':
			case 'e':
				System.out.println("Given Char:" + ch + " is vowel.");
				break;

			case 'I':
			case 'i':
				System.out.println("Given Char:" + ch + " is vowel.");
				break;

			case 'O':
			case 'o':
				System.out.println("Given Char:" + ch + " is vowel.");
				break;

			case 'U':
			case 'u':
				System.out.println("Given Char:" + ch + " is vowel.");
				break;

			default:
				System.out.println("Given Char:" + ch + " is Consonant");
				break;
		}
	}
}
