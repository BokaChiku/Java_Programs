/**
 * What is blank or uninitialized final variable ?
 */
package com.javaFinalKeyword;

/**
 * @author Kunal
 * @since 2019
 * @implNote What is blank or uninitialized variable?
 * @implNote 1. A final variable which is not initialized at the time of
 *           declaration then it is called final variable.
 * @implNote 2. Blank Final Variable can be initialized only in constructor.
 */
public class BlankFinalVariable
{
	int id;
	String name;
	final String PAN_NUMBER; // The blank final field PAN_NUMBER may not have been initialized

}
