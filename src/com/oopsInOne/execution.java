package com.oopsInOne;

public class execution {


	public static void main(String[] args) {
		encap encap=new encap();
		encap.TC_1();
		encap.TC_1(10, 20);
		encap.ClassTwoTC_2();
		encap.setName("prasanth");
		String name = encap.getName();
		System.out.println(name);
		
		encap.setId(4056);
		int id = encap.getId();
		System.out.println(id);
		
		encap.setPhone(8098306881l);
		long phone = encap.getPhone();
		System.out.println(phone);
		
		encap.interfaceMethod();
		
	}

}
