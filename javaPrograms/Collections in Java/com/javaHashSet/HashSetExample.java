/**
 * 
 */
package com.javaHashSet;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Kunal
 */

class Employee
{
	int employyId;
	String name;
	String address;
	double salary;
	String position;

	Employee(int employyId, String name, String address, double salary, String position)
	{
		this.employyId = employyId;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.position = position;
	}
}

public class HashSetExample
{
	public static void main(String[] args)
	{
		Employee obj = new Employee(10, "Kunal", "Pune", 234.456D, "Software Test Engineer");
		HashSet<Employee> obj2 = new HashSet<Employee>();
		obj2.add(obj);
		Iterator<Employee> itr = obj2.iterator();
		while (itr.hasNext())
		{
			Employee emp = (Employee) itr.next();
			System.out.println(
					emp.employyId + " " + emp.name + " " + emp.address + " " + emp.salary + " " + emp.position);
		}

	}
}
