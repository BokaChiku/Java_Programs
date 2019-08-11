/**
 * Interface Inheritance
 */
package com.javaInterface;

/**
 * @author Kunal
 * @since 2019
 * @implNote Interface Inheritance
 */

interface Printable4
{
	public abstract void printable();
}

interface Showable2 extends Printable4
{
	public abstract void showable();
}

public class Interface_Inheritace implements Printable4, Showable2
{
	public void printable()
	{
		System.out.println("printing...");
	}

	public void showable()
	{
		System.out.println("showing...");
	}

	public static void main(String[] args)
	{
		new Interface_Inheritace().printable();
		new Interface_Inheritace().showable();
	}
}
