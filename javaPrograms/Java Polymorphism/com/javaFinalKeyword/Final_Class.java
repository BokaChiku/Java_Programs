/**
 * Java Final Class
 */
package com.javaFinalKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Final Class
 */
final class Final
{
	void display()
	{
		System.out.println("Final Class !!");
	}
}

/*
 * public class FinalMethod extends Final // The type FinalMethod cannot
 * subclass the final class Final 
 * { 
 * 
 * }
 */

public class Final_Class
{
	void display()
	{
		System.out.println("Simple Class !!");
	}

	public static void main(String[] args)
	{
		Final Obj = new Final();
		Obj.display();
		Final_Class Obj2 = new Final_Class();
		Obj2.display();
	}
}