/**
 * Java FileInputStream Class
 */
package com.javaFileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java FileInputStream Class
 * @implNote -> Java FileInputStream class obtains input bytes from a file. It
 *           is used for reading byte-oriented data (streams of raw bytes) such
 *           as image data, audio, video etc.
 * @implNote -> You can also read character-stream data. But, for reading
 *           streams of characters, it is recommended to use FileReader class.
 * @implNote
 * @implNote Java FileInputStream class declaration
 * @implNote -> public class FileInputStream extends InputStream
 * @implNote
 * @implNote Java FileInputStream class methods
 * @implNote 1. int available() -> It is used to return the estimated number of
 *           bytes that can be read from the input stream.
 * @implNote 2. int read() -> It is used to read the byte of data from the input
 *           stream.
 * @implNote 3. int read(byte[] b) -> It is used to read up to b.length bytes of
 *           data from the input stream.
 * @implNote 4. void close() -> It is used to closes the stream.
 * @implNote 5. protected void finalize() -> It is used to ensure that the close
 *           method is call when there is no more reference to the file input
 *           stream.
 * @implNote 6. FileDescriptor getFD() -> It is used to return the
 *           FileDescriptor object.
 * @implNote
 * @implNote Note: Before running the code, a text file named as "testout.txt"
 *           is required to be created. In this file, we are having following
 *           content: Kunal Chavan
 */
public class ReadSingleCharacter
{
	public static void main(String[] args)
	{
		try
		{
			FileInputStream obj = new FileInputStream("E:\\Java File\\testout.txt");
			int i = obj.read();
			System.out.print((char) i);
			obj.close();
		}
		catch (IOException e)
		{
			System.out.println("Exception Handled");
		}

	}
}
