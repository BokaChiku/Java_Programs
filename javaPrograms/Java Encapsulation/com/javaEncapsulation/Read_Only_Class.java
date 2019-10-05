/**
 * Read Only Class
 */
package com.javaEncapsulation;

/**
 * @author Kunal
 * @since 2019
 * @implNote Read Only Class
 */

class Company
{
	private final String name = "Benchmark";

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name; // Compile Time Error
	}
}

public class Read_Only_Class
{
	public static void main(String[] args)
	{
		Company obj = new Company();
		obj.setName("Cognizent");
		System.out.println("Company Name: " + obj.getName());
	}
}
