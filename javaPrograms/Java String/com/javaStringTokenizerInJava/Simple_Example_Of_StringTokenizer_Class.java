/**
 * StringTokenizer in Java
 */
package com.javaStringTokenizerInJava;

import java.util.StringTokenizer;

/**
 * @author Kunal
 * @since 2019
 * @implNote StringTokenizer in Java
 * @implNote 1. The java.util.StringTokenizer class allows you to break a string
 *           into tokens.
 * @implNote 2. It is simple way to break string.
 * @implNote 3. It doesn't provide the facility to differentiate numbers, quoted
 *           strings, identifiers etc. like StreamTokenizer class.
 * @implNote Constructors of StringTokenizer class:
 * @implNote -> StringTokenizer(String str): creates StringTokenizer with
 *           specified string.
 * @implNote -> StringTokenizer(String str, String delim): creates
 *           StringTokenizer with specified string and delimeter.
 * @implNote -> StringTokenizer(String str, String delim, boolean returnValue):
 *           creates StringTokenizer with specified string, delimeter and
 *           returnValue. If return value is true, delimiter characters are
 *           considered to be tokens. If it is false, delimiter characters serve
 *           to separate tokens.
 * @implNote
 * @implNote Methods of StringTokenizer class:
 * @implNote 1. boolean hasMoreTokens(): checks if there is more tokens
 *           available.
 * @implNote 2. String nextToken(): returns the next token from the
 *           StringTokenizer object.
 * @implNote 3. String nextToken(String delim): returns the next token based on
 *           the delimeter.
 * @implNote 4. boolean hasMoreElements(): same as hasMoreTokens() method.
 * @implNote 5. Object nextElement(): same as nextToken() but its return type is
 *           Object.
 * @implNote 6. int countTokens(): returns the total number of tokens.
 */
public class Simple_Example_Of_StringTokenizer_Class
{
	public static void main(String[] args)
	{
		StringTokenizer name = new StringTokenizer("Kunal Chavan");
		while (name.hasMoreTokens())
		{
			System.out.println(name.nextToken());
		}
	}
}
