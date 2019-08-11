/**
 * Copyingvalues witthout constructor
 */
package com.javaConstructor;

/**
 * @author Kunal
 * @since 2019
 * @implNote Copying values without constructor:
 * @implNote -> We can copy the values of one object into another by assigning
 *           the objects values to another object.
 * @implNote -> In this case no need to create (copy) constructor.
 */
public class Copy_Values_Without_Construtor
{
	int studentID;
	String studentName;

	Copy_Values_Without_Construtor(int id, String name)
	{
		studentID = id;
		studentName = name;
	}

	Copy_Values_Without_Construtor()
	{

	}

	void display()
	{
		System.out.println(studentID + " " + studentName);
	}

	public static void main(String[] args)
	{
		Copy_Values_Without_Construtor Obj = new Copy_Values_Without_Construtor(10, "Kunal");
		Obj.display();
		Copy_Values_Without_Construtor Obj2 = new Copy_Values_Without_Construtor();
		Obj2.studentID = Obj.studentID;
		Obj2.studentName = Obj.studentName;
		Obj2.display();
	}
}
