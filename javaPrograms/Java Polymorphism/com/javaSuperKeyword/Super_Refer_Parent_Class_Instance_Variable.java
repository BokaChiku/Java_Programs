/**
 * Super Keyword in Java
 */
package com.javaSuperKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Super Keyword in Java:
 * @implNote -> The super keyword in Java is a reference variable which is used
 *           to refer immediate parent class object.
 * @implNote -> Whenever you create the instance of subclass, an instance of
 *           parent class is created implicitly which is referred by super
 *           reference variable.
 * @implNote
 * @implNote Usage of Java super Keyword:
 * @implNote 1. super can be used to refer immediate parent class instance
 *           variable.
 * @implNote 2. super can be used to invoke immediate parent class method.
 * @implNote 3. super() can be used to invoke immediate parent class
 *           constructor.
 * @implNote
 * @implNote In the example, Both classes have a common property color. If we
 *           print color property, it will print the color of current class by
 *           default. To access parent property, we need to use the super
 *           keyword.
 */
class Animal
{
	String color = "White";
}

public class Super_Refer_Parent_Class_Instance_Variable extends Animal
{
	String color = "Black";

	void display(Super_Refer_Parent_Class_Instance_Variable Object)
	{
		System.out.println("Animal Color of SubClass: " + Object.color);
		System.out.println("Animal Color of ParentClass: " + super.color);
	}

	public static void main(String[] args)
	{
		Super_Refer_Parent_Class_Instance_Variable Obj = new Super_Refer_Parent_Class_Instance_Variable();
		Obj.display(Obj);
		/*
		 * System.out.println("Animal Color of SubClass: " + super.color); We can not
		 * use super in static method
		 */

	}
}
