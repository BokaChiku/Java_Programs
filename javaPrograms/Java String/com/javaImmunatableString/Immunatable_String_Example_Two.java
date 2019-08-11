/**
 * Immunatable String in Java
 */
package com.javaImmunatableString;

/**
 * @author Kunal
 * @since 2019
 * @implNote Immunatable String in Java
 * @implNote 1. In java, String objects are immunatable.
 * @implNote 2. Immunatable means they can't be modified or unchanged.
 * @implNote 3. We can explicitely assign String variable to the the modified or
 *           changed.
 * @implNote Why String objects are immunatable in Java?
 * @implNote -> Because java use concept of String literal.
 * @implNote -> Suppose there are 5 refrence variables in java all refer to one
 *           object "Pradnya". If one reference variable change it will affect
 *           the all reference variable. That is why java's String Object is
 *           immunatable.
 */
public class Immunatable_String_Example_Two
{
	public static void main(String[] args)
	{
		String s = "Pradnya";
		s = s.concat(" Pacharne");
		System.out.println("Name is: " + s);
	}
}
