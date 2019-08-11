/**
 * Is final method inherited?
 */
package com.javaFinalKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Is final method inherited?
 */

class Bread
{
	final void run()
	{
		System.out.println("Final Method !!");
	}
}

public class Is_Final_Method_Inheritated extends Bread
{
	public static void main(String[] args)
	{
		new Is_Final_Method_Inheritated().run();
	}
}
