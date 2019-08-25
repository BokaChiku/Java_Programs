/**
 * Java Convert long to int
 */
package com.javaLongtoint;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java Convert long to int
 * @implNote -> We can convert long to int in java using typecasting. To convert
 *           higher data type into lower, we need to perform typecasting.
 *           Typecasting in java is performed through typecast operator
 *           (datatype).
 */
public class LongToIntExample2
{
	public static void main(String[] args)
	{
		Long l = new Long(1050);
		int i = l.intValue();
		System.out.println("Integer value: " + i);
	}
}
