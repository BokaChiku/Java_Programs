/**
 * You declare the exception
 */
package com.javaThrows;

import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote In case you declare the exception if exception occures, an
 *           exception will be thrown at runtime because throws does not handle
 *           the exception.
 * @implNote Que) Can we rethrow an exception? Yes, by throwing same exception
 *           in catch block.
 */

class N
{
	void display() throws IOException
	{
		throw new IOException("Exception..");
	}
}

public class You_Declare_The_Exception2
{
	public static void main(String[] args) throws IOException
	{
		N obj = new N();
		obj.display();
	}
}
