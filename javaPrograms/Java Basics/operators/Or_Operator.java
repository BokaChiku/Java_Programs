/**
 * Java OR Operator Example: Logical || and Bitwise |
 */
package operators;

/**
 * @author Kunal24
 * @since 2019
 * @implNote 1.Logical ||
 * @implNote -> It dosen't check second condition if first condition is true. It
 *           checks second condition only if first one is false.
 * @implNote 1.Bitwise |
 * @implNote -> It checks both condition whether first is condition is true or
 *           false.
 */
public class Or_Operator
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		int c = 20;
		System.out.println(a > b || a < c);// true || true = true
		System.out.println(a > b | a < c);// true | true = true
		// || Vs |
		System.out.println(a > b || a++ < c);// true || true = true
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a > b | a++ < c);// true | true = true
		System.out.println(a);// 11 because second condition is checked
	}
}
