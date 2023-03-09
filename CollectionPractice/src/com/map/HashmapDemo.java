package com.map;

import java.util.*;

public class HashmapDemo {

	public static void main(String[] args) {
		Map<String, Integer> hm=new HashMap<>();
		
		//Insertion
		hm.put("Ashutosh", 58);
		hm.put("Vivek", 67);
		hm.put("Rahul", 92);
		hm.put("Ajay", 82);
		
		System.out.println(hm);
		//Search
		if(hm.containsKey("Ashutosh")) {
			System.out.println("Present");
		}else
			System.out.println("Not Present");
		
		System.out.println(hm.get("Ashutosh"));
		System.out.println(hm.get("Amit"));
		for(Map.Entry<String, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		
		Set<String> kSet=hm.keySet();
		for(String str:kSet) {
			System.out.print(str+":"+hm.get(str));
		}

	}

}
