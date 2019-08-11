/**
 * Default: If you don't provide any modifier, then it will be default. The
 * default modifier is accessible only within same package. It provides more
 * accessiblity than private. But is is more restrictive than public and
 * protected.
 */
package com.javaAcessModifiers2;

/**
 * @author Kunal
 * @since 2019
 * @implNote Access Modifiers In Java
 * @implNote -> There are two types of modifiers in java: Access Modifiers and
 *           Non-Access Modifiers.
 * @implNote 1. Access Modifers:
 * @implNote -> It specifies the accessibility or scope of a field, method,
 *           constructor or class.
 * @implNote -> We can change access level at field, method, constructor or
 *           class.
 * @implNote -> Four types of Access Modifiers:
 * @implNote 1. Default: Access level is only within the package. It can not be
 *           accessed from outside of package.
 * @implNote 2. If you don't specify any access level, then it'll be default by
 *           default.
 */

class A1
{
	void mesaage()
	{
		System.out.println("This is Default Method and Default Class !!");
	}
}
