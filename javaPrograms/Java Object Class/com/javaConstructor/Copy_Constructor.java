/**
 * Java Copy Constructor
 */
package com.javaConstructor;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Copy Constructor:
 * @implNote -> There is no copy constructor in Java.
 * @implNote -> There are many ways to copy the values of one object into
 *           another in Java.
 * @implNote 1. By constructor
 * @implNote 2. By assigning the values of one object into another
 * @implNote 3. By clone() method of Object class
 */
public class Copy_Constructor
{
	int studentID;
	String studentName;

	Copy_Constructor(int id, String name)
	{
		studentID = id;
		studentName = name;
	}

	Copy_Constructor(Copy_Constructor copy)
	{
		studentID = copy.studentID;
		studentName = copy.studentName;
	}

	void display()
	{
		System.out.println(studentID + " " + studentName);
	}

	public static void main(String[] args)
	{
		Copy_Constructor Obj = new Copy_Constructor(10, "Kunal");
		Copy_Constructor Obj2 = new Copy_Constructor(Obj);
		Obj.display();
		Obj2.display();
	}
}
