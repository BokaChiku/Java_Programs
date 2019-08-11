/**
 * Aggregation in Java
 */
package com.javaAggregation;

/**
 * @author Kunal
 * @since 2019
 * @implNote Aggregation in Java:
 * @implNote 1. If a class have an entity reference, it is known as Aggregation.
 *           Aggregation represents HAS-A relationship.
 * @implNote 2. Consider a situation, Employee object conatins many informations
 *           such as id, name, emailID etc. It contains one more object named
 *           address, which contains its own informations such as city, state,
 *           country, zipcode etc.
 * @implNote 3. class Employee
 * @implNote {
 * @implNote int id;
 * @implNote String name;
 * @implNote Address address; // Address is a class
 * @implNote ...
 * @implNote }
 * @implNote
 * @implNote In such case, Employee has an entity reference address, so
 *           relationship is Employee HAS-A address.
 * @implNote Why use Aggregation?
 * @implNote -> Code reuse is also best achived by aggregationn when there is no
 *           is-a relationship.
 */

class Operation
{
	int square(int n)
	{
		return n * n;
	}
}

public class Aggregation_Java
{
	Operation op; // Aggregation
	final double pi = 3.14;

	double area(int radius)
	{
		op = new Operation();
		int resquare = op.square(radius); // Code Reusablity
		return pi * resquare;
	}

	public static void main(String[] args)
	{
		Aggregation_Java Obj = new Aggregation_Java();
		double result = Obj.area(5);
		System.out.println(result);
	}

}
