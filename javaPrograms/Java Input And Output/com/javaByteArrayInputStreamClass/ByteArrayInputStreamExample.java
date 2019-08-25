/**
 * Java ByteArrayInputStream Class
 */
package com.javaByteArrayInputStreamClass;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote The ByteArrayInputStream is composed of two words: ByteArray and
 *           InputStream.
 * @implNote As the name suggests, it can be used to read byte array as input
 *           stream.
 * @implNote Java ByteArrayInputStream class contains an internal buffer which
 *           is used to read byte array as stream.
 * @implNote In this stream, the data is read from a byte array.
 * @implNote The buffer of ByteArrayInputStream automatically grows according to
 *           data.
 * @implNote
 * @implNote Java ByteArrayInputStream class declaration
 * @implNote public class ByteArrayInputStream extends InputStream
 * @implNote
 * @implNote Java ByteArrayInputStream class constructors
 * @implNote 1. ByteArrayInputStream(byte[] ary) -> Creates a new byte array
 *           input stream which uses ary as its buffer array.
 * @implNote 2. ByteArrayInputStream(byte[] ary, int offset, int len) Creates a
 *           new byte array input stream which uses ary as its buffer array that
 *           can read up to specified len bytes of data from an array.
 */
public class ByteArrayInputStreamExample
{
	public static void main(String[] args)
	{
		try
		{
			byte[] buf = { 35, 36, 37, 38 };
			// Create the new byte array input stream
			ByteArrayInputStream obj = new ByteArrayInputStream(buf);
			int i = 0;
			while ((i = obj.read()) != -1)
			{
				System.out.print((char) i + " ");
			}
			obj.close();

		}
		catch (IOException e)
		{
			System.out.println("Exception Handled");
		}
	}
}
