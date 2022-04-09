package com.createiq.arraylistex;

import java.util.ArrayList;
import java.util.List;

public class Comparing2ArrayLists {
	public static void main(String[] args) {
		List<String> l=new ArrayList<String>(  );
		l.add("mango");
		l.add("papaya");
		l.add("apple");
		l.add("banana");
		System.out.println(l);
		List<String> l1=new ArrayList<>();
		l1.add("kiwi");
		l1.add("guava");
		l1.add("orange");
		l1.add("pineapple");
		System.out.println(l1);
		boolean b=l.equals(l1);
		System.out.println(b);
		
		
		
	}
}
