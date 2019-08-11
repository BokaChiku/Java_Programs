/**
 * Real Scenario Of Abstract Class Bank
 */
package com.javaAbstractClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Bank Real Scenario
 */

abstract class Bank
{
	abstract float rateOfInterest();
}

class SBI extends Bank
{
	float rateOfInterest()
	{
		return 6.8F;
	}
}

class ICICI extends Bank
{
	float rateOfInterest()
	{
		return 7.8F;
	}
}

class Axis extends Bank
{
	float rateOfInterest()
	{
		return 5.4F;
	}
}

public class Real_Scenario_Of_Abstract_Class_Bank
{
	public static void main(String[] args)
	{
		SBI Obj = new SBI();
		System.out.println("SBI Rate Of Interest Is: " + Obj.rateOfInterest() + "%");
		ICICI Obj2 = new ICICI();
		System.out.println("ICICI Rate Of Interest Is: " + Obj2.rateOfInterest() + "%");
		Axis Obj3 = new Axis();
		System.out.println("Axis Rate Of Interest Is: " + Obj3.rateOfInterest() + "%");
	}
}
