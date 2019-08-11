/**
 * Example Of Static Binding
 */
package com.javaStaticAndDynamicBinding;

/**
 * @author Kunal
 * @since 2019
 * @implNote Satic Binding:
 * @implNote 1. Connecting method call to method body is called connecting.
 * @implNote 2. Static Binding is also called as Early Binding.
 * @implNote 3. When type of the object is determined at compiled time, it is
 *           known as Static Binding.
 * @implNote
 * @implNote * Variable have type:
 * @implNote -> Each variable has a type, It may be primitive or non-primitive
 *           type.
 * @implNote Example: int data = 100;
 * @implNote
 * @implNote * Reference have a type:
 * @implNote class Dog
 * @implNote {
 * @implNote public static void main(String args[])
 * @implNote {
 * @implNote Dog d1; // Here d1 is type of Dog
 * @implNote }
 * @implNote }
 * @implNote
 * @implNote * Object have type:
 * @implNote An object is an instance of a particular java class and it's also
 *           instance of super class.
 * @implNote
 * @implNote class Animal
 * @implNote {
 * @implNote }
 * @implNote class Dog extends Animal
 * @implNote {
 * @implNote public static void main(String args[])
 * @implNote {
 * @implNote Dog d1 = new Dog();
 * @implNote }
 * @implNote }
 * @implNote Here d1 is instance of dog class but it's also instance of Animal
 * @implNote
 * @implNote Static Binding:
 * @implNote -> When the type of object is determine at compile time(by the
 *           compiler), it's called static binding.
 * @implNote -> If there is any final, static or final method in class then it
 *           is static binding.
 */

class Static_Binding
{
	private void run()
	{
		System.out.println("Static Binding Example !!");
	}

	public static void main(String[] args)
	{
		Static_Binding Obj = new Static_Binding();
		Obj.run();
	}
}
