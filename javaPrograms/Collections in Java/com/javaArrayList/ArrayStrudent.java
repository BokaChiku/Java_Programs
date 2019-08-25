/**
 * 
 */
package com.javaArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Array List
 */
public class ArrayStrudent
{
	public static void main(String[] args)
	{
		int rollno;
		String name;
		int age;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Roll number: ");
		System.out.println("Please Enter name: ");
		System.out.println("Please Enter age: ");
		rollno = scan.nextInt();
		name = scan.next();
		age = scan.nextInt();
		scan.close();
		Student obj1 = new Student(rollno, name, age);
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(obj1);
		Iterator<Student> itr = list.iterator();
		while (itr.hasNext())
		{
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
