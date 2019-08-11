/**
 * Restrictions for the static method
 */
package com.javaStaticKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Restrictions for the static method:
 * @implNote 1. static method can not use non static data member or call con -
 *           static method directly.
 * @implNote 2. this and super can not be used in static context.
 */
public class Restriction_For_Static_Keyword
{
	int a = 40; // non static

	public static void main(String[] args)
	{
		System.out.println(a); // Compile Time Error
	}
}
