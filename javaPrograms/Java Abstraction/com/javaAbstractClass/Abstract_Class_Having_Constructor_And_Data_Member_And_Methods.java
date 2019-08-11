/**
 * Abstract Class Having Constructor And Data Member And Methods
 */
package com.javaAbstractClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote An abstract class can have a data member, constructor and method
 *           and even main method.
 */

abstract class Motor
{
	int speed;

	Motor(int speed)
	{
		this.speed = speed;
		System.out.println("Abstract Class Constrcutor !!" + speed);
	}

	abstract void run();

	void gear()
	{
		System.out.println("Gear Function of Motor !!");
	}
}

public class Abstract_Class_Having_Constructor_And_Data_Member_And_Methods extends Motor
{
	void run()
	{
		System.out.println("This is run Method !!");
	}

	Abstract_Class_Having_Constructor_And_Data_Member_And_Methods(int speed)
	{
		super(speed);
	}

	public static void main(String[] args)
	{
		new Abstract_Class_Having_Constructor_And_Data_Member_And_Methods(250);
		new Abstract_Class_Having_Constructor_And_Data_Member_And_Methods(250).gear();
		new Abstract_Class_Having_Constructor_And_Data_Member_And_Methods(250).run();
	}
}
