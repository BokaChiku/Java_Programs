/**
 * Example of Abstract Class and Interface
 */
package com.javaAbstractInterface;

/**
 * @author Kunal
 * @since 2019
 * @implNote Difference between Abstract Class And Interface:
 * @implNote
 * @implNote Abstract Class:
 * @implNote 1. It can have abstract method or non abstract methods.
 * @implNote 2. The abstract keyword is used to declare abstract class.
 * @implNote 3. Abstract class doesn't support multiple inheritance.
 * @implNote 4. Abstract class can have final, static, non final, non static
 *           variables.
 * @implNote 5. Abstract class can provide implementation of interface.
 * @implNote 6. Abstract class can be extends to another class.
 * @implNote 7. Syntax:
 * @implNote abstract class Example
 * @implNote {
 * @implNote public abstract void run();
 * @implNote }
 * @implNote 8. Abstract class can have access modifers like private protected.
 * @implNote 9. It achives (0 to 100%) abstraction.
 * @implNote 10. We can implememnts multiple interface to abstract class.
 * @implNote
 * @implNote
 * @implNote Interface:
 * @implNote 1. It can have only abstract methods. Since java8, we can implement
 *           default and static method in interface.
 * @implNote 2. Interface supports multiple inheritance.
 * @implNote 3. Interface has only static and final variables.
 * @implNote 4. Interface can't provide implementation of abstract methods.
 * @implNote 5. The interface keyword is used for interface.
 * @implNote 6. Interface can extend another java interface.
 * @implNote 7. Interface can be implemts to class with "implements" keyword.
 * @implNote 8. Members of interface are public.
 * @implNote 9. Syntax:
 * @implNote interface Printable
 * @implNote {
 * @implNote public abstract void run();
 * @implNote }
 * @implNote 10. It achives 100 Abstraction
 */

interface A1
{
	static final int ID = 1;

	void a();

	void b();

	void c();

	void d();

	default void message()
	{
		System.out.println("This is default Method in the Interface !!");
	}

	static float salary(float salary)
	{
		return salary;
	}
}

abstract class Implementation implements A1
{
	public void a()
	{
		System.out.println("This is A !!");
	}

	public void c()
	{
		System.out.println("This is C !!");
	}
}

public class Abstract_Interface extends Implementation
{
	public void b()
	{
		System.out.println("This is B !!");
	}

	public void d()
	{
		System.out.println("This is D !!");
	}

	public static void main(String[] args)
	{
		Abstract_Interface obj = new Abstract_Interface();
		obj.a();
		obj.b();
		obj.c();
		obj.d();
		obj.message();
		float salary = A1.salary(2400.56f);
		System.out.println("Employee Salary is: " + salary);
		System.out.println("Employee id is: " + ID);
	}
}
