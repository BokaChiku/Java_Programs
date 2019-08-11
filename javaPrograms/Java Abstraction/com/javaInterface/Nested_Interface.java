/**
 * Nested Interface in Java
 */
package com.javaInterface;

/**
 * @author Kunal
 * @since 2019
 * @implNote An interface can have another interface which is known as Nested
 *           Interface.
 */
public interface Nested_Interface
{
	public abstract void print();

	interface Interface
	{
		public abstract void show();
	}
}


