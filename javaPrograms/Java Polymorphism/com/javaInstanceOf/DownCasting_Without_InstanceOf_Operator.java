/**
 * Downcasting without the use of instanceof
 */
package com.javaInstanceOf;

/**
 * @author Kunal
 * @since 2019
 * @implNote Downcasting can also be performed with use of instanceof operator.
 */

class Animal3
{
	void run()
	{
		System.out.println("Hello Animal !!");
	}
}

public class DownCasting_Without_InstanceOf_Operator extends Animal3
{
	static void method(Animal3 A)
	{
		DownCasting_Without_InstanceOf_Operator Obj = (DownCasting_Without_InstanceOf_Operator) A;
		System.out.println(Obj instanceof Animal3);
		System.out.println(Obj instanceof DownCasting_Without_InstanceOf_Operator);
		Obj.run();
	}

	public static void main(String[] args)
	{
		Animal3 A = new DownCasting_Without_InstanceOf_Operator();
		DownCasting_Without_InstanceOf_Operator.method(A);
	}
}
