/**
 * Java Member Inner Class
 */
package com.javaMemberInnerClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Member Inner Class
 * @implNote A non-static class that is created inside a class but outside a
 *           method is called member inner class.
 * @implNote
 * @implNote Syntax:
 * @implNote class Outer
 * @implNote {
 * @implNote //code
 * @implNote class Inner
 * @implNote {
 * @implNote //code
 * @implNote }
 * @implNote }
 */
public class Java_Member_Inner_Class
{
	private int data = 50;

	Java_Member_Inner_Class()
	{
		System.out.println("Parent Class !!");
	}

	class Inner
	{
		Inner()
		{
			super();
			System.out.println("Child Class !!");
		}

		void message()
		{
			System.out.println("Data Number: " + data);

		}
	}

	public static void main(String[] args)
	{
		Java_Member_Inner_Class obj = new Java_Member_Inner_Class();
		Java_Member_Inner_Class.Inner in = obj.new Inner();
		in.message();
	}
}
