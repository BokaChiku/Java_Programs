/**
 * Object and Class Example: Initialization through references
 */
package com.javaObjectsAndClasses;

/**
 * @author Kunal
 * @since 2019
 * @implNote Initializaing an object means storing data into the object.
 * @implNote We can also create multiple objects and store information in it
 *           through references variable.
 */
class NewStudent2
{
	int id;
	String name;
}

public class Multiple_Objects
{
	public static void main(String[] args)
	{
		// Creating Objects
		NewStudent2 s1 = new NewStudent2();
		NewStudent2 s2 = new NewStudent2();
		// Initializing objects
		s1.id = 10;
		s1.name = "Kunal";
		s2.id = 24;
		s2.name = "Filta";
		// Printing data
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);

	}
}
