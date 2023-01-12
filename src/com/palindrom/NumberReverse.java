package com.palindrom;

public class NumberReverse {
	public static void main(String[] args){
		int number=9844263;
	
		String numbers = String.valueOf(number);
		int  rev=0;

		/*while(number>0){
		int n=number%10;

		rev=(rev*10)+n;

		 number/=10;


		}
		System.out.println(rev);
*/
		
		
		for (int i = numbers.length()-1; i >=0; i--) {
			System.out.print(numbers.charAt(i));
		}
		}

}
