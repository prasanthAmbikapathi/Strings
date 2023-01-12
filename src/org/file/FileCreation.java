package org.file;

import java.io.File;

public class FileCreation {
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void prasanth1() {

		System.out.println("prasanthgit");
	}
	
	private void karthik() {

		System.out.println("karthik git");
	}
	
	public static void main(String[] args) {
		
	
	File file =new File("D:\\excel");
	boolean mkdir = file.mkdir();
	
	System.out.println(mkdir);
	
	
	boolean mkdirs = file.mkdirs();
	
System.out.println(mkdirs);
	
	
	}
}
