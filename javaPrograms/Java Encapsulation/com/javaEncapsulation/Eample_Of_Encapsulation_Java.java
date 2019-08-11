/**
 * Example of Encapsulation
 */
package com.javaEncapsulation;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Encapsulation in java:
 * @implNote -> Encapsulation in java is aprocess of wrapping code and data
 *           together into single unit, for example, a capsule which is mixed of
 *           several medicines.
 * @implNote -> We can create a fully encapsulated class in java by making all
 *           the data members of the class private. And We use setter and getter
 *           method to set and get the data in it.
 * @implNote -> The Java bean class is the example of fully encapsulated class.
 * @implNote
 * @implNote Advantage of Encapsulation in java:
 * @implNote -> By providing only setter or getter method, we can make class
 *           read-only or write-only.
 * @implNote -> It provides you the control over the data.
 * @implNote -> It is to achieve data hiding in Java because other class will
 *           not able to access the data through the private data member.
 * @implNote -> Encapsulated class easy to test. It is easy to test unit
 *           testing.
 */

class Student
{
	// private data member
	private String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

public class Eample_Of_Encapsulation_Java
{

	public static void main(String[] args)
	{
		// Creating instance of encapsulated class
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Name..");
		String name = scan.nextLine();
		scan.close();
		Student s = new Student();
		// Set the value in setname method
		s.setName(name);
		s.getName();
		System.out.println("Student Name is: " + name);
	}
}
