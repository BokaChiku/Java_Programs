/**
 * String Concatenation in Java
 */
package com.javaStringConcatenationInJava;

/**
 * @author Kunal
 * @since 2019
 * @implNote String Conacatenation in Java
 * @implNote In java, String concatenation forms a new string that is the
 *           combination of multiple strings. There are two ways to concat
 *           string in java:
 * @implNote 1. By + (string concatenation) operator
 * @implNote 2. By concat() method
 * @implNote
 * @implNote 1) String Concatenation by + (string concatenation) operator:
 * @implNote Java strings concatenation operator (+) is used to add strings.
 * @implNote String name = (new
 *           StringBuilder()).append("Sanjay").append("Chavan").toString();
 * @implNote
 * @implNote In java, String concatenation is implemented through the
 *           StringBuilder (or StringBuffer) class and its append method. String
 *           concatenation operator append second string to first one at the end
 *           of first string. The string concatenation operator can concat not
 *           only string but primitive values also.
 */
public class String_Concatenation_by_Plus_Operator_Second_Example
{
	public static void main(String[] args)
	{
		System.out.println("My Full Name Is: " + (1990 + 1 + " Kunal" + " Chavan " + 24));
	}
}
/*
 * Note: After a string literal, all the + will be trated as string
 * concatenation operator.
 */
