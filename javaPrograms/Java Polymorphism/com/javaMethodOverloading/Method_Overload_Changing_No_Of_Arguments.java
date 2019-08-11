/**
 * Method Overloading: chaning no of arguments Program. In this program with
 * first method add() performs addition of two numbers and second add method
 * performs addition of three numbers.
 */
package com.javaMethodOverloading;

/**
 * @author Kunal
 * @since 2019
 * @implNote Method Overloading in Java:
 * @implNote 1. If a class has multiple methods having same name but different
 *           in parameters, it is known as Method Overloading.
 * @implNote 2. If we have to perform only one operation, having same name of
 *           methods increase the readability of the program.
 * @implNote 3. Suppose we have to perform addition of the given numbers but
 *           there cab be any number of arguments, if you write method such as
 *           a(int num1, int num2) for two parameters, and b(int num1, int num2,
 *           int num3) for three paramemeters then it may be diffecult for you
 *           as well as other programmers to understand the behavior of the
 *           method because its name is different.
 * @implNote Advatnage of method overloading
 * @implNote -> It increase readability of the program.
 * @implNote
 * @implNote Different ways to overload the method:
 * @implNote 1. By changing number of arguments
 * @implNote 2. By changing the data type
 * @implNote
 * @implNote Note: In java, Method Overloading is not possible by changing the
 *           return type of the method only.
 */
public class Method_Overload_Changing_No_Of_Arguments
{
	void add(int number1, int number2)
	{
		System.out.println("Additvion of two number is: " + (number1 + number2));
	}

	void add(int number1, int number2, int number3)
	{
		System.out.println("Additvion of three number is: " + (number1 + number2 + number3));
	}

	public static void main(String[] args)
	{
		Method_Overload_Changing_No_Of_Arguments Obj = new Method_Overload_Changing_No_Of_Arguments();
		Obj.add(10, 20);
		Obj.add(10, 20, 30);
	}
}
