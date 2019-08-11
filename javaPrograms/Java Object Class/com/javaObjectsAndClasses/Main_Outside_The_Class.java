/**
 * Object and Class Example: main method outside the class
 */
package com.javaObjectsAndClasses;

/**
 * @author Kunal
 * @since 2019
 * @implNote In real time development, we create classes and use it from another
 *           class. It is a better approach from previous one.
 * @implNote We can have multiple classes in different Java files or Single Java
 *           file. If you defined multiple classes in a single Java source file,
 *           it is a good idea to save the file name with the class name which
 *           has main() method.
 */

// Another Class
// Creating StudentObject class.
class StudentObject
{
	int id;
	String name;
}

// Create another class which contains the main method
public class Main_Outside_The_Class
{
	public static void main(String[] args)
	{
		StudentObject s1 = new StudentObject();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}
}
