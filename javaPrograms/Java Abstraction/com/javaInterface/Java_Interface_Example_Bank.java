/**
 * Java Interface Example Drawable
 */
package com.javaInterface;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Interface Example: Bank
 */

interface Bank
{
	public abstract void ratOfInterest();
}

class SBI implements Bank
{
	@Override
	public void ratOfInterest()
	{
		System.out.println("SBI Rate: " + "7.8%");
	}
}

class HDFC implements Bank
{
	@Override
	public void ratOfInterest()
	{
		System.out.println("HDFC Rate: " + "9.8%");

	}
}

public class Java_Interface_Example_Bank
{
	public static void main(String[] args)
	{
		new SBI().ratOfInterest();
		new HDFC().ratOfInterest();
	}
}
