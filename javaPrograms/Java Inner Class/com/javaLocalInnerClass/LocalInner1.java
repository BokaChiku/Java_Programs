/**
 * 
 */
package com.javaLocalInnerClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Local inner class
 * @implNote -> A class i.e. created inside a method is called local inner class
 *           in java. If you want to invoke the methods of local inner class,
 *           you must instantiate this class inside the method.
 * @implNote
 * @implNote Rule: Local variable can't be private, public or protected.
 * @implNote 1) Local inner class cannot be invoked from outside the method.
 */
public class LocalInner1
{
	private int data = 30;// instance variable

	void display()
	{
		class Local
		{
			void msg()
			{
				System.out.println(data);
			}
		}
		Local obj = new Local();
		obj.msg();
	}

	public static void main(String args[])
	{
		LocalInner1 obj = new LocalInner1();
		obj.display();
	}
}
