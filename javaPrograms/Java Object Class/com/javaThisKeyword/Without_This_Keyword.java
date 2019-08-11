/**
 * The problem without this keyword
 */
package com.javaThisKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote this keyword in java:
 * @implNote Usage of java this keyword:
 * @implNote 1. this can be used to refer current class instance variable.
 * @implNote 2. this can be used to invoke current class method (implicitly)
 * @implNote 3. this() can be used to invoke current class constructor.
 * @implNote 4. this can be used to passed as an argument in the method call.
 * @implNote 5. this can be passed as argument in the constructor call.
 * @implNote 6. this can be used toreturnm the current class instance from the
 *           method.
 * @implNote this: to refer current class instance variable:
 * @implNote -> The this keyword can be used to refer current class instance
 *           variable. Itf there is ambiguity between the instance variables and
 *           parameters, this keyword resolves the problem of ambiguity.
 */
public class Without_This_Keyword
{
	int rollNo;
	String name;
	float fee;

	Without_This_Keyword(int rollNo, String name, float fee)
	{
		rollNo = rollNo;
		name = name;
		fee = fee;
	}

	void display()
	{
		System.out.println("Roll No is: " + rollNo);
		System.out.println("Name is: " + name);
		System.out.println("Fee is: " + fee);

	}

	public static void main(String[] args)
	{
		Without_This_Keyword Obj = new Without_This_Keyword(10, "Kunal", 10.25F);
		Obj.display();
	}
}
