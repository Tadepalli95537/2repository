package com.createiq.beginnerslevel;

import java.util.HashSet;

import javax.print.DocFlavor.STRING;

public class addElsHashSet {
	public static void main(String[] args) {
		HashSet<String> h=new HashSet<>();
		h.add("banana");
		h.add("apple");
		h.add("kiwi");
		h.add("banana");
		System.out.println(h);
		for(String s:h) {
			System.out.println(s);
		}
		
	}

}
