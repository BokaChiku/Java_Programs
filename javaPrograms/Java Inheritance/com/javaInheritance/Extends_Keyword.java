/**
 * extends keyword demo
 */
package com.javaInheritance;

/**
 * @author Kunal
 * @since 2019
 * @implNote Iheritance in Java:
 * @implNote -> Inheritance in Java is a mechanism in which one object aquires
 *           all properties and behaviors of a parent object. I is important
 *           part of OOPs (Object Oriented Programming).
 * @implNote -> The idea behind inheritance in Java is that you can create new
 *           classes that are built upon existing classes. When you inherit from
 *           an existing class, yo can reuse methods and fields of parent class.
 *           You can add new methods and fields in your current class also.
 * @implNote -> Inheritance represent the IS - A relationship which is also
 *           known as a parent-child relationship.
 * @implNote
 * @implNote Why use iheritance in java:
 * @implNote 1. For Method Overriding ( so runtime polymorphism can achieved.)
 * @implNote 2.For code reusablity.
 * @implNote
 * @implNote terms used in Inheritance:
 * @implNote 1. Class: A class is a group of objects which have common
 *           properties.
 * @implNote -> It is a template or blueprint from which objects are created.
 * @implNote
 * @implNote 2. Sub Class/Child Class: Subclass is a class which inherits the
 *           other class.
 * @implNote -> It is also called a derived class, extended class, or child
 *           class.
 * @implNote
 * @implNote 3. Super Class/Parent Class: Superclasss is the class from where a
 *           subclass inherits the features.
 * @implNote -> It is also called a base class or a parrent class.
 * @implNote
 * @implNote 4. Reusability: We can reuse the fields and methods of existing
 *           class when you create a new class.
 * @implNote -> You can use the same fields and methods already defined in the
 *           previous class.
 * @implNote
 * @implNote Syntax of Java Inheritance:
 * @implNote class Subclass-name extends Superclass-name
 * @implNote {
 * @implNote // methods and fields
 * @implNote }
 * @implNote
 * @implNote extends keyword:
 * @implNote -> extends keyword indicates that you are making a new class that
 *           derives from an existing class.
 * @implNote -> The meaning of "extends is to increase the functionality.
 * @implNote -> In Java termionlogy, a class which is inherited is called a
 *           parent or superclass, and the new class is called child or
 *           subclass.
 */
class Employee
{
	float salary = 2530.25F;

}

public class Extends_Keyword extends Employee
{
	int bonus = 20000;

	public static void main(String[] args)
	{
		Extends_Keyword Obj = new Extends_Keyword();
		System.out.println("Bonus is: " + Obj.bonus);
		System.out.println("Salary is: " + Obj.salary);
	}
}

/*
 * In this example, Extends_Keyword Object can access the field of own class as
 * well as of Employee class.
 */
