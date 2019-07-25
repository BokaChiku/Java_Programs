/**
 * Java Left Shift Operator
 */
package operators;

/**
 * @author Kunal24
 * @since 2019
 * @implNote The java left shift operator << is used to shift all of the bits in
 *           a value to the left side of a specified number of times.
 */
public class Left_Shift_Operator
{
	public static void main(String[] args)
	{
		System.out.println(10 << 2); // 10*2^2=10*4=40
		System.out.println(10 << 3); // 10*2^3=10*8=80
		System.out.println(10 << 4); // 10*2^4=10*16=160
		System.out.println(10 << 5); // 10*2^5=10*32=320

	}
}
