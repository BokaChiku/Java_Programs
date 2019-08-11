/**
 * Can we overload java main() method
 */
package com.javaMethodOverloading;

/**
 * @author Kunal
 * @since 2019
 * @implNote Yes, by method overloading. We can have any number of main methods
 *           in a class by method overloading.
 * @implNote JVM calls main() method which recieves string array as arguments
 *           only.
 */
public class Overload_Main_Method
{
	public static void main(String[] args)
	{
		System.out.println("Main with String[]");
		main("Kunal");
		main();
	}

	public static void main(String args)
	{
		System.out.println("Main without String");
	}

	private static void main()
	{
		System.out.println("Main without Argument");
	}
}
