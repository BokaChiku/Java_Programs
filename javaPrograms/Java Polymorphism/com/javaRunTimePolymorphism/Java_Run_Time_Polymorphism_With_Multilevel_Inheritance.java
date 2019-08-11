/**
 * Java RunTime Polymorphism With Multilevel Inheritance
 */
package com.javaRunTimePolymorphism;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java RunTime Polymorphism With Multilevel Inheritance
 */

class AnimalClass
{
	void eat()
	{
		System.out.println("Eating..");
	}
}

class DogClass extends AnimalClass
{
	void eat()
	{
		System.out.println("Eating Egg..");
	}
}

class BabyDogClass extends DogClass
{
	void eat()
	{
		System.out.println("Eating Drink..");
	}
}

public class Java_Run_Time_Polymorphism_With_Multilevel_Inheritance
{
	public static void main(String[] args)
	{
		AnimalClass A1, A2, A3;
		A1 = new DogClass();
		A1.eat();
		A2 = new BabyDogClass();
		A2.eat();
		A3 = new AnimalClass();
		A3.eat();
	}
}
