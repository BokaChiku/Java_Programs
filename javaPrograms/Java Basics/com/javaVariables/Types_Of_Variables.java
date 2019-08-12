/**
 * Types of variables.
 */
package com.javaVariables;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Java Variables: A variables is a container which holds the value
 *           while java program executed. A variable is assigned with datatype.
 * @implNote Vaiable is a name of memeory location.There are three types of
 *           variables in java: local, instance and static.
 * @implNote There are two types of data types in java: primitive and non -
 *           primitive.
 * @implNote Variable:
 * @implNote -> Variable is name of reserved area allocated in memeory. In other
 *           words, it is a name of memory location. It is compbination of"
 *           vary+able" that means its value can be changed.
 *           Example: int data = 50; // Here data is varaiable.
 * @implNote -> Types of variables
 * @implNote 1. local vaiable
 * @implNote 2. instance vaiable
 * @implNote 3. satic variable
 * @implNote -> Local Variable:
 * @implNote A vriable declared inside the body of the method is called local
 *           variable. You can use this variable only within that method. A
 *           local varibale can not be defined with "static" keyword.
 * @implNote -> Instance Varibale:
 * @implNote A vaiable declared inside the class but outside the body of the
 *           method, is called instance variable. It is not declared as static.
 *           It is called instance variable because its value is instance
 *           specific and is not shared among instances.
 * @implNote -> Static Variable:
 * @implNote A vraibale is declared as static is called static variable. It
 *           cannot be local. You can create single copy of static variable and
 *           shared among all instances of the class. Memory alocation for
 *           static varibales only happens only once when the class is loaded in
 *           the memory.
 */
public class Types_Of_Variables
{
	int data = 50; // instance variable

	static int number = 100; // static variable

	void method()
	{
		int A = 10;// Local Variables
		int B = 20;// Local Variables
		System.out.println("The value of A:" + A);
		System.out.println("The value of B:" + B);
		System.out.println("Addition of A and B is: " + (A + B));
	}

	public static void main(String[] args)
	{
		Types_Of_Variables Obj = new Types_Of_Variables();
		System.out.println(Obj.data); // Print instance variable
		System.out.println(number);// Print static variable
		Obj.method();// print local variables
	}
}
