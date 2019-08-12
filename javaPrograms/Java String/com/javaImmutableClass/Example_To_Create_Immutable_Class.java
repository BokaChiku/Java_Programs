/**
 * How to create Immutable class?
 */
package com.javaImmutableClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote There are many immutable classes like String, Boolean, Byte, Short,
 *           Integer, Long, Float, Double etc. In short, all the wrapper classes
 *           and String class is immutable. We can also create immutable class
 *           by creating final class that have final data members
 * @implNote
 * @implNote The below class is immutable because:
 * @implNote -> The instance variable of the class is final i.e. we cannot
 *           change the value of it after creating an object.
 * @implNote -> The class is final so we cannot create the subclass.
 * @implNote -> There is no setter methods i.e. we have no option to change the
 *           value of the instance variable.
 */
final public class Example_To_Create_Immutable_Class
{
	String name;
	final String adharCard;

	Example_To_Create_Immutable_Class(String name, String adharCard)
	{
		this.name = name;
		this.adharCard = adharCard;
	}

	void display()
	{
		System.out.println("Name Is: " + name);
		System.out.println("Adhar Card Is: " + adharCard);
	}

	public static void main(String[] args)
	{
		Example_To_Create_Immutable_Class obj = new Example_To_Create_Immutable_Class("Kunal", "1234ASFFRDSF");
		obj.display();
	}
}
