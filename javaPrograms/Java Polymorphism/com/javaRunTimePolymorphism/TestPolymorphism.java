/**
 * Java Runtime Polymorphism: Bank
 */
package com.javaRunTimePolymorphism;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Runtime Polymorphism: Bank
 */
class Bank
{
	float getRateOfInterest()
	{
		return 0.0f;
	}
}

class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 8.4f;
	}
}

class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 7.3f;
	}
}

class Axis extends Bank
{
	float getRateOfInterest()
	{
		return 6.3f;
	}
}

public class TestPolymorphism
{
	public static void main(String[] args)
	{
		Bank B = new SBI();
		System.out.println("Rate of Interest: " + B.getRateOfInterest() + "%");
		Bank B1 = new ICICI();
		System.out.println("Rate of Interest: " + B1.getRateOfInterest() + "%");
		Bank B2 = new Axis();
		System.out.println("Rate of Interest: " + B2.getRateOfInterest() + "%");
	}
}
