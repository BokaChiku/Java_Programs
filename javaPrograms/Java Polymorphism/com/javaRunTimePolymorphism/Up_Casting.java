/**
 * Runtime Polymorphism
 */
package com.javaRunTimePolymorphism;

/**
 * @author Kunal
 * @since 2019
 * @implNote Polymorphism in Java:
 * @implNote -> Polymorphism in java is a concept by which we can perform a
 *           single action in different ways.
 * @implNote -> Polymorphism means "Many Forms".
 * @implNote -> There are two different types of polymorphism:
 * @implNote 1. Compile Time Polymorphism
 * @implNote 2. Run Time Polymorphism
 * @implNote
 * @implNote -> We can perform polymorphism in jav by using method overloading
 *           nad method overriding.
 * @implNote -> If you overload a static methiod in java, it is the example of
 *           compile time polymorphism.
 * @implNote
 * @implNote RunTimePolymorphism in Java
 * @implNote -> Runtime Polymorphism or Dynamic Method Dispatch is a process to
 *           call to an override method is resolved at runtime rather than
 *           compile time.
 * @implNote -> In this process, an override method is called through the
 *           reference variable of a superclass.
 * @implNote
 * @implNote UpCasting:
 * @implNote If the refrence variable of parent class refers to object of child
 *           class, it is as known as upcasting.
 * @implNote Example:
 * @implNote class A
 * @implNote {
 * @implNote
 * @implNote }
 * @implNote class B extends A
 * @implNote {
 * @implNote
 * @implNote }
 * @implNote
 * @implNote A Obj = new B(); // Upcasting
 * @implNote For upcasting, we can use the reference variable of class type or
 *           an interface type.
 * @implNote
 * @implNote interface I
 * @implNote {
 * @implNote
 * @implNote }
 * @implNote class A
 * @implNote {
 * @implNote
 * @implNote }
 * @implNote class B extends A implements I
 * @implNote {
 * @implNote
 * @implNote }
 * @implNote
 * @implNote Here Relationship of b class would be:
 * @implNote 1. B IS-A A
 * @implNote 2. B IS-A I
 * @implNote 3. B IS-A Object
 * @implNote Note: Object is root of all class that why we have type B IS-A
 *           Object
 * @implNote
 * @implNote We are creating two class Bike and Up_Casting. Up_Casting class
 *           extends Bike class and Override its run() method. We are calling
 *           run method by reference variable of parent class. Since it refers
 *           to subclass object and subclass method override the parent class
 *           method. The subclass method is invoked at runtime.
 */

class Bike
{
	void run()
	{
		System.out.println("Run Bike Smmothly !!");
	}
}

public class Up_Casting extends Bike
{
	void run()
	{
		// super.run();
		System.out.println("Up Casting Class !!");
	}

	public static void main(String[] args)
	{
		Bike A = new Up_Casting();
		A.run();
	}

}
