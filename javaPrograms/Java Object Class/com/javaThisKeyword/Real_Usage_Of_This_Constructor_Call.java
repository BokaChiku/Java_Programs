/**
 * Real usage of this() constructor call
 */
package com.javaThisKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Real usage of this() constructor call:
 * @implNote -> this() constructor call should be used to reuse the constructor
 *           from the constructor.
 * @implNote -> It maintains the chain between the constructors.
 * @implNote -> Call to this() must be first statement in constructor.
 */
public class Real_Usage_Of_This_Constructor_Call
{
	int rollNo;
	String name;
	float fee;

	Real_Usage_Of_This_Constructor_Call(int rollNo, String name)
	{
		this.rollNo = rollNo;
		this.name = name;
	}

	Real_Usage_Of_This_Constructor_Call(int rollNo, String name, float fee)
	{
		this(rollNo, name); // Reusing constructor
		this.fee = fee;
	}

	void display()
	{
		System.out.println("Given roll number is: " + rollNo);
		System.out.println("Given name is: " + name);
		System.out.println("Given fee is: " + fee);

	}

	public static void main(String[] args)
	{
		Real_Usage_Of_This_Constructor_Call Obj = new Real_Usage_Of_This_Constructor_Call(10, "Kunal", 23.36f);
		Obj.display();

	}
}
