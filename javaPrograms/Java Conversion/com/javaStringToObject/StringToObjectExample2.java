/**
 * Java String to Class object Example
 */
package com.javaStringToObject;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java String to Class object Example
 * @implNote -> Simple code to convert String to Class object in java using
 *           Class.forName() method. The Class.forName() method returns the
 *           instance of Class class which can be used to get the metadata of
 *           any class.
 */
public class StringToObjectExample2
{
	public static void main(String[] args)
	{
		try
		{
			Class c = Class.forName("java.lang.String");
			System.out.println("Child class: " + c.getName());
			System.out.println("Parent clas: " + c.getSuperclass().getName());
			Class c1 = Class.forName("Kunal");
			System.out.println("Child class: " + c1.getName());
		}
		catch (ClassNotFoundException e)
		{
			System.out.println("Class not found");
		}
	}
}
