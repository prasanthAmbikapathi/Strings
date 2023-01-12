package com.palindrom;

public class StringCounts {
		public static void main(String[] args){
			String s="Sivaji @123 vaila Jilebi Adei Alla ";
			int upperCase =0;
			int lowerCase =0;
			int numericValues =0;
			int specialChar =0;

			System.out.println(s.length());
			for(int i=0;i<=s.length()-1;i++){
			char Char =s.charAt(i);

			if(Char>='A'&&Char<='Z'){
			upperCase++;
			}else
			if(Char>='a'&&Char<='z'){
			lowerCase ++;
			}else
			if(Char>='0'&&Char<='9'){
			numericValues ++;
			}
			else{
			specialChar++;
			}
			}
			System.out.println("upperCase="+upperCase);
			System.out.println("lowerCase ="+lowerCase );
			System.out.println("numericValues ="+numericValues );
			System.out.println("specialChar="+specialChar);
			}

}
