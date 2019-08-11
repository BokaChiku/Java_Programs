/**
 * 
 */
package com.javaEncapsulation;

/**
 * @author Kunal
 * @since 2019
 * @implNote Encapsulation that has only four fields with its setter and getter
 *           methds.
 */

// A Account class which is a fully encapsulated class.
// It has a private data member and getter and setter methods.
class Account
{
	// private data member
	private long accountNumber;
	private String name, email;
	private double amount;

	// public getter and setter methods

	public long getAccount()
	{
		return accountNumber;
	}

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public double getAmount()
	{
		return amount;
	}

	public void setAccount(long accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public void setNameEmail(String name, String email)
	{
		this.name = name;
		this.email = email;
	}

	public void setAmount(double amount)
	{
		this.amount = amount;
	}
}
