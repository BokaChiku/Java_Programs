/**
 * Can we execute a program without main() method?
 */
package com.javaStaticKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote Ans: NO
 * @implNote One of the ways was the static block, but it was possible till JDK
 *           1.6.
 * @implNote Since JDK 1.7, it is not possible to execute a java class without
 *           the main method.
 */
public class Execute_Program_Without_Main_Method
{
	static
	{
		System.out.println("static block is invoked !!");
		System.exit(0);
	}
}
/*
 * This program can't be execute because there is no main() method.
 */
