/**
 * Interface Example
 */
package com.javaInterface;

/**
 * @author Kunal
 * @since 2019
 * @implNote Interface in Java:
 * @implNote -> An interface in java is a bluprint of class.
 * @implNote -> It has static constatnt and abstract method.
 * @implNote -> It is used to achieve 100% abstraction in java.
 * @implNote -> There can be only abstract method in interface not method body.
 * @implNote -> It is used to achieve multiple inheritance in java.
 * @implNote -> Java interface also represent IS-A relationship.
 * @implNote -> It can not be instantiated like abstract class.
 * @implNote -> Since Java 8, we can have default and static method.
 * @implNote -> Since java 9, we can have private method in interface.
 * @implNote
 * @implNote Why use interface ?
 * @implNote 1. Used to achive abstraction(100%)
 * @implNote 2. To achive multiple inheritance
 * @implNote 3. It can be used to loose coupling.
 * @implNote
 * @implNote How to declare an interface?
 * @implNote -> An interface is decalred by using interface keyword.
 * @implNote -> It provides 100% abstraction
 * @implNote -> All methods in the interface are declared with empty body.
 * @implNote -> All fields are public, final and static by default.
 * @implNote -> A class that implements an interface must implements all methods
 *           declared in interface. Or either declare that class abstract.
 * @implNote
 * @implNote Syntax of Interface:
 * @implNote interface <interface_name>
 * @implNote {
 * @implNote // declare constant fields
 * @implNote // declare methods that are abstract
 * @implNote // by default.
 * @implNote }
 * @implNote
 * @implNote Note: Java compiler addes public and abstract by default in
 *           interface methods.
 * @implNote Example: void print(); => Compiler: public abstract void print();
 * @implNote Note: It adds public, final and static before data member.
 * @implNote Example: int MIN = 5; => Compiler: public static final int MIN = 5;
 * @implNote
 * @implNote The Relationship between Class:
 * @implNote 1. class extends class
 * @implNote 2. class implements interface
 * @implNote 3. interface extends interface
 */

interface Printable
{
	void print();
}

public class Interface_Example implements Printable
{
	public void print()
	{
		System.out.println("Interface Method Implements Here !!");
	}

	public static void main(String[] args)
	{
		new Interface_Example().print();
	}
}
