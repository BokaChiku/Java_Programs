/**
 * Example of static variable
 */
package com.javaStaticKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Static keyword:
 * @implNote -> It is used for memory management mainly.
 * @implNote -> We can apply java static keyword with variables, methods, blocks
 *           and nested class.
 * @implNote -> The static keyword belongs to the class than an instance of the
 *           class.
 * @implNote
 * @implNote The static can be:
 * @implNote 1. Variable ( class variable)
 * @implNote 2. Method ( class method)
 * @implNote 3. Block
 * @implNote 4. Nested Class
 * @implNote
 * @implNote 1. java static variable:
 * @implNote -> If you declare any variable as static, it is known as a static
 *           variable.
 * @implNote -> The static variable can be used to refer to the common property
 *           of all objects, for example, the the company name of employee,
 *           college name of students, etc.
 * @implNote -> The static variable gets memory only once in the class area at
 *           the time of class loading.
 * @implNote Advantages of static variable:
 * @implNote -> It makes memory efficient.(i.e., it saves memory).
 * @implNote
 * @implNote Understanding the problem without static variable
 * @implNote class Student
 * @implNote {
 * @implNote int rollno;
 * @implNote String name;
 * @implNote String college = "ITS";
 * @implNote }
 * @implNote -> Suppose there are 500 students in my college, now all instance
 *           data members will get memory each time when the object is created.
 *           All students have its unique rollno and name, so instance data
 *           member is good in such case. Here, "college" refers to the common
 *           property of all objects. If we make it static, this field will get
 *           the memory only once.
 * @implNote -> Java static property is shared to all objects.
 */
public class Static_Variable
{
	int rollno; // instance variable
	String name;
	static String college = "IIT"; // static variable

	// constructor

	Static_Variable(int no, String name)
	{
		rollno = no;
		this.name = name;
	}

	// method to display the values
	void display()
	{
		System.out.println("Student Roll No is: " + rollno);
		System.out.println("Student Name is: " + name);
		System.out.println("Student College Name is: " + college);
	}

	public static void main(String[] args)
	{
		Static_Variable Obj = new Static_Variable(10, "Kunal");
		Obj.display();
		// Now We change the college name by using class name
		Static_Variable.college = "BVP";
		Static_Variable Obj2 = new Static_Variable(24, "Omkar");
		Obj2.display();
	}
}
