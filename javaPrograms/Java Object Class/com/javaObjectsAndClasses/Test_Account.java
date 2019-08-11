/**
 * Java Program to demonstrate the working of a banking-system. Where we
 * deposite and Withdraw amount from our account. Creating an Account class
 * which has deposit() and withdraw() methods
 */
package com.javaObjectsAndClasses;

import java.util.Scanner;

/**
 * @author Kunal
 * @since 2019
 * @implNote Banking Sysytem
 */

class Bank
{
	int accountNumber;
	String accountName;
	String accountBranch;
	double totalAmount;
	double tempAmount;
	boolean flag = false;

	void insertData(int no, String name, String branch, double amount)
	{
		accountNumber = no;
		accountName = name;
		accountBranch = branch;
		totalAmount = amount;
	}

	void displayRecord()
	{
		System.out.println("Account Number is: " + accountNumber);
		System.out.println("Account Name is: " + accountName);
		System.out.println("Account Branch is: " + accountBranch);
		System.out.println("Account Total is: " + totalAmount);

	}

	double deposit(double amount)
	{
		if (amount > 0)
		{
			totalAmount += amount;
		}

		return totalAmount;
	}

	double withDraw(double amount)
	{
		tempAmount = totalAmount;
		if (amount > 0 && totalAmount > 3000)
		{
			totalAmount -= amount;
			if (totalAmount < 3000)
			{
				totalAmount = tempAmount;
			}
			else
				flag = true;

		}
		if (flag == true)
		{
			return totalAmount;

		}
		else
		{
			System.out.println("System Warning Account Limit is: 3000");
			return totalAmount;
		}
	}
}

public class Test_Account
{
	int accountNumber;
	int input;
	String accountName;
	String accountBranch;
	double totalAmount;
	double totalAmountPrevious = 0;
	double totalDeposite;
	double totalWithDraw;
	boolean flag = false;

	public static void main(String[] args) throws InterruptedException
	{

		Test_Account t1 = new Test_Account();
		Scanner scan = new Scanner(System.in);
		For:
		for (int i = 0; i <= 100000000; i++)
		{
			do
			{
				System.out.println("Please Enter Account Number: ");
				t1.accountNumber = scan.nextInt();
				if (t1.accountNumber == 10)
				{
					t1.flag = true;
					System.out.println("Please Enter Account Name: ");
					t1.accountName = scan.next();
					System.out.println("Please Enter Account Branch: ");
					t1.accountBranch = scan.next();
					System.out.println("Please Enter Account Total: ");
					t1.totalAmount = scan.nextDouble();
					break For;
				}
				else
				{
					System.out.println("You have entered incorrect account number. Expected account no is 10");
				}
			}
			while (t1.accountNumber == 10);
		}
		System.out.println("**********************************");
		t1.totalAmountPrevious = t1.totalAmount;
		Bank b1 = new Bank();
		if (t1.flag == true)
		{
			b1.insertData(t1.accountNumber, t1.accountName, t1.accountBranch, t1.totalAmountPrevious);
			b1.displayRecord();
			do
			{
				System.out.println();
				System.out.println("Welcome To The Bank !!");
				System.out.println("Press 1 for Current Balance.");
				System.out.println("Press 2 for Deposite.");
				System.out.println("Press 3 for Withdraw.");
				System.out.println("Press 0 for exit.");
				System.out.println("Press input: ");
				t1.input = scan.nextInt();
				switch (t1.input)
				{
					case 0:
						System.out.println("See you soon");
						System.out.println("Bye!!");
						break;
					case 1:
						System.out.println("Current Balance is: " + t1.totalAmountPrevious);
						break;
					case 2:
						System.out.println("Welcome to Deposite !!");
						System.out.println("Please Enter Amount you want to deposite:");
						t1.totalDeposite = scan.nextDouble();
						if (t1.totalDeposite > 0)
						{
							t1.totalAmountPrevious = b1.deposit(t1.totalDeposite);
						}
						break;
					case 3:
						System.out.println("Welcome to WithDraw !!");
						System.out.println("Current Balance is: " + t1.totalAmountPrevious);
						System.out.println("Please Enter Amount you want to Withdraw:");
						t1.totalWithDraw = scan.nextDouble();
						if (t1.totalWithDraw > 0 && t1.totalWithDraw < t1.totalAmountPrevious)
							if (t1.totalAmountPrevious >= 3000)
							{
								t1.totalAmountPrevious = b1.withDraw(t1.totalWithDraw);
							}
							else
							{
								System.out.println("You have reached minimum balance !!");
							}

						else
						{
							System.out.println(
									"WithDraw amount is greater than current balance or your balance is nill or you have enter 0");
						}
						break;
					default:
						System.out.println("Incorrect Input..");
				}
			}
			while (t1.input != 0);
		}
	}

}
