/**
 * Java RunTime Polymorphism With Data member
 */
package com.javaRunTimePolymorphism;

/**
 * @author Kunal
 * @since 2019
 * @implNote Java RunTime Polymorphism With Data member
 * @implNote -> A method is overriden, noth the data member, so runtime
 *           polymorphism can not achived in data member.
 * @implNote -> Both classes have same data member speedlimit. We are accessing
 *           data memeber with the reference of parent class which refer to
 *           subclass object. Since we are accesssing the data member which is
 *           not overridden, hence it will access the data member of the Parent
 *           class.
 * @implNote Runtime Polymorphism is not achived by overriden data member.
 */
class Honda
{
	int speedLimit = 90;
}

public class Run_Time_Polymorphism_Data_Member extends Honda
{
	int speedLimit = 120;

	public static void main(String[] args)
	{
		Honda H1 = new Run_Time_Polymorphism_Data_Member();
		System.out.println("Speed Limit Is: " + H1.speedLimit);
	}
}
