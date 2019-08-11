/**
 * super is used to invoke parent class constructor
 */
package com.javaSuperKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote The super() can be used to invoke parent class constructor.
 * @implNote Note:
 * @implNote 1. super() is added in each class constructor automatically by
 *           compiler if there is no supre() or this().
 * @implNote 2. Default constructor is provided by compilerif there is no
 *           constructor. But, it also adds super() as the first statement.
 */

class ParentClass2
{
	ParentClass2()
	{
		System.out.println("Parent Class Constructor !!");
	}
}

public class Super_Used_To_Invoke_Parent_Class_Constructor extends ParentClass2
{
	Super_Used_To_Invoke_Parent_Class_Constructor()
	{
		super();
		System.out.println("Child Class Constructor !!");
	}

	public static void main(String[] args)
	{
		new Super_Used_To_Invoke_Parent_Class_Constructor();
	}
}
