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
 * @implNote 7. Types of constructor:
 * @implNote -> Non argument constructor
 * @implNote -> Parameterized constructor
 * @implNote
 * @implNote Note:
 * @implNote 1. If class don't have constructor then java compiler creates a
 *           default constructor for the class.
 * @implNote 2. It called constructor because it construct the value at time of
 *           object creation.
 * @implNote
 * @implNote Rules for creating Java constructor:
 * @implNote -> Constructor name must be same as class name
 * @implNote -> Constructor must have no return type.
 * @implNote -> Constructor can not be abstract, static, final and synchronized.
 * @implNote -> We can use access modifiers whiler declaring a constructor. It
 *           controls object creation.
 * @implNote
 * @implNote Java Default Constructor:
 * @implNote -> A constructor is called "Default Constructor" when it doesn't
 *           have any parameter.
 * @implNote Syntax:
 * @implNote <class_name>()
 * @implNote {
 * @implNote }
 * @implNote
 * @implNote What is the purpose of default constructor?
 * @implNote -> The defalt constructor is used to provide the default values to
 *           the object like 0, null etc. Depending on type.
 */
public class Default_Constructor
{
	// Creating a default constructor
	Default_Constructor()
	{
		System.out.println("Constructor Created !!");
	}

	// main method
	public static void main(String[] args)
	{
		Default_Constructor Obj = new Default_Constructor();
	}
}
