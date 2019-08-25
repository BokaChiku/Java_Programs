/**
 * Example of local inner class with local variable
 */
package com.javaLocalInnerClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Example of local inner class with local variable
 * @implNote Local inner class cannot access non-final local variable till JDK
 *           1.7. Since JDK 1.8, it is possible to access the non-final local
 *           variable in local inner class.
 */
public class LocalInner2
{
	private int number = 10;// Instance variable

	void display()
	{
		int number2 = 20; // Local variable
		class Inner2
		{
			void print()
			{
				System.out.println("Local Number: " + number2);
				System.out.println("instance variable: " + number);
			}
		}
		Inner2 obj = new Inner2();
		obj.print();
	}

	public static void main(String[] args)
	{
		LocalInner2 obj = new LocalInner2();
		obj.display();
	}
}
