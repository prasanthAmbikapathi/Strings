package org.Test;

public class ExcepHand {
	
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		try {
			System.out.println(4/0);
		} catch (Exception e) {
			System.out.println("infinity");
		}
		finally {
			System.out.println("its an infinite value"
					+ "");
		}
		System.out.println(5);
		
	}

}
