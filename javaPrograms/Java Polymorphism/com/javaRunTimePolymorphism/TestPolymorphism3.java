/**
 * Java Runtime Polymorphism: Animal
 */
package com.javaRunTimePolymorphism;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Runtime Polymorphism: Animal
 */

class Animal
{
	void eat()
	{
		System.out.println("Eating...");
	}
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("Eating Meat/Chiken...");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("Eating Rat...");
	}
}

class Lion extends Animal
{
	void eat()
	{
		System.out.println("Eating Meat...");
	}
}

public class TestPolymorphism3
{
	public static void main(String[] args)
	{
		Animal A1 = new Dog();
		A1.eat();
		Animal A2 = new Cat();
		A2.eat();
		Animal A3 = new Lion();
		A3.eat();
	}
}
