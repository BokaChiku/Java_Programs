/**
 * 
 */
package com.JavaTryCatchBlock;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author Kunal
 * @since 2019
 * @implNote Checked exception in try catch block
 */
public class Checked_Exception
{
	public static void main(String[] args)
	{
		PrintWriter pw;
		try
		{
			pw = new PrintWriter("print.txt"); // may throw exception
			pw.print("World !!");
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("Normal flow !!");
	}
}
