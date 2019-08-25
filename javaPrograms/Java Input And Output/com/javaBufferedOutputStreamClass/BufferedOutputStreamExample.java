/**
 * Java BufferedOutputStream Class
 */
package com.javaBufferedOutputStreamClass;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java BufferedOutputStream Class
 * @implNote ->Java BufferedOutputStream class is used for buffering an output
 *           stream. It internally uses buffer to store data.
 * @implNote -> It adds more efficiency than to write data directly into a
 *           stream. So, it makes the performance fast.
 * @implNote -> For adding the buffer in an OutputStream, use the
 *           BufferedOutputStream class.
 * @implNote OutputStream os= new BufferedOutputStream(new
 *           FileOutputStream("D:\\IO Package\\testout.txt"));
 * @implNote Java BufferedOutputStream class declaration
 * @implNote -> public class BufferedOutputStream extends FilterOutputStream
 * @implNote
 * @implNote Java BufferedOutputStream class constructors
 * @implNote 1. BufferedOutputStream(OutputStream os) -> It creates the new
 *           buffered output stream which is used for writing the data to the
 *           specified output stream.
 * @implNote 2. BufferedOutputStream(OutputStream os, int size) -> It creates
 *           the new buffered output stream which is used for writing the data
 *           to the specified output stream with a specified buffer size.
 * @implNote Java BufferedOutputStream class methods
 * @implNote 1. void write(int b) -> It writes the specified byte to the
 *           buffered output stream.
 * @implNote 2. void flush() -> It flushes the buffered output stream.
 */
public class BufferedOutputStreamExample
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream obj = new FileOutputStream("E:\\Java File\\testout.txt");
			BufferedOutputStream o = new BufferedOutputStream(obj);
			String name = "Kunal Sanjay Chavan";
			byte arr[] = name.getBytes();
			o.write(arr);
			o.flush();
			o.close();
			obj.close();
			System.out.println("Scussess");
		}
		catch (IOException e)
		{
			System.out.println("Exception handled");
		}

	}
}
