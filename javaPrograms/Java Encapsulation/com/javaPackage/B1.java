/**
 * Example of Package Importing...
 */
package com.javaPackage;

import com.javaPackagePack.*;

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
 * @implNote By using import keyword;
 * @implNote -> Only declared class will be accessible if it's visiblity is
 *           public.
 */
public class B1
{
	public static void main(String[] args)
	{
		A1 obj = new A1();
		obj.message();
	}
}
