package com.palindrom;

public class StringSplit {
	public static void main(String[] args){
		String s="hi this is karthick";

		String[] split=s.split(" ");

		for(String eachWord: split){
		char firstLetter=eachWord.charAt(0);
		char upperCase=Character.toUpperCase(firstLetter);
		String remains=eachWord.substring(1);
		String total=upperCase+remains;
		System.out.print(" "+total);

		}

		}
}
