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
 * @implNote -> If you store integer value in a single quote, it will store
 *           actual character in char variable.
 */
public class IntToCharExample3
{
	public static void main(String[] args)
	{
		int num = '2';
		char ch = (char) num;
		System.out.println("Char is: " + ch);
	}
}
