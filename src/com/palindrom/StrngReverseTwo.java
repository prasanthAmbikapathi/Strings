package com.palindrom;

public class StrngReverseTwo {
	public static void main(String[] args) {
		
		String s="My communication trainer name is Sangeetha";
		String rev="";
		for (int i = s.length()-1; i>=0; i--) {
			char charAt = s.charAt(i);
			rev=rev+charAt;
					
		}
		System.out.print(rev);
	}

}
