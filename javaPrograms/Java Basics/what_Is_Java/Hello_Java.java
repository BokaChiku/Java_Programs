/**
 * First Java Program: Hello World Example
 */
package what_Is_Java;

/**
 * @author Kunal24
 * @since 2019
 * @implNote -> We can write simple java program after JDk installationin our
 *           system.
 * @implNote -> To create a simple java program, you need to create a class that
 *           contains the main method.
 * @implNote For Executing java program:
 * @implNote 1. Install JDK in your system
 * @implNote 2. Set path of JDK in Bin or environmental variable.
 * @implNote 3. Create the java program
 * @implNote 4. Complie and run java program.
 * @implNote 5. save file name as class name i.e Hello_Java
 * @implNote 6. To Compile: javac Hello_Java.java
 * @implNote 7. To execute: java Hello_Java
 * @implNote -> When we compile Java Program using javac command, java compiler
 *           covert the source code into byte code.
 * @implNote -> Paramenters used in program:
 * @implNote 1. class keyword is used to declare a class in java.
 * @implNote 2. public keyword is an access modifier which represent visibility.
 *           It means it is visible to all.
 * @implNote 3. static is a keyword. If we declare any method as static, it is
 *           known as static method.The core advantage of static method is there
 *           is no need to create and object to invoke the static method. The
 *           main megthod is executed by JVM, so it dosen't require to create an
 *           object to invoke the main method.
 * @implNote 4. void is return type of method. It doesn't return any value.
 * @implNote 5. main represent the starting point of the program.
 * @implNote 6. main represents the starting point of the program.
 * @implNote 7. String[] args is used for command line argument.
 * @implNote 8. System.out.println() is used to print statement. Here System is
 *           a class, out is the object of PrintStream class, println() is the
 *           method of PrintStream class.
 */
public class Hello_Java
{
	// General main method
	/*
	 * public static void main(String[] args)
	 * {
	 * // Let's pirint "Hello World"
	 * System.out.println("Hello World");
	 * }
	 */

	/*
	 * // By changing sequence of the modifiers
	 * static public void main(String args[])
	 * {
	 * // Let's pirint "Hello World"
	 * System.out.println("Hello World");
	 * }
	 */

	/*
	 * The subscript notation in Java array can be used after type, before the
	 * variable or after variable
	 * 1. public static void main(String[] args)
	 * 2. public static void main(String []args)
	 * 3. public static void main(String args[])
	 */

	/*
	 * // Having a semicolon at the end of the class is optional in java.
	 * class A
	 * {
	 * static public void main(String... args)
	 * {
	 * // Let's pirint "Hello World"
	 * System.out.println("Hello World");
	 * };
	 * };
	 */

	/*
	 * Valid java main method signature:
	 * 1. final public static void main(String[] args)
	 * 2. final strictfp public static void main(String[] args)
	 */

	/*
	 * Invalid jaa main method signature:
	 * 1. public void main(String[] args)
	 * 2. static void main(String[] args)
	 * 3. public void static main(String[] args)
	 * 4. abstract public static void main(String[] args)
	 */

	/*
	 * We can provide var - args support to the main method by passing 3
	 * ellipses(dots)
	 */

	public static void main(String... args)
	{
		// Let's pirint "Hello World"
		System.out.println("Hello World");
	}

}
