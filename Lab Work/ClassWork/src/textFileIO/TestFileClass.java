/**
 * File: ch12/TestFileClass.java
 * Package: ch12
 * @author Christopher Williams
 * Created on: Apr 18, 2016
 * Last Modified: Jul 15, 2019
 * Description:  Show example of obtaining metadata from file  
 */

 import java.io.File;
 import java.util.Date;

public class TestFileClass {
	public static void main(String[] args) {
		File file = new File("TestFileClass.java");
		
		System.out.println("Does it exist? " + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Is it absolute? " + file.isAbsolute());
		System.out.println("Is it hidden? " + file.isHidden());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		System.out.println("Last modified on " + new Date(file.lastModified()));
	}
}