/**
 * 
 */
package com.javaCommandLineArgument;

/**
 * @author Kunal
 * @since 2019
 * @implNote Command Line Argument Example Two
 */
public class Example_Of_Command_Line_Argument_Two
{
	public static void main(String[] args)
	{
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++)
		{
			System.out.println(args[i]);
		}
	}
}
