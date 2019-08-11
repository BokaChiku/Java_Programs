/**
 * 
 */
package com.javaInterface;

/**
 * @author Kunal
 * @since 2019
 * @implNote Multiple Inheritance in Java By Interface:
 * @implNote -> It class implements multiple Interface or interface extends
 *           multiple interface then it is called Multiple Inheritance.
 * @implNote
 * @implNote Multiple Inheritance is not supported in java, but it is supported
 *           by an interface, why?
 * @implNote -> Multiple Inheritance is not supported in case of class because
 *           of Ambiguity.
 * @implNote -> It is supported by interface because there is no Ambiguity.
 * @implNote -> It is because its implementation is provided by the class of
 *           implemenation class.
 */

interface Printable2
{
	void print();
}

interface Showable
{
	void show();
}

public class Multiple_Inheritance_By_Interface implements Printable2, Showable
{
	public void print()
	{
		System.out.println("Printing....");
	}

	public void show()
	{
		System.out.println("Showing....");

	}

	public static void main(String[] args)
	{
		Multiple_Inheritance_By_Interface obj = new Multiple_Inheritance_By_Interface();
		obj.print();
		obj.show();
	}

}
