/**
 * Palindrome String
 */
package com.javaObjectToString;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Palindrome String
 */
public class PalindromeString
{
	void calculation(String name)
	{
		String rev;
		System.out.println("Given string is: " + name);
		StringBuffer obj = new StringBuffer(name);
		obj.reverse();
		rev = obj.toString();
		if (name.equals(rev))
		{
			System.out.println("Palendrom String");
		}
		else
		{
			System.out.println("No Palendrom String");
		}
	}

	public static void main(String[] args)
	{
		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter name: ");
		name = scan.nextLine();
		new PalindromeString().calculation(name);
		scan.close();
	}
}
