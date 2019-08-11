/**
 * Java RunTime Polymorphism With Multilevel Inheritance
 */
package com.javaRunTimePolymorphism;

/**
 * @author Kunal
 * @since 2019
 * @implNote BabyDogClass2 class is not overriden any method i.e eat() method,
 *           so eat() method is of DogClass2 is call.
 */

class AnimalClass2
{
	void eat()
	{
		System.out.println("Eating..");
	}
}

class DogClass2 extends AnimalClass2
{
	void eat()
	{
		System.out.println("Eating Egg..");
	}
}

class BabyDogClass2 extends DogClass2
{

}

public class Java_Run_Time_Polymorphism_With_Multilevel_Inheritance2
{
	public static void main(String[] args)
	{
		AnimalClass2 A2;
		A2 = new BabyDogClass2();
		A2.eat();
	}
}
