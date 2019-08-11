/**
 * Maintaining records of employees.
 */
package com.javaObjectsAndClasses;

/**
 * @author Kunal
 * @since 2019
 * @implNote Initializaing an object through methods.
 * @implNote In this example, we are creating two objects of Employee class and
 *           initializing the value to these objects by invoking insert()
 *           method.
 * @implNote We are displaying state (data) of the objects by invoking display()
 *           method.
 */

class Employee
{
	int employeeID;
	String employeeName;
	float employeeSalary;

	void insert(int id, String name, float salary)
	{
		employeeID = id;
		employeeName = name;
		employeeSalary = salary;
	}

	void display()
	{
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Employee Salary: " + employeeSalary);
	}

}

public class Test_Employee
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.employeeID = 10;
		e1.employeeName = "Kunal";
		e1.employeeSalary = 24000.56F;
		e1.insert(e1.employeeID, e1.employeeName, e1.employeeSalary);
		e1.display();
		e1.insert(20, "Satish", 50000.54F);
		e1.display();
		e2.employeeID = 30;
		e2.employeeName = "Harshal";
		e2.employeeSalary = 78000.56F;
		e2.insert(e2.employeeID, e2.employeeName, e2.employeeSalary);
		e2.display();
		e2.insert(40, "Sagar", 34000.43F);
		e2.display();
	}
}
