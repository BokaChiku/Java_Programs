/**
 * 
 */
package java_For_Loops;

/**
 * @author Kunal24
 * @since 2019
 * @implNote In programming language, loops are used to execute a set of
 *           instruction/function repeadedly when condition becom true.Types of
 *           loops:
 * @implNote -> for loop:
 * @implNote If the number of iteration is fixed, it is recommended to use for
 *           loop.
 * @implNote Syntax:
 * @implNote for(init;condition;inc/decr)
 * @implNote {
 * @implNote // Code to be exected here
 * @implNote }
 * @implNote Syntax for infinitive loop:
 * @implNote for(;;)
 * @implNote {
 * @implNote // code to be executed
 * @implNote }
 * @implNote -> while loop:
 * @implNote If the number of iteration is not fixed, it is recommended to use
 *           while loop.
 * @implNote Syntax:
 * @implNote while(condition)
 * @implNote {
 * @implNote // Code to be executed
 * @implNote }
 * @implNote Syntax for infinitive loop
 * @implNote while(true)
 * @implNote {
 * @implNote // Code to be executed
 * @implNote }
 * @implNote -> do-while loop:
 * @implNote If the number of iteration is not fixed and you must have to execte
 *           the loopat least once, it is recommended to use the
 *           do-while loop.
 * @implNote Syntax:
 * @implNote do
 * @implNote {
 * @implNote // Code to be executed
 * @implNote }while(condition);
 * @implNote Syntax for infinitive loop
 * @implNote do
 * @implNote {
 * @implNote // code to be executed
 * @implNote }while(true)
 * @implNote -> for-each Loop
 * @implNote It is used to traverse array or collection. It is easier to use
 *           than loop because we don't need increment and decrement the loop.It
 *           works on element basis not index.It return element one by one in
 *           the defined variable.
 * @implNote Syntax:
 * @implNote for(Type var:array)
 * @implNote {
 * @implNote // code to be executed
 * @implNote }
 * @implNote Java Labled For Loop ->
 * @implNote We can use name for each loop. To do so, we uselabel before the for
 *           loop.
 *           It is useful if we have nested for loop so that we can
 *           break/continue specific for loop.
 * @implNote Usually, break and continue keyword breaks/continues the innermost
 *           for loop only.
 * @implNote Syntax:
 * @implNote labelname:
 * @implNote for(initialization;condition;incr/decr)
 * @implNote {
 * @implNote // code to be executed
 * @implNote }
 * @implNote -> Java Infinitive For Loop
 * @implNote If you use two semicolons ;; in the for loop, it will be infinitive
 *           for loop.
 * @implNote Syntax:
 * @implNote for(;;)
 * @implNote {
 * @implNote // Code to be executed
 * @implNote }
 */
public class Infinitive_For_Loop
{
	public static void main(String[] args)
	{
		Infinitive_For_Loop Obj = new Infinitive_For_Loop();
		Obj.operation();
	}

	void operation()
	{
		for (;;)
		{
			System.out.println("Infinite");
		}
	}
}
