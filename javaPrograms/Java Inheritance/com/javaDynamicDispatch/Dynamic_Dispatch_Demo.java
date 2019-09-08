/**
 * 
 */
package com.javaDynamicDispatch;

/**
 * @author Kunal
 * @since 2019
 * @implNote Dynamic Dispatch Method
 */
class A
{
	void callMe()
	{
		System.out.println("Class A method..");
	}
}

class B extends A
{
	void callMe()
	{
		System.out.println("Class B method..");
	}
}

class C extends A
{
	void callMe()
	{
		System.out.println("Class C method..");
	}
}

public class Dynamic_Dispatch_Demo
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		C c = new C();
		A r;
		r = a;
		r.callMe();
		r = b;
		r.callMe();
		r = c;
		r.callMe();
	}
}
