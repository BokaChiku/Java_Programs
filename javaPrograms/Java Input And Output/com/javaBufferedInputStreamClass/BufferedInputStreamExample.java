/**
 * Java BufferedInputStream Class
 */
package com.javaBufferedInputStreamClass;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java BufferedInputStream Class
 * @implNote -> Java BufferedInputStream class is used to read information from
 *           stream. It internally uses buffer mechanism to make the performance
 *           fast.
 * @implNote -> When a BufferedInputStream is created, an internal buffer array
 *           is created.
 * @implNote
 * @implNote -> Java BufferedInputStream class declaration
 * @implNote public class BufferedInputStream extends FilterInputStream
 * @implNote
 * @implNote Java BufferedInputStream class constructors
 * @implNote 1. BufferedInputStream(InputStream IS) It creates the
 *           BufferedInputStream and saves it argument, the input stream IS, for
 *           later use.
 * @implNote 2. BufferedInputStream(InputStream IS, int size) -> It creates the
 *           BufferedInputStream with a specified buffer size and saves it
 *           argument, the input stream IS, for later use.
 */
public class BufferedInputStreamExample
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream in = new FileInputStream("E:\\Java File\\testout.txt");
			BufferedInputStream obj = new BufferedInputStream(in);
			int i = 0;
			while ((i = obj.read()) != -1)
			{
				System.out.print((char) i);
			}
			obj.close();
			in.close();
		}
		catch (IOException e)
		{
			System.out.println("Exception handled");
		}
	}
}
