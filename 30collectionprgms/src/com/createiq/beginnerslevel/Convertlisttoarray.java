package com.createiq.beginnerslevel;

import java.util.ArrayList;

public class Convertlisttoarray {
	public static void main(String[] args) {
		ArrayList<String> l=new ArrayList<>();
		l.add("madhuri");
		l.add("shankar");
		l.add("himaja");
		l.add("abhijit");
		System.out.println(l);
		String names[]=l.toArray(new String[l.size()]);
		for(String s:names) {
			System.out.println(s);
		}
	}

}
