/**
 * 
 */
package com.javaAPIDoc;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Creating API Document | Javadoc tool
 * @implNote 1. We can create document api in java b the help of javadoc tool.
 * @implNote 2. In the java file, implements documentation comment to post
 *           information for class, methods, constructor, fields etc..
 * @implNote 3. To create the document API, you need to use javadoc tool
 *           followed by java file name.
 * @implNote 4. On command prompt, you need to write:
 * @implNote javadoc Java_Doc_Example.java
 */

/**
 * This class is user-defined class that contains one method cube.
 */
public class Java_Doc_Example
{
	int number;

	/**
	 * This cube method doesn't return anything and it is used to print cube of the
	 * number.
	 */
	void cube(int number)
	{
		System.out.println("Cube is: " + (number * number * number));
	}

	public static void main(String[] args)
	{
		Java_Doc_Example obj = new Java_Doc_Example();
		System.out.println("Please Enter Number: ");
		Scanner scan = new Scanner(System.in);
		obj.number = scan.nextInt();
		obj.cube(obj.number);
	}
}
