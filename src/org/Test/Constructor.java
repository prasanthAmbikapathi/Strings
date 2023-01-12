package org.Test;

public class Constructor {
	
	
	public Constructor(int age) {
		System.out.println("parameterized");
			
	}
	
	public Constructor() {
		System.out.println("non parameterized");
		
	}
	
	public static void main(String[] args) {
		
		Constructor c=new Constructor();
		Constructor d=new Constructor(26);
		
		
	}
	
}
