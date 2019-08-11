/**
 * Object Cloning in Java
 */
package com.javaObjectClone;

/**
 * @author Kunal
 * @since 2019
 * @implNote Object Cloning in Java
 * @implNote -> Object cloning is a way to create exact copy of an object.
 * @implNote -> The clone() method of Object class is used to clone an object.
 * @implNote -> The java.lang.Cloneable interface must be implemented by the
 *           class whose object clone we want to create. If we don't implement
 *           Cloneable Interface then, clone() method generate
 *           CloneNotSupportedException.
 * @implNote -> The clone() method is defined in the Object class.
 * @implNote -> Syntax:
 * @implNote -> protected Object clone() throws CloneNotSupportedException
 * @implNote -> Why use clone() method?
 * @implNote
 * @implNote 1. The clone() method saves the extra processing task for creating
 *           the extra copy of an object. It we perform it by using new keyword,
 *           it will take lot of processing time to be performed that is why we
 *           use object cloning.
 * @implNote
 * @implNote Advantage of Object Cloning:
 * @implNote -> You do't need to write lengthy and repetitive codes. Use
 *           abstract class with a 4- or 5- line along clone() method.
 * @implNote -> It is easiest and most efficient way for copying objects
 * @implNote -> Clone() is the fastest way to copy.
 * @implNote
 * @implNote Disadvantages of Object cloning:
 * @implNote -> Object.clone() is protected, so we have to to provide our own
 *           clone() and indirectly call Object.clone() from it.
 * @implNote -> Object.clone() doesn't invoke any constructor s we don't have
 *           control over object construction.
 * @implNote -> If you want to write a clone method in a child class then all
 *           superclasses should defined clone() method in them or inherit
 *           anther parent class. Otherwise super.clone() chain will fail.
 */
public class Object_Cloning_Method implements Cloneable
{
	int rollNumber;
	String name;

	Object_Cloning_Method(int rollnumber, String name)
	{
		this.rollNumber = rollnumber;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args) throws CloneNotSupportedException
	{
		{
			Object_Cloning_Method s = new Object_Cloning_Method(10, "Kunal");
			Object_Cloning_Method s2 = (Object_Cloning_Method) s.clone();

			System.out.println(s2.rollNumber);
			System.out.println(s2.name);
		}
	}
}
