package org.Test;

import java.awt.List;
import java.util.ArrayList;

public class TaskList {

	public static void main(String[] args) {

		
		java.util.List li = new ArrayList();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(100);
		
		int size = li.size();
		//System.out.println(size);
		
		for (int i = 0; i < li.size()-5; i++) {
			Object object = li.get(i);
			System.out.println(object);
			
		}
		
		
		System.out.println("--------------");
	
		int total = li.size();

		
		for (int i = total/2;i<li.size()  ; i++) {
			Object object = li.get(i);
			
			System.out.println(object);
			
			
			
		}
		
		System.out.println("--------------");
		
			
		for (int i =total-(total/2); i<6; i++) {
			Object object = li.get(i);
			System.out.println(object);
			
		}
		
		
		
		
	}

}
