package com.palindrom;

public class ReverseString {
	public static void main(String[] args) {
		String s="This is Karthik from cbe";
		String[] split = s.split(" ");
		for (String eachWord : split) {
			String rev="";
			
			for (int i = eachWord.length()-1; i>=0; i--) {
				
				char Char = eachWord.charAt(i);
				rev=rev+Char;
			}
			System.out.print(" "+rev);
		}
	}

}
