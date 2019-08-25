/**
 * Java Convert int to char
 */
package com.javaIntToChar;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert int to char
 * @implNote -> We can convert int to char in java using typecasting. To convert
 *           higher data type into lower, we need to perform typecasting. Here,
 *           the ASCII character of integer value will be stored in the char
 *           variable.
 * @implNote Java int to char Example: Typecasting
 */
public class IntToCharExample1
{
	public static void main(String[] args)
	{
		int number = 65;
		char ch = (char) number;
		System.out.println("Charachter is: " + ch);
	}
}
