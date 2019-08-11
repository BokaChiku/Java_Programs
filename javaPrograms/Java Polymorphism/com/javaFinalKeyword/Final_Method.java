/**
 * Java Final Method
 */
package com.javaFinalKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Final Method
 */

class FMethod
{
	final void run()
	{
		System.out.println("This is Final Method !!");
	}
}

public class Final_Method extends FMethod
{
	/*
	 * void run() // Cannot override the final method from FMethod
	 * { 
	 * 
	 * } 
	 */
	
	void runSubClass() 
	{
		System.out.println("This is Not Final Method !!");
	}
	
	public static void main(String[] args)
	{
		Final_Method Obj = new Final_Method();
		Obj.run();
		Obj.runSubClass();
	}
}
