/**
 * Java toString() method
 */
package com.javaToStringMethod;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java toString() method
 * @implNote -> To represent object as string, toString() method comes into
 *           existence.
 * @implNote -> The toString() method returns the string representation of the
 *           object.
 * @implNote -> If you print any object, java compiler internally invokes the
 *           toString() method on the object.
 * @implNote -> So overriding the toString() method, returns the desired output,
 *           it can be the state of an object etc. depends on your
 *           implementation
 * @implNote
 * @implNote Advantage of Java toString() method:
 * @implNote 1. By overriding the toString() method of the Object class, we can
 *           return values of the object, so we don't need to write much code.
 */
public class Problem_Of_To_String_Method
{
	int rollNumber;
	String name;
	String city;

	Problem_Of_To_String_Method(int rollNumber, String name, String city)
	{
		this.rollNumber = rollNumber;
		this.name = name;
		this.city = city;
	}

	public static void main(String[] args)
	{
		Problem_Of_To_String_Method obj = new Problem_Of_To_String_Method(10, "Kunal", "Pune");
		System.out.println(obj); // compiler use obj.toString() method of Object class.
		Problem_Of_To_String_Method obj2 = new Problem_Of_To_String_Method(15, "Vishal", "Mumbai");
		System.out.println(obj2.toString()); // compiler don't use obj.toString() method of Object class.
	}
}
