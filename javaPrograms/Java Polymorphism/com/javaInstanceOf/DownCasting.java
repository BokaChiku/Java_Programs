/**
 * Downcasting with instanceof Operator
 */
package com.javaInstanceOf;

/**
 * @author Kunal
 * @since 2019
 * @implNote When subclass type refer to parent class object it is known as
 *           downcasting. If we perform it directly it gives compiler error.
 * @implNote If we perform it by typecasting ClassCastException throws at run
 *           time.
 * @implNote If we use instanceof then downcasting is possible.
 * @implNote Dog d = new Animal(); // Compiler Error
 * @implNote If we perform dowuncasting by using typecasting then
 *           ClassCastException is thrown at run time.
 * @implNote Dog d= (Dog) new Animal;
 * @implNote It compilers successfully but ClassCastException will ocuur at run
 *           time exception.
 */

class Animal2
{

}

public class DownCasting extends Animal2
{

	static void method(Animal2 a2)
	{
		if (a2 instanceof DownCasting)
		{
			DownCasting Obj = (DownCasting) a2;
			System.out.println(Obj instanceof Animal2);
			System.out.println(Obj instanceof DownCasting);
		}
	}

	public static void main(String[] args)
	{
		Animal2 A2 = new DownCasting();
		DownCasting.method(A2);
	}
}
