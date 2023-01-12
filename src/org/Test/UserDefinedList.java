package org.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserDefinedList {
	public static void main(String[] args) {
		
		UdListPojo pojo=new UdListPojo();
		
		pojo.setid(07);
		pojo.setname("MSDoni");
		pojo.setemail("msd@gmail.com");
		
		UdListPojo poj=new UdListPojo();
		poj.setid(18);
		poj.setname("virat");
		poj.setemail("mahirat@gmail.com");
		
		List<UdListPojo> p= new ArrayList<UdListPojo>();
		p.add(pojo);
		p.add(poj);
		
		for (int i = 0; i < p.size(); i++) {
			
			 UdListPojo ids = p.get(i);
			 int getid = ids.getid();
			 System.out.println(getid);
			 
			 String getname = ids.getname();
			 System.out.println(getname);
			 
			 String getemail = ids.getemail();
			 System.out.println(getemail);
			 
			 
			 
	
			
		}
		
		
		
		
		
		
	}

}
