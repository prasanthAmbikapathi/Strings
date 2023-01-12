package com.palindrom;

public class Palindrom {
	public static void main(String[] args){

		String s="malayalam";
		String rev="";
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--){
		rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(rev.equalsIgnoreCase(s)){
		System.out.println("it is a palindrome");
		}
		else{

		System.out.println("its not palindrome");
		}
		}
}