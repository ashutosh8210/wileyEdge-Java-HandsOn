package com.set;

import java.util.*;

public class HashsetDemo {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<>();
		
		set.add(23);
		set.add(43);
		set.add(43);
		set.add(62);
		set.add(12);
		
		System.out.println(set);
		
		if(set.contains(43)) {
			System.out.println("It contains 43");
		}
		
		if(!set.contains(6)) {
			System.out.println("It does not have 6");
		}
		
		set.remove(23);
		System.out.println(set);
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
