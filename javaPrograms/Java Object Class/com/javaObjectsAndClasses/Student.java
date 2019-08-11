/**
 * In this example, we have created a Student class which has two data members
 * id and name. We are creating the object of the Student class by new keyword
 * and printing the object's value. Here, we are creating a main() method inside
 * the class. File: Student.java
 */
package com.javaObjectsAndClasses;

/**
 * @author Kunal
 * @since 2019
 * @implNote What is object in Java:
 * @implNote -> Object is an entity that has state and behavior is known as an
 *           object. E.g chair, bike, marker, pen etc..
 * @implNote -> Object can be physical aor logical.
 * @implNote
 * @implNote Object has three charachteristics:
 * @implNote 1. State: It represent the data (value) of an object.
 * @implNote 2. Behavior: Represent behavior (functionality) of an object such
 *           as deposit, withdraw etc.
 * @implNote 3. Identity: An object identity implemented via a unique ID. The
 *           value of that ID is not visible to the external user. However, it
 *           is used internally by the JVM to identify each object uniquely.
 * @implNote
 * @implNote For Example, Pen is an object. Its name is Reynolds, color is blue,
 *           known as its state. It is used to write, so writing is i ts
 *           behavior.
 * @implNote
 * @implNote An object is an insgtance of a class. A class is a template or
 *           blueprint from which object are created. So, an object is the
 *           instance(result) of a class.
 * @implNote
 * @implNote Object Definitions:
 * @implNote -> It is real-world entity.
 * @implNote -> It is runtime entity.
 * @implNote -> The object is an entity which has state and behavior.
 * @implNote -> The object is instance of a class.
 * @implNote
 * @implNote Different Ways to create an object in Java:
 * @implNote -> By new keyword
 * @implNote -> By newInstance() method
 * @implNote -> By clone() method
 * @implNote -> By deserialization
 * @implNote -> By factory method etc.
 * @implNote
 * @implNote What is Class in Java
 * @implNote -> A class is a group of objects which have common properties. It
 *           is template or blueprint from which objects are created. It is
 *           logical entity. It can't be physical.
 * @implNote A class in Java can contain:
 * @implNote -> Fields
 * @implNote -> Methods
 * @implNote -> Constructor
 * @implNote -> Blocks
 * @implNote -> Nested class and interface
 * @implNote
 * @implNote Syntax of class:
 * @implNote class <class_name>
 * @implNote {
 * @implNote field;
 * @implNote method;
 * @implNote }
 * @implNote
 * @implNote Instance variable in Java:
 * @implNote 1. A variable which is created oi]inside the class but outside the
 *           method is known as instance variable.
 * @implNote 2. Instance variable dosen't get memory at compile time.
 * @implNote 3. It gents memory at runtime when an object or instance is
 *           created.
 * @implNote
 * @implNote Methods in Java:
 * @implNote -> In Java, a method is like a function which is used to expose the
 *           behavior of an object.
 * @implNote Advantages of Method:
 * @implNote 1. Code Reusability
 * @implNote 2. Code Optimization
 * @implNote
 * @implNote new keyword in Java
 * @implNote -> new keyword is used to allocate memory at runtime. All objects
 *           get memory in Heap memory area.
 */

// Defining a Student Class
public class Student
{
	// defining fields
	int id; // instance variabe / field / data member
	String name;
	// Creating main method inside Student class

	public static void main(String args[])
	{
		// Creating an object or instance of class
		Student s1 = new Student();
		// Printing values or the object
		System.out.println(s1.id);// Accessing member through reference variable
		System.out.println(s1.name);

	}
}
