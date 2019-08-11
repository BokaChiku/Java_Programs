/**
 * What is the class name of Java array?
 */
package com.javaSingleDimensionalArray;

/**
 * @author Kunal
 * @since 2019
 * @implNote What is the class name of Java array?
 * @implNote -> In java, an array is an object.
 * @implNote -> For array object, a proxy class is created whose name can be
 *           obtained by getClass().getName() method on the object.
 */
public class What_Is_The_Class_Name_Of_java_Array
{
	public static void main(String[] args)
	{
		int array[] = { 10, 20, 30 };
		// System.out.println(array.getClass().getName());
		Class c = array.getClass();
		String name = c.getName();
		System.out.println("Array Class Name is: " + name);
	}
}
