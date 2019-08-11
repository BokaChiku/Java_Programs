/**
 * Super can be used to invoke parent class method
 */
package com.javaSuperKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Super can be used to invoke parent class method:
 * @implNote -> The super keyword can be used to invoke parent class method.
 * @implNote -> It should be used when subclass have same method name.
 * @implNote -> It is used in method overriden.
 * @implNote
 * @implNote In the example both classes have same method if we call subclass
 *           method then it will call ony it's method because priority is given
 *           to local.
 * @implNote To call parent class method, we need to use super keyword.
 */

class ParentClass
{
	void run()
	{
		System.out.println("This is parent method !!");
	}
}

public class Super_Class_Invoked_Parent_Class_Method extends ParentClass
{
	void run()
	{
		System.out.println("This is child method !!");
	}

	void display()
	{
		run();
		super.run();
	}

	public static void main(String[] args)
	{
		Super_Class_Invoked_Parent_Class_Method Obj = new Super_Class_Invoked_Parent_Class_Method();
		Obj.display();
	}
}
