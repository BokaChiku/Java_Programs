/**
 * Constructor Overloading in Java
 */
package com.javaConstructor;

/**
 * @author Kunal
 * @since 2019
 * @implNote Constructor Overloading:
 * @implNote -> A constructor is just like method but without return type.
 * @implNote -> It can be overloaded like Java methods.
 * @implNote -> Constructor overloading in Java is a technique of having moer
 *           than one constructor with different parameter list.
 * @implNote -> They are arranged in a way that each constructor performs a
 *           different task.
 * @implNote -> The are differentiated by the compiler by the number of
 *           parameters in the list and their types.
 */
public class Constructor_Overload
{
	int studentID;
	String studentName;
	String studentAddress;

	Constructor_Overload(int id, String name)
	{
		studentID = id;
		studentName = name;
	}

	Constructor_Overload(int id, String name, String address)
	{
		studentID = id;
		studentName = name;
		studentAddress = address;
	}

	void displayConstructorOne()
	{
		System.out.println("Student ID is: " + studentID);
		System.out.println("Student Name is: " + studentName);
	}

	void displayConstructorTwo()
	{
		System.out.println("Student ID is: " + studentID);
		System.out.println("Student Name is: " + studentName);
		System.out.println("Student Address is: " + studentAddress);
	}

	public static void main(String[] args)
	{
		Constructor_Overload Obj = new Constructor_Overload(10, "Kunal");
		Obj.displayConstructorOne();
		Constructor_Overload Obj2 = new Constructor_Overload(10, "Kunal", "Pune");
		Obj2.displayConstructorTwo();
	}
}
