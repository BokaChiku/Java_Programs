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
public class Example_Of_Java_ToString_Method
{
	int rollNumbner;
	String name;
	String city;

	Example_Of_Java_ToString_Method(int rollNumbner, String name, String city)
	{
		this.rollNumbner = rollNumbner;
		this.name = name;
		this.city = city;
	}

	public String toString()
	{
		return rollNumbner + " " + name + " " + city;
	}

	public static void main(String[] args)
	{
		Example_Of_Java_ToString_Method obj = new Example_Of_Java_ToString_Method(10, "Kunal", "Pune");
		System.out.println(obj.toString()); // Compiler calls toString() overriden method
		Example_Of_Java_ToString_Method obj2 = new Example_Of_Java_ToString_Method(20, "Omkar", "Mumbai");
		System.out.println(obj2.toString()); // Compiler calls toString() overriden method

	}

}
