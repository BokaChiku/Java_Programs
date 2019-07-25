/**
 * Java Unary Operator
 * Example: ++ and --
 */
package operators;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The java unary operators require only one operand. Unary operators
 *           are used to perform various operations i.e:
 * @implNote 1. incrementing/decrementing a value by one
 * @implNote 2. negating an expression
 * @implNote 3. inverting the value of boolean.
 */
public class Java_Unary_Operator
{
	public static void main(String[] args)
	{
		int x = 10;
		System.out.println("++x -> " + (++x));// 11
		System.out.println("x++ -> " + (x++));// 11 (12)
		System.out.println("x++ -> " + (x++));// 12 (13)
		System.out.println(x);
		System.out.println("--x -> " + (--x));// 12
		System.out.println("x-- -> " + (x--));// 12 (11)
		System.out.println("x-- -> " + (x--));// 11 (10)
		System.out.println(x);

	}
}
