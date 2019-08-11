/**
 * 
 */
package com.javaPackage;

/**
 * @author Kunal
 * @since 2019
 * @implNote Importing Package Emaple...
 * @implNote How to access package from another package?
 * @implNote 1. By using import keyword.
 * @implNote Example: import com.javaPackagePack.*; // Access all classes
 * @implNote 2. By using importpackage.classname;
 * @implNote Example: import com.javaPackagePack.A;
 * @implNote 3. fully qaulified name
 * @implNote
 * @implNote fully qaulified name
 * @implNote -> If you use fully qualified name then only declared class of the
 *           package is accessible. Now there is no need to import package. It
 *           is generally used when two package have same name.
 * @implNote
 * @implNote Note: If you import package, then subpackages will not be imported.
 * @implNote -> If you import package then classes and interface of that package
 *           will import not its sub package classes and interface.
 * @implNote
 * @implNote
 * @implNote Note: Sequence of program must be package then import then class.
 * @implNote
 * @implNote package -> import -> class
 *           
 */
public class B2
{
	public static void main(String[] args)
	{
		com.javaPackagePack.A2 obj = new com.javaPackagePack.A2();
		obj.message();
	}
}
