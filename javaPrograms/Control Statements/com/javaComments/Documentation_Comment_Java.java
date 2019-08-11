/**
 * Java Documentataion Comment
 */
package com.javaComments;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Java Documentation Comment:
 * @implNote It is used to create documentation API. To create documentation
 *           API, you need to use javadoc tool.
 * @implNote Compile it by javac tool:
 * @implNote javac Documentation_Comment_Java.java
 * @implNote Create Documentation API by javadoc tool:
 * @implNote javadoc Documentation_Comment_Java.java
 */
public class Documentation_Comment_Java
{
	/**
	 * The add() method returs addition of given numbers.
	 */
	public static int add(int a, int b)
	{
		return a + b;
	}

	/**
	 * The sub() method returs subtraction of given numbers.
	 */

	public static int sub(int a, int b)
	{
		return a - b;
	}

	public static void main(String[] args)
	{
		int Addition = Documentation_Comment_Java.add(10, 20);
		System.out.println("Addition is: " + Addition);
		int subtraction = Documentation_Comment_Java.sub(10, 10);
		System.out.println("Subtraction is: " + subtraction);
	}
}
