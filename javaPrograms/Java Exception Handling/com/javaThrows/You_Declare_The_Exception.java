/**
 * You declare the exception
 */
package com.javaThrows;

import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote A)In case you declare the exception, if exception does not occur,
 *           the code will be executed fine.
 */

class M
{
	void display() throws IOException
	{
		System.out.println("IOException");
	}
}

public class You_Declare_The_Exception
{
	public static void main(String[] args) throws IOException
	{
		M obj = new M();
		obj.display();
		System.out.println("Normal flow execute here..");
	}
}
