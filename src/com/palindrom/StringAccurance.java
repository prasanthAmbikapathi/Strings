package com.palindrom;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringAccurance {
	public static void main(String[] args) {
		
		String s="karthick";
	Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
	
	for (int i = 0; i < s.length(); i++) {
		char Char = s.charAt(i);
		if (map.containsKey(Char)) {
			Integer integer = map.get(Char);
			map.put(Char, integer+1);
		}
		else {
			map.put(Char, 1);
			
		}
		
	}
	System.out.println(map);
	}

}
