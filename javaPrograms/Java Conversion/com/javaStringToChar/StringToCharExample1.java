/**
 * Java Convert String to char
 */
package com.javaStringToChar;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert String to char
 * @implNote -> We can convert String to char in java using charAt() method of
 *           String class.
 * @implNote -> The charAt() method returns a single character only. To get all
 *           characters, you can use loop.
 * @implNote
 * @implNote Signature
 * @implNote -> The charAt() method returns a single character of specified
 *           index. The signature of charAt() method is given below:
 * @implNote public char charAt(int index)
 * @implNote String s="hello";
 * @implNote char c=s.charAt(0);//returns h
 */
public class StringToCharExample1
{
	public static void main(String[] args)
	{
		String name = "Kunal";
		char ch = name.charAt(0);
		System.out.println("Charachter at 0 index: " + ch);

		for (int i = 0; i < name.length(); i++)
		{
			System.out.println("Char at index [" + i + "] => " + name.charAt(i));
		}
	}
}
