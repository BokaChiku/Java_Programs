/**
 * 
 */
package com.javaConstructor;

/**
 * @author Kunal
 * @since 2019
 * @implNote Constructors in Java:
 * @implNote 1. Constructor is a block of code similar to the method.
 * @implNote 2. It is called when instance of the class is created.
 * @implNote 3. At the time of calling constructor, memory for the object is
 *           allocated in the memory.
 * @implNote 4. It is a special type of method which is used to initialize the
 *           object.
 * @implNote 5. Every time an object is created using the new keyword, at least
 *           one constructor is called.
 * @implNote 6. It calls a default constructor if there is no constructor
 *           available in the class. In such case, Java compiler provides a
 *           default constructor by default.
 * @implNote
 * @implNote Rules for creating Java constructor:
 * @implNote -> Constructor name must be same as class name
 * @implNote -> Constructor must have no return type.
 * @implNote -> Constructor can not be abstract, static, final and synchronized.
 * @implNote -> We can use access modifiers whiler declaring a constructor. It
 *           controls object creation.
 * @implNote
 * @implNote Java Parameterized Constructor:
 * @implNote 1. A constructor which has a specific number of parameters is
 *           called a parameterized constructor.
 * @implNote
 * @implNote Why use the parameterized constructor?
 * @implNote -> The parameterized constructor is used to provide different
 *           values to distinct objects.
 */
public class Parameterized_Constructor
{
	int studentId;
	String studentName;
	int studentAge;

	// Parameterized constructor
	Parameterized_Constructor(int id, String name, int age)
	{
		studentId = id;
		studentName = name;
		studentAge = age;
	}

	// Method to display values
	void display()
	{
		System.out.println("Student ID is: " + studentId);
		System.out.println("Student Name is: " + studentName);
		System.out.println("Student Age is: " + studentAge);

	}

	public static void main(String[] args)
	{
		// Creating objects and passing values
		Parameterized_Constructor Obj = new Parameterized_Constructor(10, "Kunal", 28);
		// Calling method to display values of object
		Obj.display();
	}
}
