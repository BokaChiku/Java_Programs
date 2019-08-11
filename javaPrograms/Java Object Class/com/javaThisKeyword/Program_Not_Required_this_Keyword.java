/**
 * Program where this keyword is not required
 */
package com.javaThisKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Program where this keyword is not required:
 * @implNote -> If local variable(formal arguments) and instance variables are
 *           different, there is no need to use this keyword.
 */
public class Program_Not_Required_this_Keyword
{
	int rollNo;
	String name;
	float fee;

	Program_Not_Required_this_Keyword(int roll, String sName, float feeS)
	{
		rollNo = roll;
		name = sName;
		fee = feeS;
	}

	void display()
	{
		System.out.println("Roll No is: " + rollNo);
		System.out.println("Name is: " + name);
		System.out.println("Fee is: " + fee);
	}

	public static void main(String[] args)
	{
		Program_Not_Required_this_Keyword Obj = new Program_Not_Required_this_Keyword(10, "Kunal", 25.68f);
		Obj.display();
	}
}
