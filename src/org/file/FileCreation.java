package org.file;

import java.io.File;

public class FileCreation {
	
	public static void main(String[] args) {
		
	
	File file =new File("D:\\excel");
	boolean mkdir = file.mkdir();
	
	System.out.println(mkdir);
	
	
	boolean mkdirs = file.mkdirs();
	
System.out.println(mkdirs);
	
	
	}
}
