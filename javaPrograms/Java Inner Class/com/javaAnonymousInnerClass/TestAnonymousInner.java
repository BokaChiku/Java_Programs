/**
 * Java Anonymous inner class
 */
package com.javaAnonymousInnerClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Anonymous inner class
 * @implNote -> A class that have no name is known as anonymous inner class in
 *           java. It should be used if you have to override method of class or
 *           interface.
 * @implNote -> Java Anonymous inner class can be created by two ways:
 * @implNote 1.Class (may be abstract or concrete).
 * @implNote 2.Interface
 * @implNote
 * @implNote Internal working of given code
 * @implNote Person p=new Person(){
 * @implNote void eat(){System.out.println("nice fruits");}
 * @implNote };
 * @implNote 1. A class is created but its name is decided by the compiler which
 *           extends the Person class and provides the implementation of the
 *           eat() method.
 * @implNote 2. An object of Anonymous class is created that is referred by p
 *           reference variable of Person type.
 */

abstract class Person
{
	abstract void display();
}

public class TestAnonymousInner
{
	public static void main(String[] args)
	{
		Person p = new Person()
		{
			void display()
			{
				System.out.println("Displaying method..");
			}
		};
		p.display();
	}
}
