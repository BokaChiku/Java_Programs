/**
 * Java Nested Switch Statement
 */
package com.javaSwitch;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Wc can use switch statementr inside other switch statement.It is
 *           also known as nested switch statements.
 */
public class Nested_Switch
{
	public static void main(String[] args)
	{
		// c = CSE, e = ECE, m = Mechanical
		char branch = 'c';
		int year = 4;
		switch (year)
		{
			case 1:
				System.out.println("English, Marathi and Science.");
				break;

			case 2:
				switch (branch)
				{
					case 'C':
					case 'c':
						System.out.println("Operating System, Java, data Structure");
						break;

					case 'e':
					case 'E':
						System.out.println("Micro processor");
						break;

					case 'm':
					case 'M':
						System.out.println("Drawing");
						break;

					default:
						System.out.println("No branch matching..");
						break;
				}
				break;

			case 3:
				switch (branch)
				{
					case 'C':
					case 'c':
						System.out.println("Multi Media");
						break;

					case 'e':
					case 'E':
						System.out.println("CTS");
						break;

					case 'm':
					case 'M':
						System.out.println("Mechanical DDV");
						break;

					default:
						System.out.println("No branch matching..");
						break;
				}
				break;

			case 4:
				switch (branch)
				{
					case 'C':
					case 'c':
						System.out.println("PHP");
						break;

					case 'e':
					case 'E':
						System.out.println(".Net");
						break;

					case 'm':
					case 'M':
						System.out.println("C");
						break;

					default:
						System.out.println("No branch matching..");
						break;
				}
				break;

			default:
				System.out.println("Year not matched..");
				break;
		}
	}
}
