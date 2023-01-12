package com.oopsInOne;

public class ClassOne implements Abst {
	public void TC_1() {
		System.out.println("ClassOne TC_1");
	}

	public void TC_1(int a,int b) {

		System.out.println(a+b);
	}

	@Override
	public void interfaceMethod() {
		System.out.println("interface method");
		
	}
}
