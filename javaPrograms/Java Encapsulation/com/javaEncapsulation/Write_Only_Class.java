/**
 * Write Only Class
 */
package com.javaEncapsulation;

/**
 * @author Kunal
 * @since 2019
 * @implNote Write Only Class
 */

class Hospital
{
	public String name;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
}

public class Write_Only_Class
{
	public static void main(String[] args)
	{
		Hospital obj = new Hospital();
		obj.setName("Poona");
		System.out.println("Hospital Name is: " + obj.getName());
	}
}
