package com.createiq.beginnerslevel;

import java.util.HashMap;

public class HashMapEmpty15 {
	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<>();
		h.put(5, "hyd");
		h.put(1, "sce");
		h.put(3, "bang");
		System.out.println(h);
		System.out.println(h.isEmpty());
	}

}
