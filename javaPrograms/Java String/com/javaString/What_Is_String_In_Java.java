/**
 * 
 */
package com.javaString;

/**
 * @author Kunal
 * @since 2019
 * @implNote What is String in Java?
 * @implNote 1. Generally String is a sequence of characters. But in java,
 *           String is an object that represent a sequence of charachter. The
 *           java.lang.String class is used to create a string object.
 * @implNote 2. String s1 = "Welcome";
 * @implNote 3. String s2 = "Welcome"; // It doesn't create a new instance
 * @implNote Each time you create a string literal, JVM check the "String
 *           constant pool" first. If the String already exist in the pool, a
 *           reference to the pooled instance is returned. If the String doesn't
 *           extis in the pool, a new String instance is created and placed in
 *           the pool.
 * @implNote String Constant Pool: String objects are stored in a special memory
 *           area known as the "String constant pool".
 * @implNote
 * @implNote Why Java uses the concept of String literal?
 * @implNote -> To make Java more memory efficient (because no new objects are
 *           created if it existes already in the string constatnt pool).
 * @implNote
 * @implNote By new keyword:
 * @implNote 1. String s = new String("Welcome"); // Create two objects and one
 *           reference variable
 * @implNote 2. In such case JVM create a new String Object in normal (non-pool)
 *           heap memory, and the literal "Welcome" will be placed in string
 *           constatnt pool. The variable s will refer to the object in a heap
 *           (non - pool).
 */
public class What_Is_String_In_Java
{
	String string = "CHAVAN";
	char[] ch = { 'S', 'A', 'N', 'J', 'A', 'Y' };

	public static void main(String[] args)
	{
		String string = "KUNAL";
		String ch = new String(new What_Is_String_In_Java().ch);
		System.out.println("My name is: " + string + " " + ch + " " + new What_Is_String_In_Java().string);
	}
}
