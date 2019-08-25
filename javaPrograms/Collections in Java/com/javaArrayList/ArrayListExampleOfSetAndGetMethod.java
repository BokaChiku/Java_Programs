/**
 * 
 */
package com.javaArrayList;

import java.util.ArrayList;

/**
 * @author Kunal
 * @since 2019
 * @implNote ArrayList example of set() and get() method
 */
public class ArrayListExampleOfSetAndGetMethod
{
	public static void main(String[] args)
	{
		 ArrayList<String> al=new ArrayList<String>();  
         al.add("Ravi");    
         al.add("Vijay");    
         al.add("Ajay");    
         System.out.println("Before update: "+al.get(1));   
         //Updating an element at specific position  
         al.set(1,"Gaurav");  
         System.out.println("After update: "+al.get(1));  
	}
}
