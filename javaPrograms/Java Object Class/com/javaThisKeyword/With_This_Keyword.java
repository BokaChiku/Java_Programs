/**
 * With_This_Keyword
 */
package com.javaThisKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote With_This_Keyword:
 * @implNote -> Parameters (formal arguments) and instance variables are same.
 *           In this case we are using this keyword to distinguish local
 *           variable and instance variable.
 */
public class With_This_Keyword
{
	int rollNo;
	String name;
	float fee;

	With_This_Keyword(int rollNo, String name, float fee)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.fee = fee;
	}

	void display()
	{
		System.out.println("Roll No is: " + rollNo);
		System.out.println("Name is: " + name);
		System.out.println("Fee is: " + fee);
	}

	public static void main(String[] args)
	{
		With_This_Keyword Obj = new With_This_Keyword(10, "Kunal", 15.26F);
		With_This_Keyword Obj2 = new With_This_Keyword(11, "Kunal Chavan", 154.263F);
		Obj.display();
		Obj2.display();
	}
}
