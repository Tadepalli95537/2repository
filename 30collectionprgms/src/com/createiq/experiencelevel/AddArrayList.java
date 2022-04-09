package com.createiq.experiencelevel;

import java.util.ArrayList;

public class AddArrayList { 
	public static void main(String[] args) {
		
	
	ArrayList<String> a=new ArrayList<>();
	a.add("banana");
	a.add("apple");
	a.add("kiwi");
	a.add("orange");
	System.out.println(a);
	for(String s:a) {
		System.out.println(s);
	}
	a.add(2,"papaya");
	a.add("grapes");
	System.out.println(a);
	for(String s:a) {
		System.out.println(s);
	}
		
	
	

}
}