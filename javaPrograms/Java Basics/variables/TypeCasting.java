/**
 * Java variable example: Typecasting
 */
package variables;

/**
 * @author Kunal24
 * @since 2019
 * @implNote Narrowing(Typecasting)
 */
public class TypeCasting
{
	public static void main(String[] args)
	{
		float numberf = 10.5F;
		// int number = numberf; // Compile time error
		int number = (int) numberf;
		System.out.println("Float Number: " + numberf);
		System.out.println("Integer Number: " + number);

	}
}
