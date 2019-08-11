/**
 * A real example of java method override
 */
package com.javaMethodOverrideing;

/**
 * @author Kunal
 * @since 2019
 * @implNote Real Example of java method override:
 * @implNote Bank is a class that provides functionality to get rate of
 *           interest.
 * @implNote For Example: SBI, ICICI and Axis bank could provides 8%, 7% and 6%
 *           rate of interest.
 */
class Bank
{
	int rateOfInterest()
	{
		return 0;
	}
}

class SBI extends Method_Override_Bank
{
	int rateOfInterest()
	{
		return 8;
	}
}

class ICICI extends Method_Override_Bank
{
	int rateOfInterest()
	{
		return 7;
	}
}

class Axis extends Method_Override_Bank
{
	int rateOfInterest()
	{
		return 6;
	}
}

public class Method_Override_Bank
{
	public static void main(String[] args)
	{
		SBI Obj = new SBI();
		ICICI Obj2 = new ICICI();
		Axis Obj3 = new Axis();
		System.out.println("SBI Bank Rate of Interest: " + Obj.rateOfInterest() + "%");
		System.out.println(Obj2.rateOfInterest() + "%");
		System.out.println(Obj3.rateOfInterest() + "%");
	}

}