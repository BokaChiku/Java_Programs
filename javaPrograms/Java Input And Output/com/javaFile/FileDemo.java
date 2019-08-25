/**
 * Java File Class
 */
package com.javaFile;

import java.io.File;
import java.io.IOException;

/**
 * @author Kunal
 * @since 2019
 * @implNote The File class is an abstract representation of file and directory
 *           pathname. A pathname can be either absolute or relative. The File
 *           class have several methods for working with directories and files
 *           such as creating new directories or files, deleting and renaming
 *           directories or files, listing the contents of a directory etc.
 */
public class FileDemo
{
	public static void main(String[] args)
	{
		try
		{
			File file = new File("E:\\Java File\\Filedemo.txt");
			if (file.createNewFile())
			{
				System.out.println("New File is created!");
			}
			else
			{
				System.out.println("File already exists.");
			}
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
