/**
 * super example: real use
 */
package com.javaSuperKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Real_Use_Of_Super class inherits Person class so all properties of
 *           person will be inherited to Real_Use_Of_Super by default. To
 *           initialize all the property, we are using parent class constructor
 *           from child class. In such a way, we are reusing parent class
 *           constructor.
 */

class Person
{
	int id;
	String name;

	Person(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
}

public class Real_Use_Of_Super extends Person
{
	float salary;

	Real_Use_Of_Super(int id, String name, float salary)
	{
		super(id, name);
		this.salary = salary;
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Salary: " + salary);
	}

	public static void main(String[] args)
	{
		new Real_Use_Of_Super(10, "Kunal", 24.24F);
	}
}
