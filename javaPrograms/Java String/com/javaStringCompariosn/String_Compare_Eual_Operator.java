/**
 * Java String Compare
 */
package com.javaStringCompariosn;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String Compare:
 * @implNote 1. By equals() method
 * @implNote 2. By compareTo() method
 * @implNote 3. By == operator.
 * @implNote -> String compare by equals() method
 * @implNote String compare by == operator
 * @implNote The == operator compares refrences not values.
 */
public class String_Compare_Eual_Operator
{
	public static void main(String[] args)
	{
		String s1 = "Kunal";
		String s2 = "Kunal";
		System.out.println("The == Operator: " + (s1 == s2)); // true (because both refer to same instance)
		String s3 = new String("Kunal");
		System.out.println("The == Operator: " + (s1 == s3)); // false (because s3 refers to instance created in pool

	}
}
