/**
 * 
 */
package com.javaEncapsulation;

/**
 * @author Kunal
 * @since 2019
 * @implNote Real scenario of Encapsulation
 */

// A java class to tesgt the encapsulated class Account
public class TestAccount
{
	public static void main(String[] args)
	{
		// creating instance of Account class
		Account obj = new Account();
		// setting values through setter method
		obj.setAccount(1243524124);
		obj.setNameEmail("Kunal Chavan", "kunal24chavan@gmail.com");
		obj.setAmount(243456.78D);
		// getting values through getter methods
		System.out.println("Account Number is: " + obj.getAccount());
		System.out.println("Account Name is: " + obj.getName());
		System.out.println("Account Email is: " + obj.getEmail());
		System.out.println("Account Amount is: " + obj.getAmount());

	}
}
