/**
 * Proving this keyword
 */
package com.javaThisKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote -> The this keyword refers to the current class instance variaable.
 * @implNote -> In this program we are printing reference variable and this,
 *           output of both variables are same.
 */
public class Proving_This_Keyword
{
	void display()
	{
		System.out.println(this);
	}

	public static void main(String[] args)
	{
		Proving_This_Keyword Obj = new Proving_This_Keyword();
		Obj.display();
		System.out.println(Obj);
	}
}
