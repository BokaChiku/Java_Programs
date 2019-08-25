/**
 * Java FileOutputStream Class
 */
package com.javaFileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java FileOutputStream Class
 * @implNote
 * @implNote -> If you have to write primitive values into a file, use
 *           FileOutputStream class.
 * @implNote -> You can write byte-oriented as well as character-oriented data
 *           through FileOutputStream class.
 * @implNote -> But, for character-oriented data, it is preferred to use
 *           FileWriter than FileOutputStream.
 * @implNote
 * @implNote FileOutputStream class declaration
 * @implNote -> public class FileOutputStream extends OutputStream
 * @implNote
 * @implNote FileOutputStream class methods
 * @implNote 1) protected void finalize() -> It is used to clean up the
 *           connection with the file output stream.
 * @implNote 2) void write(byte[] ary) -> It is used to write ary.length bytes
 *           from the byte array to the file output stream.
 * @implNote 3) void write(byte[] ary, int off, int len) -> It is used to write
 *           len bytes from the byte array starting at offset off to the file
 *           output stream.
 * @implNote 4) void write(int b) -> It is used to write the specified byte to
 *           the file output stream.
 * @implNote 5) void close() -> It is used to closes the file output stream.
 * @implNote
 * @implNote -> It creates new text file in: E:\\Java File\\testout.txt
 * @implNote It write A in the file.
 */
public class FileOutputStreamExampleWriteByte
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream obj = new FileOutputStream("E:\\Java File\\testout.txt");
			obj.write(65);
			obj.close();
			System.out.println("Success");
		}
		catch (IOException e)
		{
			System.out.println("Exception Handled");
		}
	}
}
