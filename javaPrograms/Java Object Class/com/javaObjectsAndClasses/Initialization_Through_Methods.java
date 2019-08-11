/**
 * Object and Class Example: Initialization through methods
 */
package com.javaObjectsAndClasses;

/**
 * @author Kunal
 * @since 2019
 * @implNote Initializaing an object through methods.
 * @implNote In this example, we are creating two objects of StudentNew class and
 *           initializing the value to these objects by invoking insertRecord()
 *           method.
 * @implNote We are displaying state (data) of the objects by invoking
 *           displayInformation() method.
 */

class StudentNew
{
	int rollNo;
	String name;

	void insertRecord(int number, String nameStudent)
	{
		rollNo = number;
		name = nameStudent;
	}

	void displayInformation()
	{
		System.out.println(rollNo + " " + name);
	}
}

public class Initialization_Through_Methods
{
	public static void main(String[] args)
	{
		StudentNew s1 = new StudentNew();
		StudentNew s2 = new StudentNew();
		s1.insertRecord(10, "Kunal");
		s2.insertRecord(101, "KC");
		s1.displayInformation();
		s2.displayInformation();
	}
}

/*
 * Objects gets memory in heap memory area. The reference variable refers to the
 * onject allocated in the heap memory area. Here, s1 and s2 both are reference
 * variable that refer to the objects allocated in memory.
 */
