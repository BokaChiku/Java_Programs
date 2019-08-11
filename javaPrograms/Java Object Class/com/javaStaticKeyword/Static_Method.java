/**
 * Java static method
 */
package com.javaStaticKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote If you apply static keyword with any method, it is known as static
 *           method.
 * @implNote 1. A static method belongs to the class rather than the object of a
 *           class.
 * @implNote 2. A static method can be invoked without the need for creating an
 *           instance of a class.
 * @implNote 3. A static method can access static data member and can change the
 *           value of it.
 */
public class Static_Method
{
	int rollNo;
	String studentName;
	static String college = "BVP";

	Static_Method(int no, String name)
	{
		rollNo = no;
		studentName = name;
	}

	static void change()
	{
		college = "Abhinav";
	}

	void display()
	{
		System.out.println("Student Roll Number: " + rollNo);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student College Name: " + college);

	}

	public static void main(String... args)
	{
		Static_Method Obj = new Static_Method(10, "Kunal");
		Obj.display();
		Static_Method Obj2 = new Static_Method(10, "Kunal");
		Static_Method.change();
		Obj2.display();
	}
}
