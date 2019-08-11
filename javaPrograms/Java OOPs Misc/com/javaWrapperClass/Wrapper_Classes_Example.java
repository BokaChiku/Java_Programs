/**
 * 
 */
package com.javaWrapperClass;

/**
 * @author Kunal
 * @since 2019
 * @implNote Wrapper Classes
 */
public class Wrapper_Classes_Example
{
	public static void main(String[] args)
	{
		byte b = 10;
		short a = 20;
		int i = 30;
		long l = 40;
		float f = 0.23F;
		double d = 3.45D;
		char ch = 'c';
		boolean flag = true;

		// Autoboxing Conversion of primitive dtat type to object

		Byte by = Byte.valueOf(b);
		Short sh = Short.valueOf(a);
		Integer in = Integer.valueOf(i);
		Long lo = Long.valueOf(l);
		Float fl = Float.valueOf(f);
		Double dou = Double.valueOf(d);
		Character cha = Character.valueOf(ch);
		Boolean bool = Boolean.valueOf(flag);

		// Prinitingsh Converted Objects

		System.out.println(by);
		System.out.println(sh);
		System.out.println(in);
		System.out.println(lo);
		System.out.println(fl);
		System.out.println(dou);
		System.out.println(cha);
		System.out.println(bool);

		// Unboxing Converting from object to primitive data type

		byte byte1 = by.byteValue();
		short short1 = sh.shortValue();
		int int1 = in.intValue();
		long long1 = lo.longValue();
		float float1 = fl.floatValue();
		double double1 = dou.doubleValue();
		char char1 = cha.charValue();
		boolean boolean1 = bool.booleanValue();

		System.out.println(byte1);
		System.out.println(short1);
		System.out.println(int1);
		System.out.println(long1);
		System.out.println(float1);
		System.out.println(double1);
		System.out.println(char1);
		System.out.println(boolean1);

	}
}
