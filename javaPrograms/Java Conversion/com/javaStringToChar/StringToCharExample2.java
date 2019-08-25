/**
 * Java String to char Example: toCharArray() method
 */
package com.javaStringToChar;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String to char Example: toCharArray() method
 * @implNote ->
 */
public class StringToCharExample2
{
	public static void main(String[] args)
	{
		String name = "Kunal";
		char array[] = name.toCharArray();
		for (int i = 0; i < array.length; i++)
		{
			System.out.println("Char at index [" + i + "] => " + array[i]);
		}
	}
}
