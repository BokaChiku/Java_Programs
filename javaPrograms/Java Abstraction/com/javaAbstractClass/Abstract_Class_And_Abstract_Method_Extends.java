/**
 * Rule: If you are extending abstract class with abstract method, then you must
 * implement that abstract method or create that class abstract.
 */
package com.javaAbstractClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote If you are extending abstract class with abstract method, then you
 *           must implement that abstract method or create that class abstract.
 */

abstract class AbstractMethod
{
	abstract void run();
}

abstract class Abstract extends AbstractMethod
{
	abstract void run2();
}

public class Abstract_Class_And_Abstract_Method_Extends extends Abstract
{
	void run()
	{
		System.out.println("AbstractMethod Class Method !!");
	}

	void run2()
	{
		System.out.println("Abstract Class Method !!");
	}

	public static void main(String[] args)
	{
		AbstractMethod Obj = new Abstract_Class_And_Abstract_Method_Extends();
		Obj.run();
		Abstract Obj2 = new Abstract_Class_And_Abstract_Method_Extends();
		Obj2.run2();
	}
}
