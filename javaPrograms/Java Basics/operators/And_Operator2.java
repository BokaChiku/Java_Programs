/**
 * Java AND Operator Example: Logical && and Bitwise &
 */
package operators;

/**
 * @author Kunal24
 * @since 2019
 * @implNote 1.Logical &&
 * @implNote -> The logical && operator doesn't check second condition if first
 *           condition is false. t checks second cndition only if first one is
 *           true.
 * @implNote 2. Bitwise &
 * @implNote -> It checks both conditions whether first condition is true or
 *           false.
 */
public class And_Operator2
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a < b && a++ < c);// false && true = false
		System.out.println(a);// 10 (beccause second condition is not checked)
		System.out.println(a < b & a++ < c);// false && true = false
		System.out.println(a);// 11 (beccause second condition is checked)

	}
}
