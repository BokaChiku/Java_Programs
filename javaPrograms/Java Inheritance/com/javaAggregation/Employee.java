/**
 * Aggregation Example Part 2
 */
package com.javaAggregation;

/**
 * @author Kunal
 * @since 2019
 * @implNote Understanding meaningful example of Aggregation
 */
public class Employee
{
	int id;
	String name;
	Address address;

	public Employee(int id, String name, Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void display()
	{
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.zipCode + " " + address.country);
	}

	public static void main(String[] args)
	{
		Address address1 = new Address("Pune", "MH", "India", "411042");
		Address address2 = new Address("Mumbai", "MH", "India", "411048");

		Employee emp1 = new Employee(10, "Kunal", address1);
		Employee emp2 = new Employee(101, "Omkar", address2);

		emp1.display();
		emp2.display();

	}
}
