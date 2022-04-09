package com.createiq.beginnerslevel;

import java.util.HashSet;

public class ChaechEleInHashSet {
	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<>();
		h.add(2);
		h.add(10);
		h.add(20);
		h.add(1);
		h.add(3);
		h.add(2);
		System.out.println(h);
		if(h.contains(2)) {
			System.out.println("element is found");
		}else {
			System.out.println("element is not found");
		}
		
	}

}
