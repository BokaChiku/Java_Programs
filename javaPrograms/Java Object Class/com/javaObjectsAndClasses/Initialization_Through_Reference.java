/**
 * Object and Class Example: Initialization through references
 */
package com.javaObjectsAndClasses;

/**
 * @author Kunal
 * @since 2019
 * @implNote Initializaing an object means storing data into the object.
 */
class NewStudent
{
	int id = 10;
	String name = "Kunal";
}

public class Initialization_Through_Reference
{
	public static void main(String[] args)
	{
		NewStudent s1 = new NewStudent();
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println("Student id is: " + s1.id + " " + " And Student name is: " + s1.name);
	}
}
