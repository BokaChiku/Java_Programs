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
 * @implNote -> But if you store 1, it will store ASCII character of given
 *           number which is start of heading which is not printable. So it will
 *           not print anything on the console.
 */
public class IntToCharExample2
{
	public static void main(String[] args)
	{
		int num = 1;
		char ch = (char) num;
		System.out.println("Char is: " + ch);
		char ch2 = (char) (num + '0');
		System.out.println("Char is: " + ch2);

	}
}
