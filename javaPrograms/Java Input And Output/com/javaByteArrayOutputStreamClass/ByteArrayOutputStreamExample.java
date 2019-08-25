/**
 * Java ByteArrayOutputStream Class
 */
package com.javaByteArrayOutputStreamClass;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java ByteArrayOutputStream Class
 * @implNote -> Java ByteArrayOutputStream class is used to write common data
 *           into multiple files.
 * @implNote -> In this stream, the data is written into a byte array which can
 *           be written to multiple streams later.
 * @implNote -> The ByteArrayOutputStream holds a copy of data and forwards it
 *           to multiple streams.
 * @implNote -> The buffer of ByteArrayOutputStream automatically grows
 *           according to data.
 * @implNote
 * @implNote Java ByteArrayOutputStream class declaration
 * @implNote public class ByteArrayOutputStream extends OutputStream
 * @implNote
 * @implNote Java ByteArrayOutputStream class constructors
 * @implNote 1. ByteArrayOutputStream() -> Creates a new byte array output
 *           stream with the initial capacity of 32 bytes, though its size
 *           increases if necessary.
 * @implNote 2. ByteArrayOutputStream(int size) -> Creates a new byte array
 *           output stream, with a buffer capacity of the specified size, in
 *           bytes.
 */
public class ByteArrayOutputStreamExample
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream obj = new FileOutputStream("E:\\Java File\\ByteArray1.txt");
			FileOutputStream obj2 = new FileOutputStream("E:\\Java File\\ByteArray2.txt");
			ByteArrayOutputStream o = new ByteArrayOutputStream();
			o.write(65);
			o.writeTo(obj);
			o.writeTo(obj2);
			o.flush();
			o.close();
			obj.close();
			obj2.close();
			System.out.println("Success...");
		}
		catch (IOException e)
		{
			System.out.println("Exception handled");
		}
	}
}
