/**
 * Wrapper Classes in Java Java program to convert primitive data types into
 * object
 */
package com.javaWrapperClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Wrapper Classes in Java
 * @implNote 1. It is used to convert primitive into object and object to
 *           primitive.
 * @implNote 2. Since java 5.0, autoboxing and unboxing feature convert
 *           primitive into object and object into primitive automatically, TThe
 *           automatic conversion from primitve into object is known as
 *           autoboxing.
 * @implNote
 * @implNote Use Wrapper Class in Java:
 * @implNote -> Changing the value in method: java only support call by value.
 *           So if we pass primitive value, it will not change original value.
 *           If we convert primitive into object, then we can change it.
 * @implNote -> Java Collection: Java collection framework with only object
 *           only. All collection classes framework()ArrayList, LinkedList,
 *           Hashset, Vector, TreeSet) deals with object only.
 * @implNote -> java.util.package: The java.util.package provides the utility
 *           classes to deal with object.
 * @implNote
 * @implNote The eight classes of the java.lang package are known as Wrapper
 *           Classes. The list of wrapper classes are below:
 * @implNote Primitive Type Wrapper Class
 * @implNote boolean Boolean
 * @implNote char Character
 * @implNote byte Byte
 * @implNote short Short
 * @implNote int Integer
 * @implNote long Long
 * @implNote float Float
 * @implNote double Double
 * @implNote
 * @implNote Autoboxing:
 * @implNote 1. Automatic conversiton of primitive data type into it's
 *           correspondiong wrapper class is known as autoboxing.
 * @implNote 2. For example: byte to Byte, short to Short, int to Integer, char
 *           to Character etc..
 */
public class Autoboxing
{
	public static void main(String[] args)
	{
		// Autoboxing Example of Converting int to Integer
		int i = 10;
		Integer number = Integer.valueOf(i);
		System.out.println(number);
		Integer number2 = i; // Compiler will write Integer.valueOf() automatically.
		System.out.println(number2);
	}
}
