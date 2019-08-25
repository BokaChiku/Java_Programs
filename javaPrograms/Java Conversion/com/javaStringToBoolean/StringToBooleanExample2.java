/**
 * Java Convert String to boolean
 */
package com.javaStringToBoolean;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert String to boolean
 * @implNote We can convert String to boolean in java using
 *           Boolean.parseBoolean(string) method.
 * @implNote To convert String into Boolean object, we can use
 *           Boolean.valueOf(string) method which returns instance of Boolean
 *           class.
 * @implNote To get boolean true, string must contain "true". Here, case is
 *           ignored. So, "true" or "TRUE" will return boolean true. Any other
 *           string value except "true" returns boolean false.
 * @implNote Java String to Boolean Example: Boolean.valueOf()
 */
public class StringToBooleanExample2
{
	public static void main(String[] args)
	{
		String s1 = "true";
		String s2 = "TRue";
		String s3 = "ok";
		boolean b1 = Boolean.valueOf(s1);
		boolean b2 = Boolean.valueOf(s2);
		boolean b3 = Boolean.valueOf(s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}
}
