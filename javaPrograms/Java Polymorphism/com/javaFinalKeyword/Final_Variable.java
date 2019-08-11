/**
 * Example of Java Variable There is a final variable and we are going to change
 * it in main method and compiler gives error
 */
package com.javaFinalKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Final Keyword in Java:
 * @implNote The final keyword is used in programming to restrict the user.
 * @implNote Final can be used in:
 * @implNote 1. method
 * @implNote 2. variable
 * @implNote 3. class
 * @implNote Note: Final variable that have no value is called "Blank Final
 *           Variable" or "Uninitialized Variable".
 * @implNote It can be initialized in constructor only.
 * @implNote The blank final vaiable can be static also. It can be initialized
 *           in static block only.
 * @implNote Final Variable:
 * @implNote If you make any varaiable final then we can not change it's
 *           value.(It will be constant)
 */
public class Final_Variable
{
	final int speed = 100;

	void display()
	{
		System.out.println("Speed Limit is: " + speed);
	}

	public static void main(String[] args)
	{
		Final_Variable Obj = new Final_Variable();
		Obj.display();
		// Obj.speed = 200; Compiler Gives Error
	}
}
