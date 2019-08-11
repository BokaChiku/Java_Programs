/**
 * static final blank variable
 */
package com.javaFinalKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote static final blank variable:
 * @implNote 1. The static final blank variable is a variable which is not
 *           initialized at the time of declaration.
 * @implNote 2. The static final blank variable is initialized at time of
 *           declaration or in static block.
 */
public class Static_Blank_Final_Variable
{
	static final String PAN_CARD_NUMBER;

	static
	{
		PAN_CARD_NUMBER = "AQWER3421WS";
	}

	void display()
	{
		System.out.println("Pan Card Number Is: " + PAN_CARD_NUMBER);
	}

	public static void main(String[] args)
	{
		new Static_Blank_Final_Variable().display();
	}
}
