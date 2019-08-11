/**
 * Java Infinitive While Loop
 */
package com.javaWhileLoop;

/**
 * @author Kunal24
 * @since 2019
 * @implNote If you pass true in while loop, it will be infinitive while loop.
 * @implNote Syntax:
 * @implNote while(true)
 * @implNote {
 * @implNote // code to be executed
 * @implNote }
 * @implNote To exit from infinitive loop press ctrl+c.
 */
public class Infinitive_While_Loop
{
	boolean flag = true;

	public static void main(String[] args)
	{
		Infinitive_While_Loop Obj = new Infinitive_While_Loop();
		while (Obj.flag)
		{
			System.out.println("Hello Friends!!");
		}
	}
}
