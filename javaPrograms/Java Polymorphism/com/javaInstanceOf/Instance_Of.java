/**
 * Simple Example of Instance Of Operator
 */
package com.javaInstanceOf;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java InstanceOf:
 * @implNote 1. The java instance of operator is used to test whether the object
 *           is an instance of the specified class.(class or subclass or
 *           interface)
 * @implNote 2 The instanceof in java is also known as type comparison operator
 *           because is compare instance type. It returns either true or false.
 * @implNote 3. If we apply instanceof operator to any variable who has null
 *           value then it returns false value.
 */
public class Instance_Of
{
	public static void main(String[] args)
	{
		Instance_Of Obj = new Instance_Of();
		System.out.println(Obj instanceof Instance_Of); // It return true
	}
}
