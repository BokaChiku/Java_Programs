/**
 * Can we initialize blank final variable?
 */
package com.javaFinalKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Can we initialize blank final variable?
 * @implNote -> Yes, but only in constructor.
 */
public class Can_We_Initialize_Blank_Final_Variable
{
	int id;
	String name;
	final String PAN_CARD_NUMBER;

	Can_We_Initialize_Blank_Final_Variable(int id, String name, String PAN_CARD_NUMBER)
	{
		this.id = id;
		this.name = name;
		this.PAN_CARD_NUMBER = PAN_CARD_NUMBER;
	}

	void display()
	{
		System.out.println("Id is: " + id);
		System.out.println("Name is: " + name);
		System.out.println("Pan Card is: " + PAN_CARD_NUMBER);

	}

	public static void main(String[] args)
	{
		new Can_We_Initialize_Blank_Final_Variable(10, "Kunal", "AQJP767890").display();
		;
	}
}
