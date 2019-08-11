/**
 * 
 */
package com.javaString;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String Example
 */
public class String_Example
{
	public static void main(String[] args)
	{
		String s1 = "JAVA";
		char[] ch = { 'S', 'T', 'R', 'I', 'N', 'G' };
		String s2 = new String(ch);
		System.out.println("First String Is: " + s1);
		System.out.println("Second String Is: " + s2);
		String s3 = new String("Kunal");
		System.out.println("Third String Is: " + s3);
	}
}
