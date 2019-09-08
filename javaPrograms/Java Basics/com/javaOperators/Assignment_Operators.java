/**
 * 
 */
package com.javaOperators;

/**
 * @author Kunal
 */
public class Assignment_Operators
{
	// Normal Assignment
	static int speed = 80; // speed variable gets the value 80
	static int distance = 20; // distance variable gets the value 20
	static int time = 10; // time variable gets the value 10
	static String name = "ToolsQA"; // name variable gets the value ToolsQA
	static boolean isGood = true; // isGood variable gets the value true

	public static void main(String[] args)
	{
		System.out.println("Value stored in the speed variable is : " + speed);
		System.out.println("Value stored in the distance variable is : " + distance);
		System.out.println("Value stored in the time variable is : " + time);
		System.out.println("Value stored in the name variable is : " + name);
		System.out.println("Value stored in the isGood variable is : " + isGood);

		speed = 150;
		distance = 60;
		time = 30;
		name = "Kunal Chavan";
		isGood = false;

		System.out.println("Value stored in the speed variable is : " + speed);
		System.out.println("Value stored in the distance variable is : " + distance);
		System.out.println("Value stored in the time variable is : " + time);
		System.out.println("Value stored in the name variable is : " + name);
		System.out.println("Value stored in the isGood variable is : " + isGood);

		// Multiple Assignments
		speed = distance = 0;
		System.out.println("Value stored in the speed variable is : " + speed);
		System.out.println("Value stored in the distance variable is : " + distance);

		// Illegal Assignments - Compile time errors
		// speed = "ToolsQA"; //String can not be assign to integer
		// name = 10; // Integer can not be assign to String
		// isGood = "ToolsQa" // String can not be assign to Boolean
	}
}
